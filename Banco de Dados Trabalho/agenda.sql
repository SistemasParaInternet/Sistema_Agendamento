-- phpMyAdmin SQL Dump
-- version 3.4.5deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tempo de Geração: 01/03/2013 às 19h10min
-- Versão do Servidor: 5.1.67
-- Versão do PHP: 5.3.6-13ubuntu3.9

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Banco de Dados: `db_exames`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `agenda`
--

CREATE TABLE IF NOT EXISTS `agenda` (
  `dataHora` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `idMedico` int(11) NOT NULL,
  `idExame` int(11) NOT NULL,
  `idPaciente` int(11) NOT NULL,
  `obs` text,
  `resultado` text,
  PRIMARY KEY (`dataHora`,`idMedico`,`idExame`,`idPaciente`),
  KEY `FK_MEDICO_AGENDA` (`idMedico`),
  KEY `FK_EXAME_AGENDA` (`idExame`),
  KEY `FK_PAC_AGENDA` (`idPaciente`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `agenda`
--

INSERT INTO `agenda` (`dataHora`, `idMedico`, `idExame`, `idPaciente`, `obs`, `resultado`) VALUES
('2013-03-01 17:37:56', 4, 5, 28, '', 'qweqwe'),
('2013-03-01 17:38:29', 4, 5, 28, 'WEQWE', 'qweqwe');

--
-- Restrições para as tabelas dumpadas
--

--
-- Restrições para a tabela `agenda`
--
ALTER TABLE `agenda`
  ADD CONSTRAINT `FK_EXAME_AGENDA` FOREIGN KEY (`idExame`) REFERENCES `exame` (`idExame`),
  ADD CONSTRAINT `FK_MEDICO_AGENDA` FOREIGN KEY (`idMedico`) REFERENCES `medico` (`idMedico`),
  ADD CONSTRAINT `FK_PAC_AGENDA` FOREIGN KEY (`idPaciente`) REFERENCES `paciente` (`idPaciente`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
