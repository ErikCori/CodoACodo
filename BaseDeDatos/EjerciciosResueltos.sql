SELECT * 
FROM world.countrylanguage; /* * trae todas las columnas */
SELECT countrylanguage.language
FROM world.countrylanguage;

/*Ejercicio 3*/
SELECT DISTINCT countrylanguage.language
FROM world.countrylanguage;

/*Ejercicio 4*/
SELECT * 
FROM world.country;
SELECT city.name AS Nombre , city.population AS Poblacion
FROM world.city;

/*Ejercicio 5*/
SELECT country.name AS Nombre , country.GNP AS 'Producto Bruto Nacional', ifnull(country.GNPold,0)  AS 'Producto Bruto Nacional Anterior', country.GNP - IFNULL(country.GNPold, 0) AS Diferencia
FROM world.country;

/*Ejercicio 6*/
SELECT country.name , country.population, country.surfaceArea , (country.population / country.surfaceArea) AS Densidad
FROM world.country;

/*Ejercicio 7*/
SELECT * 
FROM world.country 
ORDER BY country.population ASC;

/*Ejercicio 8*/
SELECT countrylanguage.language
FROM world.countrylanguage
ORDER BY countrylanguage.language ASC;

/*Ejercicio 9*/
SELECT 	city.name , city.population 
FROM world.city
ORDER BY city.population ASC 
LIMIT 20;

/*Ejercicio 10*/
SELECT country.code, country.name, IFNULL(country.IndepYear, 0) AS IndepYear
FROm world.country
ORDER BY country.indepyear DESC ; 

/*Ejercicio 11*/
SELECT country.name, country.continent, country.lifeExpectancy, country.surfaceArea
FROM world.country
ORDER BY country.lifeExpectancy DESC, country.surfaceArea ASC
LIMIT 100;

/*Ejercicio 12*/
SELECT *
FROM world.country
WHERE country.population = 0;

/*Ejercicio 13*/
SELECT *
FROM world.country
WHERE country.lifeExpectancy >75
ORDER BY country.lifeEXpectancy ASC;