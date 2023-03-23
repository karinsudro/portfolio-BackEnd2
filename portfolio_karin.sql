-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 15-03-2023 a las 22:21:29
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `portfolio_karin`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `about`
--

CREATE TABLE `about` (
  `id` int(11) NOT NULL,
  `foto` varchar(255) DEFAULT NULL,
  `saludoa` longtext DEFAULT NULL,
  `saludob` varchar(255) DEFAULT NULL,
  `saludoc` varchar(255) DEFAULT NULL,
  `saludod` varchar(255) DEFAULT NULL,
  `saludoe` varchar(255) DEFAULT NULL,
  `saludof` varchar(255) DEFAULT NULL,
  `saludog` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `about`
--

INSERT INTO `about` (`id`, `foto`, `saludoa`, `saludob`, `saludoc`, `saludod`, `saludoe`, `saludof`, `saludog`) VALUES
(1, 'https://i.ibb.co/hWm82N7/fotoBio2.jpg', '¡Hola! Yo soy Karin.', 'Me apasiona aprender y enseñar, la tecnología, el diseño y la astronomía.', 'Mi meta es crecer y afianzarme profesionalmente como', 'Desarrolladora Web Full Stack.', 'Busco formarme, estar actualizada, utilizando lo aprendido.', 'Soy una persona curiosa, responsable, creativa, empática, ávida por aprender y descubrir soluciones nuevas.', 'Me gustaría ser parte de un equipo y proyectos que me permitan seguir desarrollándome como profesional, mejorar mis habilidades y colaborar para lograr los objetivos.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `education`
--

CREATE TABLE `education` (
  `id` int(11) NOT NULL,
  `carrera` varchar(255) DEFAULT NULL,
  `inicio` varchar(11) DEFAULT NULL,
  `fin` varchar(11) DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `descripcion` longtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `education`
--

INSERT INTO `education` (`id`, `carrera`, `inicio`, `fin`, `institucion`, `descripcion`) VALUES
(1, 'Secundario', '1984', '1988', 'Instituto Modelo Hebreo Argentino \'Rambam\'', 'Trayectoria con especialización, bachiller con orientación pedagógica.'),
(2, 'Profesorado de Hebreo', '1990', '1993', 'Mijlelet Shazar', 'Carrera de profesora de hebreo nivel primario. Hice también materias intensivas en la Universidad de Tel Aviv, en Israel.'),
(3, 'Diseño Gráfico', '1991', '1994', 'ORT', 'Carrera terciaria de Diseño gráfico. Cursé en una época donde apenas empezaban a utilizarse las computadoras, el diseño era a mano y dedicarse al diseño web, inimaginable.'),
(4, 'Desarrolladora Full Stack Jr.', '2022', '2023', 'Argentina Programa', 'Programa para la formación de desarrolladores Full Stack, donde aprendí muchísimo sobre esta especialización que tanto me apasiona.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `expe_design`
--

CREATE TABLE `expe_design` (
  `id` int(11) NOT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `inicio` varchar(11) DEFAULT NULL,
  `fin` varchar(11) DEFAULT NULL,
  `lugar` varchar(255) DEFAULT NULL,
  `descripcion` longtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `expe_design`
--

INSERT INTO `expe_design` (`id`, `cargo`, `inicio`, `fin`, `lugar`, `descripcion`) VALUES
(1, 'Diseñadora gráfica', '1994', 'Actualidad', 'Trabajos varios', 'Trabajos varios de diseño gráfico, diseño editorial y web.'),
(2, 'Diseñadora gráfica', '2000', '2015', 'Asociación Amigos de la Astronomía', 'Diseño gráfico de algunos ejemplares de la revista institucional y especiales para número aniversario (cd, portada contenedor, revista).'),
(3, 'Diseñadora gráfica', '2020', '2021', 'TecnoDesign', 'Cambios en el código del sitio. Apertura y manejo de redes sociales.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `expe_teaching`
--

CREATE TABLE `expe_teaching` (
  `id` int(11) NOT NULL,
  `cargo` varchar(255) DEFAULT NULL,
  `inicio` varchar(11) DEFAULT NULL,
  `fin` varchar(11) DEFAULT NULL,
  `lugar` varchar(255) DEFAULT NULL,
  `descripcion` longtext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `expe_teaching`
--

INSERT INTO `expe_teaching` (`id`, `cargo`, `inicio`, `fin`, `lugar`, `descripcion`) VALUES
(1, 'Astronomía amateur', '2000', '2015', 'Asociación Amigos de la Astronomía', 'Investigación en fotografía electrónica (Meade). Visitas astronómicas guiadas para público general. Atención de contingentes escolares (visitas educativas).'),
(2, 'Docente de Hebreo', '2008', '2018', 'Escuela Tel Aviv', 'Docente de hebreo (área judaica) nivel primario. Enseñanza de la lectoescritura en el idioma. Armado de libros para practicar.'),
(3, 'Profesora de Computación', '2021', '2022', 'Escuela Dr.Hertz - Iona', 'Profesora de computación, programación y robótica de niños de 3 a 5 años. Enseñando pensamiento computacional, programación por bloques y otras aplicaciones. En el área de robótica, utilizando los equipos de Matatalab.'),
(4, 'Facilitadora Pedagógico Digital', '2011', 'Actualidad', 'GoINTEC (Ministerio de Educación C.A.B.A.)', 'Soy facilitadora pedagógico digital en nivel primario. Trabajo como par pedagógico del docente, planificando conjuntamente diversas actividades con incorporación de TIC. Capacito a niños y a adultos en el uso de las herramientas necesarias para los diferentes dispositivos y web.');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `hola` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `cargo` varchar(45) NOT NULL,
  `email` varchar(45) NOT NULL,
  `clave` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `persona`
--

INSERT INTO `persona` (`id`, `hola`, `nombre`, `apellido`, `cargo`, `email`, `clave`) VALUES
(1, '¡Hola! Yo soy', 'Karin', 'Suchowlanski Drobiner', 'Desarrolladora Web Full Stack Jr.', 'admin@portfolio.com', '123456789');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `project`
--

CREATE TABLE `project` (
  `id` int(11) NOT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `proyecto` varchar(255) DEFAULT NULL,
  `descripcion` longtext DEFAULT NULL,
  `live_url` varchar(255) DEFAULT NULL,
  `repo_url` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `project`
--

INSERT INTO `project` (`id`, `imagen`, `proyecto`, `descripcion`, `live_url`, `repo_url`) VALUES
(1, 'https://i.ibb.co/T0Ks8MM/portfolio-frente4.png', 'Portfolio personal', 'Armado de portfolio personal utilizando las herramientas aprendidas de FrontEnd y BackEnd para \'Argentina Programa\', 3ª cohorte.', '', ''),
(2, 'https://i.ibb.co/8N2Bq25/pelu-canina2.png', 'Peluquería canina', 'Armado de aplicación básica en Java que permite hacer un CRUD (o ABML).', NULL, 'https://github.com/karinsudro/peluqueria-canina.git');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `red`
--

CREATE TABLE `red` (
  `id` int(11) NOT NULL,
  `red` varchar(255) DEFAULT NULL,
  `icono` varchar(255) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `red`
--

INSERT INTO `red` (`id`, `red`, `icono`, `link`) VALUES
(1, 'GitHub', 'fa-brands fa-github fa-xl', 'https://github.com/karinsudro'),
(2, 'LinkedIn', 'fa-brands fa-linkedin fa-xl', 'https://www.linkedin.com/in/karin-sudro/'),
(3, 'Curriculum Vitae', 'fa-solid fa-file fa-xl', 'https://drive.google.com/file/d/1HVA1TZshHUlMAf6H4tn-EhgvqtOrCrqD/view?usp=share_link');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `skill`
--

CREATE TABLE `skill` (
  `id` int(11) NOT NULL,
  `skill_tipo` varchar(255) DEFAULT NULL,
  `skill` varchar(255) DEFAULT NULL,
  `icono` varchar(255) DEFAULT NULL,
  `progreso` int(11) DEFAULT NULL,
  `color` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `skill`
--

INSERT INTO `skill` (`id`, `skill_tipo`, `skill`, `icono`, `progreso`, `color`) VALUES
(1, 'FrontEnd', 'HTML 5', 'fa-brands fa-html5', 90, 'progress-bar-frontend'),
(2, 'FrontEnd', 'CSS 3', 'fa-brands fa-css3-alt', 90, 'progress-bar-frontend'),
(3, 'FrontEnd', 'JAVASCRIPT', 'fa-brands fa-square-js', 65, 'progress-bar-frontend'),
(4, 'FrontEnd', 'BOOTSTRAP', 'fa-brands fa-bootstrap', 90, 'progress-bar-frontend'),
(5, 'FrontEnd', 'ANGULAR', 'fa-brands fa-angular', 80, 'progress-bar-frontend'),
(6, 'BackEnd', 'MYSQL', 'fa-solid fa-database', 75, 'progress-bar-backend'),
(7, 'BackEnd', 'NETBEANS', NULL, 75, 'progress-bar-backend'),
(8, 'BackEnd', 'POSTMAN', NULL, 75, 'progress-bar-backend'),
(9, 'BackEnd', 'JAVA', 'fa-brands fa-java', 60, 'progress-bar-backend'),
(10, 'Design', 'PHOTOSHOP', NULL, 85, 'progress-bar-design'),
(11, 'Design', 'INDESIGN', NULL, 90, 'progress-bar-design'),
(12, 'Design', 'ILLUSTRATOR', NULL, 85, 'progress-bar-design'),
(13, 'Language', 'HEBREO', 'fa-solid fa-language', 95, 'progress-bar-language'),
(14, 'Language', 'INGLES', 'fa-solid fa-language', 90, 'progress-bar-language'),
(15, 'SofSkills', 'COLABORATIVA', 'fa-solid fa-hand-holding-hand', 85, 'progress-bar-soft'),
(16, 'SoftSkills', 'COMUNICATIVA', 'fa-regular fa-comments', 90, 'progress-bar-soft'),
(17, 'SoftSkills', 'EMPATICA', 'fa-solid fa-hand-holding-heart', 90, 'progress-bar-soft'),
(18, 'SoftSkills', 'AUTODIDACTA', 'fa-solid fa-book', 90, 'progress-bar-soft');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `about`
--
ALTER TABLE `about`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `education`
--
ALTER TABLE `education`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `expe_design`
--
ALTER TABLE `expe_design`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `expe_teaching`
--
ALTER TABLE `expe_teaching`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `project`
--
ALTER TABLE `project`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `red`
--
ALTER TABLE `red`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `skill`
--
ALTER TABLE `skill`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `about`
--
ALTER TABLE `about`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de la tabla `education`
--
ALTER TABLE `education`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `expe_design`
--
ALTER TABLE `expe_design`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `expe_teaching`
--
ALTER TABLE `expe_teaching`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `project`
--
ALTER TABLE `project`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `red`
--
ALTER TABLE `red`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `skill`
--
ALTER TABLE `skill`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
