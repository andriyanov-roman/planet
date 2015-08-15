CREATE TABLE `product` (
  `id` mediumint(9) NOT NULL AUTO_INCREMENT,
  `category_id` mediumint(9) NOT NULL,
  `name` varchar(25) NOT NULL,
  `price` DECIMAL(38,2),
  PRIMARY KEY (`id`),
  FOREIGN KEY (`category_id`) REFERENCES product_category(id)
);