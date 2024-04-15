package com.example.iteam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.iteam.model.SchoolHyou;
import com.example.iteam.model.StudentHyou;
import com.example.iteam.service.SchoolService;
import com.example.iteam.service.StudentService;

import io.micrometer.common.lang.NonNull;
 

 
@Controller
public class MainController {

	@Autowired
	private SchoolService SchoolService;
	
	@Autowired
	private StudentService StudentService;
	
@GetMapping("/")
  public String index(Model model) {
    model.addAttribute("message", "こんにちは");
    return "top";
  }

@GetMapping("/tekitou/")
  public String index2(Model model) {
    model.addAttribute("message", "こんにちは");
    return "top2";
  }

@GetMapping("/touroku/")
  public ModelAndView add(SchoolHyou schoolhyou, ModelAndView model)  {
    model.addObject("schoolhyou", schoolhyou);
    model.setViewName("touroku");
    return model;
  }
@PostMapping("/schoolhyou/")
   public String schoolhyou(@Validated @ModelAttribute @NonNull SchoolHyou schoolhyou, RedirectAttributes result, ModelAndView model,
           RedirectAttributes redirectAttributes) {
      try {
           this.SchoolService.save(schoolhyou);
           redirectAttributes.addFlashAttribute("exception", "");

      } catch (Exception e) {
           redirectAttributes.addFlashAttribute("exception", e.getMessage());
      }
      return "redirect:/";
  }




@GetMapping("/touroku2/")
public ModelAndView add(StudentHyou studenthyou, ModelAndView model)  {
  model.addObject("studenthyou", studenthyou);
  model.setViewName("touroku2");
  return model;
}
@PostMapping("/studenthyou/")
 public String studenthyou(@Validated @ModelAttribute @NonNull StudentHyou studenthyou, RedirectAttributes result, ModelAndView model,
         RedirectAttributes redirectAttributes) {
    try {
         this.StudentService.save(studenthyou);
         redirectAttributes.addFlashAttribute("exception", "");

    } catch (Exception e) {
         redirectAttributes.addFlashAttribute("exception", e.getMessage());
    }
    return "redirect:/";
  }



@GetMapping("/itiran/")
public String index3(Model model) {
  model.addAttribute("StudentList" , StudentService.getStudentList() );
  return "itiran";
 }
}
