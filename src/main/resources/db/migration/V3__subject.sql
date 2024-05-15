CREATE TABLE `subjecthyou` (
	`id` SERIAL NOT NULL COMMENT 'ID',
	`school_cd` CHAR(3),
	`cd` CHAR(3),
	`name` VARCHAR(20),
	PRIMARY KEY (`id`)
) ENGINE=InnoDB;