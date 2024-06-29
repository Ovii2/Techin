/* # Write a function "cityNames" which takes an array of city objects like the exercise above  and returns an array of the cities names. */

const cities = [
  { name: 'Los Angeles', temperature: 60.0 },
  { name: 'Atlanta', temperature: 52.0 },
  { name: 'Detroit', temperature: 48.0 },
  { name: 'New York', temperature: 80.0 },
];

const cityNames = (citiesArr) => citiesArr.map((cName) => cName.name);

console.log(cityNames(cities));
