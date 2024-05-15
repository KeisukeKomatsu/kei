CREATE TABLE `studenthyou` (
    `id` SERIAL NOT NULL COMMENT 'ID',
    `no` VARCHAR(10),
    `name` VARCHAR(10),
    `ent_year` INTEGER,
    `class_num` CHAR(3),
    `is_attend` BOOLEAN,
    `school_cd` CHAR(3),
    PRIMARY KEY (`id`)
) ENGINE=InnoDB;
