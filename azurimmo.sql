-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : lun. 26 mai 2025 à 08:31
-- Version du serveur : 10.4.32-MariaDB
-- Version de PHP : 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `azurimmo`
--

-- --------------------------------------------------------

--
-- Structure de la table `appartement`
--

CREATE TABLE `appartement` (
  `id` bigint(20) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `numero` int(11) DEFAULT NULL,
  `surface` float DEFAULT NULL,
  `batiment_id` bigint(20) DEFAULT NULL,
  `nbre_pieces` bigint(20) DEFAULT NULL,
  `nb_pieces_original` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `appartement`
--

INSERT INTO `appartement` (`id`, `description`, `numero`, `surface`, `batiment_id`, `nbre_pieces`, `nb_pieces_original`) VALUES
(1, 'Appartement de luxe', 65, 112, 1, NULL, NULL),
(2, 'Appartement duplex', 89, 52, 2, NULL, NULL),
(3, 'Appartement près des bois', 58, 50, 1, NULL, NULL),
(4, 'Appartement insolite', 666, 10, 1, NULL, NULL),
(5, 'Appartement en ville', 76, 62, 3, NULL, NULL),
(6, 'Appartement cosy', 1092, 500, 2, NULL, NULL),
(7, 'Appartement calme', 84, 95, 3, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `associe`
--

CREATE TABLE `associe` (
  `id` bigint(20) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `mail` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL,
  `date_naissance` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `associe`
--

INSERT INTO `associe` (`id`, `adresse`, `mail`, `nom`, `prenom`, `telephone`, `ville`, `date_naissance`) VALUES
(1, '15 rue jacques brel', 'associe@gmail.com', 'Associe', 'Monsieur', '0612345676', 'Creully', NULL),
(2, '63 impasse du four', 'associe@yahoo.com', 'Associee', 'Madame', '0665412336', 'Mulhouse', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `batiment`
--

CREATE TABLE `batiment` (
  `id` bigint(20) NOT NULL,
  `adresse` varchar(255) DEFAULT NULL,
  `ville` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `batiment`
--

INSERT INTO `batiment` (`id`, `adresse`, `ville`) VALUES
(1, '12 Rue du Chêne', 'Caen'),
(2, '25 Allée des Chevreuils', 'Saint-Lô'),
(3, '16 Rue des Champs', 'Villers-Bocage');

-- --------------------------------------------------------

--
-- Structure de la table `contrat`
--

CREATE TABLE `contrat` (
  `id` bigint(20) NOT NULL,
  `date_entree` date DEFAULT NULL,
  `date_sortie` date DEFAULT NULL,
  `montant_charges` float DEFAULT NULL,
  `montant_loyer` float DEFAULT NULL,
  `statut` varchar(255) DEFAULT NULL,
  `associe_id` bigint(20) DEFAULT NULL,
  `appartement_id` bigint(20) DEFAULT NULL,
  `locataire` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `contrat`
--

INSERT INTO `contrat` (`id`, `date_entree`, `date_sortie`, `montant_charges`, `montant_loyer`, `statut`, `associe_id`, `appartement_id`, `locataire`) VALUES
(1, '2025-01-01', '2025-01-24', 9000, 12, 'En cours', 1, 4, NULL),
(2, '2025-01-01', '2025-01-31', 900, 122, 'Fini', 1, 1, NULL),
(3, '2025-01-01', '2025-01-21', 89, 58, 'En cours', 2, 7, NULL),
(4, '2020-02-12', '2025-02-04', 206, 700, 'Fini', NULL, 1, NULL),
(5, '2014-12-01', '2030-08-01', 60, 500, 'En cours', NULL, 4, NULL),
(6, '2019-02-11', '2032-03-01', 80, 412, 'En cours', NULL, 7, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `garant`
--

CREATE TABLE `garant` (
  `id` bigint(20) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `intervenant`
--

CREATE TABLE `intervenant` (
  `id` bigint(20) NOT NULL,
  `nom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `intervention`
--

CREATE TABLE `intervention` (
  `id` bigint(20) NOT NULL,
  `date_inter` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `type_inter` varchar(255) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `appartement_id` bigint(20) DEFAULT NULL,
  `intervenant_id` bigint(20) DEFAULT NULL,
  `type_intervention_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `intervention`
--

INSERT INTO `intervention` (`id`, `date_inter`, `description`, `type_inter`, `date`, `appartement_id`, `intervenant_id`, `type_intervention_id`) VALUES
(1, '2025-02-20', 'changement des roulements de la porte de douche', 'réparation', NULL, NULL, NULL, NULL),
(2, '2025-02-01', 'débouchage évier suite à évacuation de graisses de fritures', 'maintenance', NULL, NULL, NULL, NULL),
(3, '2025-03-21', 'intervention', 'type intervention', NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `locataire`
--

CREATE TABLE `locataire` (
  `id` bigint(20) NOT NULL,
  `daten` date DEFAULT NULL,
  `lieun` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `date_naissance` date DEFAULT NULL,
  `lieu_naissance` varchar(255) DEFAULT NULL,
  `contrat_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `locataire`
--

INSERT INTO `locataire` (`id`, `daten`, `lieun`, `nom`, `prenom`, `date_naissance`, `lieu_naissance`, `contrat_id`) VALUES
(1, '2025-01-08', 'Caen', 'Loc', 'Aterre', NULL, NULL, NULL),
(2, '2025-01-25', 'Paris', 'Loca', 'T\'hair', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `paiement`
--

CREATE TABLE `paiement` (
  `id` bigint(20) NOT NULL,
  `date_paiement` date DEFAULT NULL,
  `montant` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `toit`
--

CREATE TABLE `toit` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `type_intervention`
--

CREATE TABLE `type_intervention` (
  `id` bigint(20) NOT NULL,
  `libelle` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `utilisateur`
--

CREATE TABLE `utilisateur` (
  `id` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Déchargement des données de la table `utilisateur`
--

INSERT INTO `utilisateur` (`id`, `email`, `nom`, `password`, `prenom`) VALUES
(1, 'j.doe@', 'DOE', '1234', 'John'),
(2, 'j.doe@', 'DOE', '$2a$10$phZXU/ZQ/S1Nq4zvVcI1v.BeqlP1.FygcoGgEw3HqJT09ej/7c3N2', 'John');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `appartement`
--
ALTER TABLE `appartement`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK5kn64l7l2m25kkryy4n50ikyb` (`batiment_id`);

--
-- Index pour la table `associe`
--
ALTER TABLE `associe`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `batiment`
--
ALTER TABLE `batiment`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `contrat`
--
ALTER TABLE `contrat`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKj40p46xa2cw18ynlgohbviwqd` (`associe_id`),
  ADD KEY `FK1ahw6ibj07960n52ulfdoc96g` (`appartement_id`),
  ADD KEY `FKfiu9667ouphp1yd3nouktd5wu` (`locataire`);

--
-- Index pour la table `garant`
--
ALTER TABLE `garant`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `intervenant`
--
ALTER TABLE `intervenant`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `intervention`
--
ALTER TABLE `intervention`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKf6nntanyntpovh90a0u2hbj9v` (`appartement_id`),
  ADD KEY `FK1gq45xrtd7j688juiuto7vs3x` (`intervenant_id`),
  ADD KEY `FKg80odl92m1wv1d2hml6t82wo8` (`type_intervention_id`);

--
-- Index pour la table `locataire`
--
ALTER TABLE `locataire`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FKhwuixmvoj4911t4j1rx7p7bqn` (`contrat_id`);

--
-- Index pour la table `paiement`
--
ALTER TABLE `paiement`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `toit`
--
ALTER TABLE `toit`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `type_intervention`
--
ALTER TABLE `type_intervention`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `appartement`
--
ALTER TABLE `appartement`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT pour la table `associe`
--
ALTER TABLE `associe`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `batiment`
--
ALTER TABLE `batiment`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT pour la table `contrat`
--
ALTER TABLE `contrat`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `garant`
--
ALTER TABLE `garant`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `intervenant`
--
ALTER TABLE `intervenant`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `intervention`
--
ALTER TABLE `intervention`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `locataire`
--
ALTER TABLE `locataire`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `paiement`
--
ALTER TABLE `paiement`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `toit`
--
ALTER TABLE `toit`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `type_intervention`
--
ALTER TABLE `type_intervention`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `utilisateur`
--
ALTER TABLE `utilisateur`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `appartement`
--
ALTER TABLE `appartement`
  ADD CONSTRAINT `FK5kn64l7l2m25kkryy4n50ikyb` FOREIGN KEY (`batiment_id`) REFERENCES `batiment` (`id`);

--
-- Contraintes pour la table `contrat`
--
ALTER TABLE `contrat`
  ADD CONSTRAINT `FK1ahw6ibj07960n52ulfdoc96g` FOREIGN KEY (`appartement_id`) REFERENCES `appartement` (`id`),
  ADD CONSTRAINT `FKfiu9667ouphp1yd3nouktd5wu` FOREIGN KEY (`locataire`) REFERENCES `locataire` (`id`),
  ADD CONSTRAINT `FKj40p46xa2cw18ynlgohbviwqd` FOREIGN KEY (`associe_id`) REFERENCES `associe` (`id`);

--
-- Contraintes pour la table `intervention`
--
ALTER TABLE `intervention`
  ADD CONSTRAINT `FK1gq45xrtd7j688juiuto7vs3x` FOREIGN KEY (`intervenant_id`) REFERENCES `intervenant` (`id`),
  ADD CONSTRAINT `FKf6nntanyntpovh90a0u2hbj9v` FOREIGN KEY (`appartement_id`) REFERENCES `appartement` (`id`),
  ADD CONSTRAINT `FKg80odl92m1wv1d2hml6t82wo8` FOREIGN KEY (`type_intervention_id`) REFERENCES `type_intervention` (`id`);

--
-- Contraintes pour la table `locataire`
--
ALTER TABLE `locataire`
  ADD CONSTRAINT `FKhwuixmvoj4911t4j1rx7p7bqn` FOREIGN KEY (`contrat_id`) REFERENCES `contrat` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
