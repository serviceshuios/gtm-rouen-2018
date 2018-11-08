-- phpMyAdmin SQL Dump
-- version 4.5.4.1deb2ubuntu2.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Ven 28 Septembre 2018 à 08:59
-- Version du serveur :  5.7.23-0ubuntu0.16.04.1
-- Version de PHP :  7.0.32-0ubuntu0.16.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `bovoyages`
--
CREATE DATABASE IF NOT EXISTS `bovoyages` DEFAULT CHARACTER SET utf8 COLLATE utf8_unicode_ci;
USE `bovoyages`;

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

DROP TABLE IF EXISTS `clients`;
CREATE TABLE `clients` (
  `pk_client` int(11) NOT NULL,
  `nom` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `clients`
--

TRUNCATE TABLE `clients`;
-- --------------------------------------------------------

--
-- Structure de la table `dates_voyages`
--

DROP TABLE IF EXISTS `dates_voyages`;
CREATE TABLE `dates_voyages` (
  `pk_date_voyage` int(11) NOT NULL,
  `date_depart` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `date_retour` datetime NOT NULL DEFAULT '0000-00-00 00:00:00',
  `prixHT` double NOT NULL DEFAULT '0',
  `fk_destination` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `dates_voyages`
--

TRUNCATE TABLE `dates_voyages`;
--
-- Contenu de la table `dates_voyages`
--

INSERT INTO `dates_voyages` (`pk_date_voyage`, `date_depart`, `date_retour`, `prixHT`, `fk_destination`) VALUES
(1, '2019-06-12 00:00:00', '2019-06-24 00:00:00', 359, 1),
(2, '2019-08-01 00:00:00', '2019-08-15 00:00:00', 1450, 1),
(3, '2019-09-03 00:00:00', '2019-09-15 00:00:00', 1420, 1),
(4, '2019-06-03 00:00:00', '2019-06-15 00:00:00', 1250, 2),
(5, '2019-07-08 00:00:00', '2019-07-18 00:00:00', 1300, 2),
(6, '2019-07-02 00:00:00', '2019-07-15 00:00:00', 1700, 3),
(7, '2019-11-12 00:00:00', '2019-11-25 00:00:00', 1890, 3),
(8, '2019-12-27 00:00:00', '2019-01-10 00:00:00', 2200, 4);

-- --------------------------------------------------------

--
-- Structure de la table `destinations`
--

DROP TABLE IF EXISTS `destinations`;
CREATE TABLE `destinations` (
  `pk_destination` int(11) NOT NULL,
  `region` varchar(50) NOT NULL DEFAULT '',
  `description` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `destinations`
--

TRUNCATE TABLE `destinations`;
--
-- Contenu de la table `destinations`
--

INSERT INTO `destinations` (`pk_destination`, `region`, `description`) VALUES
(1, 'Guadeloupe', 'Dans un site exceptionnel,en bordure d\'un petit lagon turquoise, tout est réuni pour un séjour paradisiaque. Découvrez merveilles de la grand terre et basse terre, les joies des plongées dans la réserve naturelle.'),
(2, 'Saint-Barthélémy', 'Imaginez une île où il fait 26 à 28 °C toute l\'année. Baignez vous dans une eau turquoise.'),
(3, 'Birmanie', 'La Birmanie est un pays passionnant pour tous ceux qui s’intéressent à l\'art, aux civilisations, à l;hindouisme. Ce pays s\'ouvre et a conservé toute la richesse de son patrimoine culturel. Visitez les temples, les marchés, ...'),
(4, 'Canada', 'Découvrez la nature généreuse et les grandes villes du Canada en toute saison, grâce aux nombreux circuits que nous avons élaborés.');

-- --------------------------------------------------------

--
-- Structure de la table `images`
--

DROP TABLE IF EXISTS `images`;
CREATE TABLE `images` (
  `image` varchar(50) NOT NULL DEFAULT '',
  `fk_destination` int(11) NOT NULL DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `images`
--

TRUNCATE TABLE `images`;
--
-- Contenu de la table `images`
--

INSERT INTO `images` (`image`, `fk_destination`) VALUES
('guadeloupe_1.jpg', 1),
('saint-barth_1.jpg', 2),
('saint-barth_2.jpg', 2),
('birmanie_1.jpg', 3),
('birmanie_2.jpg', 3),
('birmanie_3.jpg', 3),
('canada_1.jpg', 4),
('canada_2.jpg', 4);

-- --------------------------------------------------------

--
-- Structure de la table `voyages`
--

DROP TABLE IF EXISTS `voyages`;
CREATE TABLE `voyages` (
  `pk_voyage` int(11) NOT NULL,
  `region` text NOT NULL,
  `descriptif` text NOT NULL,
  `fk_client` int(11) DEFAULT NULL,
  `fk_dates_voyage` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `voyages`
--

TRUNCATE TABLE `voyages`;
-- --------------------------------------------------------

--
-- Structure de la table `voyages_voyageurs`
--

DROP TABLE IF EXISTS `voyages_voyageurs`;
CREATE TABLE `voyages_voyageurs` (
  `fk_voyage` int(11) NOT NULL,
  `fk_voyageur` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `voyages_voyageurs`
--

TRUNCATE TABLE `voyages_voyageurs`;
-- --------------------------------------------------------

--
-- Structure de la table `voyageurs`
--

DROP TABLE IF EXISTS `voyageurs`;
CREATE TABLE `voyageurs` (
  `pk_voyageur` int(11) NOT NULL,
  `civilite` varchar(5) NOT NULL,
  `nom` varchar(100) NOT NULL,
  `prenom` varchar(100) NOT NULL,
  `date_naissance` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Vider la table avant d'insérer `voyageurs`
--

TRUNCATE TABLE `voyageurs`;
--
-- Index pour les tables exportées
--

--
-- Index pour la table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`pk_client`);

--
-- Index pour la table `dates_voyages`
--
ALTER TABLE `dates_voyages`
  ADD PRIMARY KEY (`pk_date_voyage`),
  ADD KEY `pk_date_voyage` (`pk_date_voyage`);

--
-- Index pour la table `destinations`
--
ALTER TABLE `destinations`
  ADD PRIMARY KEY (`pk_destination`),
  ADD UNIQUE KEY `pk_destination` (`pk_destination`);

--
-- Index pour la table `voyages`
--
ALTER TABLE `voyages`
  ADD PRIMARY KEY (`pk_voyage`),
  ADD KEY `fk_client` (`fk_client`);

--
-- Index pour la table `voyages_voyageurs`
--
ALTER TABLE `voyages_voyageurs`
  ADD KEY `fk_voyage` (`fk_voyage`),
  ADD KEY `fk_voyageur` (`fk_voyageur`);

--
-- Index pour la table `voyageurs`
--
ALTER TABLE `voyageurs`
  ADD PRIMARY KEY (`pk_voyageur`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `clients`
--
ALTER TABLE `clients`
  MODIFY `pk_client` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `dates_voyages`
--
ALTER TABLE `dates_voyages`
  MODIFY `pk_date_voyage` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT pour la table `destinations`
--
ALTER TABLE `destinations`
  MODIFY `pk_destination` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT pour la table `voyages`
--
ALTER TABLE `voyages`
  MODIFY `pk_voyage` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT pour la table `voyageurs`
--
ALTER TABLE `voyageurs`
  MODIFY `pk_voyageur` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
