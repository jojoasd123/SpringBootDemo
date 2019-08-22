CREATE TABLE `comment`
(
    `id`            bigint(20)    NOT NULL AUTO_INCREMENT,
    `parent_id`     bigint(20)    NOT NULL COMMENT '父类ID',
    `type`          int(11)       NOT NULL COMMENT '父类类型',
    `commentator`   bigint(20)    NOT NULL,
    `gmt_create`    bigint(20)    NOT NULL,
    `gmt_modified`  bigint(20)    NOT NULL,
    `like_count`    bigint(20) DEFAULT '0',
    `content`       varchar(1024) NOT NULL,
    `comment_count` bigint(20) DEFAULT '0',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 28
  DEFAULT CHARSET = utf8;

CREATE TABLE `notification`
(
    `id`            bigint(20)   NOT NULL AUTO_INCREMENT,
    `notifier`      bigint(20)   NOT NULL,
    `receiver`      bigint(20)   NOT NULL,
    `outerId`       bigint(20)   NOT NULL,
    `type`          int(11)      NOT NULL,
    `gmt_create`    bigint(20)   NOT NULL,
    `status`        int(11)      NOT NULL DEFAULT '0' COMMENT 'read or not read',
    `NOTIFIER_NAME` varchar(100) NOT NULL,
    `OUTER_TITLE`   varchar(256) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 5
  DEFAULT CHARSET = utf8;

CREATE TABLE `question`
(
    `id`            bigint(20) NOT NULL AUTO_INCREMENT,
    `title`         varchar(50)  DEFAULT NULL,
    `description`   longtext,
    `gmt_create`    bigint(20)   DEFAULT NULL,
    `gmt_modified`  bigint(20)   DEFAULT NULL,
    `creator`       bigint(20)   DEFAULT NULL,
    `comment_count` int(11)      DEFAULT '0',
    `view_count`    int(11)      DEFAULT '0',
    `like_count`    int(11)      DEFAULT '0',
    `tag`           varchar(256) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 18
  DEFAULT CHARSET = utf8;

CREATE TABLE `user`
(
    `id`           bigint(20) NOT NULL AUTO_INCREMENT,
    `account_id`   varchar(100) DEFAULT NULL,
    `name`         varchar(50)  DEFAULT NULL,
    `token`        char(80)     DEFAULT NULL,
    `gmt_create`   bigint(20)   DEFAULT NULL,
    `gmt_modified` bigint(20)   DEFAULT NULL,
    `avatar_url`   varchar(100) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 43
  DEFAULT CHARSET = utf8;