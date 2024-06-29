/* 1.  Write a function "coolCities" which takes an array of city Objects and returns a
 new array containing only those cities whose temperature is cooler than 70 degrees. */

const cities = [
  { name: 'Los Angeles', temperature: 60.0 },
  { name: 'Atlanta', temperature: 52.0 },
  { name: 'Detroit', temperature: 48.0 },
  { name: 'New York', temperature: 80.0 },
];

// const filterCoolCities = (citiesArr) => citiesArr.filter((city) => city.temperature < 70);

// console.log(filterCoolCities(cities));

// console.log(cities.filter((city) => city.temperature < 70));

/* 2. coolCities2:
 
Išfiltruotas masyvas, kur temperatūra mažiau nei 70 ir temperatūra nurodyta celsijumi. */

const filterCoolCities2 = (citiesArr) =>
  citiesArr
    .filter((city) => city.temperature < 70)
    .map((city) => {
      city.temperature = Math.floor(((city.temperature - 32) * 5) / 9);
      return city;
    });

console.log(filterCoolCities2(cities));
