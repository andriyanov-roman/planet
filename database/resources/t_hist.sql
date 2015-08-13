CREATE TABLE `hist` (
  `id` mediumint(9) NOT NULL AUTO_INCREMENT,
  `user_id` mediumint(9) NOT NULL,
  `product_id` mediumint(9) NOT NULL,
  `view_date` datetime NOT NULL,
  PRIMARY KEY (`id`),
  FOREIGN KEY (`user_id`) REFERENCES user(id),
  FOREIGN KEY (`product_id`) REFERENCES product(id)
);