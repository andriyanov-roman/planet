CREATE TABLE `user` (
  `id` mediumint(9) NOT NULL AUTO_INCREMENT,
  `login` varchar(15) NOT NULL,
  `password` varchar(15) NOt NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_login`(`id`) 
);

