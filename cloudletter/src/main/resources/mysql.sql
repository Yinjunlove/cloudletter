CREATE TABLE `upload` (
  `id` int(10) NOT NULL,
  `name` varchar(500) DEFAULT NULL,
  `path` varchar(500) DEFAULT NULL,
  `createdate` datetime DEFAULT NULL,
  `editdate` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
