USE `simpletodo`;

CREATE TABLE IF NOT EXISTS `task` (
  `id`           CHAR(36)     NOT NULL,
  `description`  VARCHAR(500) NOT NULL,
  `accomplished` INT(1)       NOT NULL DEFAULT '0',
  PRIMARY KEY (`id`),
  UNIQUE KEY `task_id_uindex` (`id`)
)
  ENGINE = InnoDB
  DEFAULT CHARSET = utf8;
