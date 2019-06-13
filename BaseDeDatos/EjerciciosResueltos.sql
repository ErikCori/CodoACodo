SELECT * 
FROM world.countrylanguage; /* * trae todas las columnas */
SELECT countrylanguage.language
FROM world.countrylanguage;

#Ejercicio 3
SELECT DISTINCT countrylanguage.language
FROM world.countrylanguage;

#Ejercicio 4
SELECT * 
FROM world.country;
SELECT city.name AS Nombre , city.population AS Poblacion
FROM world.city;

#Ejercicio 5
SELECT country.name AS Nombre , country.GNP AS 'Producto Bruto Nacional', ifnull(country.GNPold,0)  AS 'Producto Bruto Nacional Anterior', country.GNP - IFNULL(country.GNPold, 0) AS Diferencia
FROM world.country;

#Ejercicio 6
SELECT country.name , country.population, country.surfaceArea , (country.population / country.surfaceArea) AS Densidad
FROM world.country;

#Ejercicio 7
SELECT * 
FROM world.country 
ORDER BY country.population ASC;

#Ejercicio 8
SELECT countrylanguage.language
FROM world.countrylanguage
ORDER BY countrylanguage.language ASC;

#Ejercicio 9
SELECT 	city.name , city.population 
FROM world.city
ORDER BY city.population ASC 
LIMIT 20;

#Ejercicio 10
SELECT country.code, country.name, IFNULL(country.IndepYear, 0) AS IndepYear
FROM world.country
ORDER BY country.indepyear DESC ; 

#Ejercicio 11
SELECT country.name, country.continent, country.lifeExpectancy, country.surfaceArea
FROM world.country
ORDER BY country.lifeExpectancy DESC, country.surfaceArea ASC
LIMIT 100;

#Ejercicio 12
SELECT *
FROM world.country
WHERE country.population = 0;

#Ejercicio 13
SELECT *
FROM world.country
WHERE country.lifeExpectancy >75
ORDER BY country.lifeEXpectancy ASC;

#Ejercicio 14
SELECT *
FROM world.country
WHERE country.IndepYear >1850 AND country.GovernmentForm = 'constitutional monarchy';

#Ejercicio 15
SELECT *
FROM world.country
WHERE country.continent = 'Europe' 
ORDER BY country.GNP DESC
LIMIT 10;

#Ejercicio 16 
SELECT *
FROM world.country
WHERE country.name = country.localName;

#Ejercicio 17
SELECT *
FROM world.country
WHERE country.IndepYear  BETWEEN 1950 AND 1999;

#Ejercicio 18
SELECT *
FROM world.country
WHERE country.Continent IN ('Europe', 'Asia', 'South America');

#Ejercicio 19
SELECT *
FROM world.country
WHERE country.Continent != 'Africa';

#Ejercicio 20 
SELECT *
FROM world.city
WHERE city.CountryCode = 'ARG' && city.district !='Buenos Aires';

#Ejercicio 21 
SELECT *
FROM world.city
WHERE city.population BETWEEN 125000 AND 130000;

#Ejercicio 22
SELECT *
FROM world.country
WHERE country.IndepYear IS NULL;

#Ejercicio 23
SELECT *
FROM world.country
WHERE country.GNPOld IS NULL AND country.lifeExpectancy IS NULL;

#Ejercicio 24 
SELECT *
FROM world.country
WHERE country.name LIKE 'A%';

#Ejercicio 25
SELECT *
FROM world.country
WHERE country.name LIKE '% %';

#Ejercicio 26 
SELECT *
FROM world.city
WHERE city.name LIKE '%-%' OR city.district LIKE '%-%';

#Ejercicio 26_0

SELECT country.name AS Pais, city.name AS Capital 
FROM world.city , world.country
WHERE country.capital = city.id;

#Usando join
SELECT country.name AS 'PAIS', city.name AS 'CAPITAL'
FROM world.country INNER JOIN world.city
ON country.capital = city.id;

#Usando join con left 
SELECT country.name AS 'PAIS', city.name AS 'CAPITAL'
FROM world.country LEFT JOIN world.city
ON country.capital = city.id;

#Ejercicio 26_2 
SELECT country.name AS 'PAIS', city.name AS 'CAPITAL'
FROM world.country INNER JOIN world.city
ON country.capital = city.id
WHERE country.continent= 'South America';

#Ejercicio 27 
SELECT city.countryCode AS 'CODIGO', city.name AS 'CIUDAD', city.population AS 'POBLACION'
FROM world.country INNER JOIN world.city
ON city.countryCode = country.code
WHERE country.lifeExpectancy > 80;

#Ejercicio 28 
SELECT country.name AS 'PAIS' ,city.name AS 'CAPITAL'
FROM world.country INNER JOIN world.city
ON country.capital = city.id
WHERE country.governmentForm = 'Federal Republic';

#Ejercicio 29 
SELECT countryLanguage.language, country.name
FROM world.countrylanguage INNER JOIN world.country
ON countryLanguage.countryCode = country.code
WHERE (countryLanguage.isOfficial = 'T') AND(country.population BETWEEN 1000000 AND 3000000 );

#Ejercicio 30 
SELECT country.code, country.localName, country.region
FROM world.countrylanguage INNER JOIN world.country
ON countrylanguage.countryCode = country.code
WHERE countrylanguage.language = 'spanish';

#Ejercicio 31
SELECT country.name AS 'PAIS', city.name AS 'CAPITAL' 
FROM world.country INNER JOIN world.city
ON country.capital = city.id
WHERE city.population > (country.population / 2);

#Ejercicio 32
SELECT country.name AS 'PAIS', country.surfaceArea AS 'SUPERFICIE'
FROM world.country INNER JOIN world.city
ON country.capital = city.id
WHERE city.name = city.district 
AND country.continent = 'Africa';

#Ejercicio 33
SELECT country.name AS 'PAIS', city.name AS 'CAPITAL', ifnull(country.IndepYear, 0) AS 'AÑO DE INDEPENDENCIA'
FROM world.country INNER JOIN world.city
ON country.capital = city.id
WHERE country.IndepYear != 0
ORDER BY country.IndepYear ASC
LIMIT 20;

#Ejercicio 34
SELECT city.name AS 'nombre', countryLanguage.language
FROM (world.country INNER JOIN world.city #Relaciona tabla paises con la tabla ciudades
ON country.code = city.countryCode)INNER JOIN world.countryLanguage#De esta forma: codigo de pais es igua a codigoPais de tabla ciudad 
#Esa tabla de relacion relacionala con la tabla de lenguaje de paises
ON country.code = countryLanguage.countryCode#De esta forma : codigo de pais es igual a codigo de paies de la tabla lenguaje de paises
WHERE countryLanguage.language NOT IN('Spanish', 'English','Portuguese', 'Italian', 'French', 'German')# don el lengaje no sea ninguno de estos
AND countryLanguage.isOfficial = 'T';# y el leguaje sea oficial

#Ejercicio 35
SELECT city.name AS 'Ciudad', city.population, country.name AS 'Pais'
FROM (world.country INNER JOIN world.city
ON country.code = city.countryCode) INNER JOIN world.countrylanguage
ON country.code = countryLanguage.countryCode
WHERE countryLanguage.language = 'English'
AND country.continent = 'Europe'
ORDER BY city.population DESC
LIMIT 10;

#Ejercicico 36
SELECT SUM(country.population) AS 'Poblacion Total',
	MAX(country.population) AS 'Poblacion Maxima',
	MIN(country.population) AS 'Poblacion Minima',
	AVG(country.population) AS 'Poblacion Promedio',
	COUNT(country.population) AS 'Registros de Poblacion'
FROM world.country;

#Ejercicio 37
SELECT country.continent AS 'Continent',
	SUM(country.population) AS 'Poblacion Total',
	MAX(country.population) AS 'Poblacion Maxima',
    MIN(country.population) AS 'Poblacion Minima',
    AVG(country.population) AS 'Poblacion Promedio'
FROM world.country
GROUP BY country.continent; #GROUP BY Agrupa por un parametro especifico

#Ejercicio 38
SELECT country.continent AS 'Continent',
	COUNT(country.name) AS 'Cantidad de Naciones'
FROM world.country
GROUP BY country.continent;

#Ejercicio 39
SELECT city.countryCode AS 'Codigo de Pais',
	SUM(city.population) AS 'Cantidad de Habitantes'
FROM world.city 
GROUP BY city.countryCode;

#Ejercicio 40
SELECT countryLanguage.language AS 'Lenguaje', 
	MIN(countryLanguage.percentage) AS 'Porcentaje Minimo'
FROM world.countryLanguage
GROUP BY countryLanguage.language;

#Ejercicio 41
SELECT country.governmentForm AS 'Forma de gobierno',
	AVG(country.population) AS 'Promedio de Habitantes'
FROM world.country
WHERE country.continent = 'Europe'
GROUP BY country.governmentForm;