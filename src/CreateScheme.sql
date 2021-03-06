CREATE TABLE `Category` (
  `CatId` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) NOT NULL,
  `Description` varchar(255) DEFAULT NULL,
  `ParentId` int(11) NOT NULL,
  `CreatedDTM` datetime DEFAULT CURRENT_TIMESTAMP,
  `ModifiedDTM` datetime DEFAULT NULL,
  `ChildId` int(11) NOT NULL,
  PRIMARY KEY (`CatId`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=latin1;

CREATE TABLE `Site` (
  `SiteId` int(11) NOT NULL AUTO_INCREMENT,
  `UserId` int(11) NOT NULL,
  `CatId` int(11) NOT NULL,
  `Name` varchar(64) NOT NULL,
  `Login` varchar(45) DEFAULT NULL,
  `SitePwd` varbinary(64) DEFAULT NULL,
  `SiteURL` varchar(256) DEFAULT NULL,
  `Notes` varchar(255) DEFAULT NULL,
  `CreatedDTM` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ModifiedDTM` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`SiteId`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

CREATE TABLE `User` (
  `UserId` int(11) NOT NULL AUTO_INCREMENT,
  `FirstName` varchar(45) NOT NULL,
  `LastName` varchar(45) NOT NULL,
  `Email` varchar(64) NOT NULL,
  `UserSalt` varbinary(45) NOT NULL,
  `CreatedDTM` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ModifiedDTM` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Password` varbinary(64) NOT NULL,
  PRIMARY KEY (`UserId`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=latin1;

CREATE TABLE `UserAppProfile` (
  `ProfileId` int(11) NOT NULL AUTO_INCREMENT,
  `CategoryRootId` int(11) DEFAULT NULL,
  `Login` varchar(64) NOT NULL,
  `LastLoginDTM` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `CreatedDTM` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `ModifiedDTM` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `UserId` int(11) DEFAULT '0',
  PRIMARY KEY (`ProfileId`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

