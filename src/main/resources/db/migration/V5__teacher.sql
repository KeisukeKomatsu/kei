CREATE TABLE `teacher` (
	`id` VARCHAR(10) NOT NULL COMMENT 'ID',
	`password` VARCHAR(30),
	`name` VARCHAR(10),
	`school_cd` CHAR(3),
	PRIMARY KEY (`id`)
) ENGINE=InnoDB;