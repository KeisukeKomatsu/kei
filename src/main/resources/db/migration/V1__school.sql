CREATE TABLE schoolhyou (
    `id` SERIAL NOT NULL COMMENT 'ID',
    `cd` VARCHAR(3),
    `name` VARCHAR(20),
    PRIMARY KEY (id)
) ENGINE=InnoDB;