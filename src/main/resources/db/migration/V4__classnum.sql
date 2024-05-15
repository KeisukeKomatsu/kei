CREATE TABLE `classnum` (
	`id` SERIAL NOT NULL COMMENT 'ID',
	`school_cd` CHAR(3),
	`class_num` VARCHAR(5),
	PRIMARY KEY (`id`)
) ENGINE=InnoDB;