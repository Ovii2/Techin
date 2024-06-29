/* Given a temperature in Celsius, return the temperature in Fahrenheit. Write function `celsiusToFahrenheit`. */

// function celsiusToFarenheit(temp) {
//   const cToF = (temp * 9) / 5 + 32;
//   return `${temp}°C to Farenheit is ${cToF}°F`;
// }
// console.log(celsiusToFarenheit(30));

const celsiusToFahrenheit = (temp) => {
  const cToF = (temp * 9) / 5 + 32;
  return `${temp}°C to Farenheit is ${cToF}°F`;
};

console.log(celsiusToFahrenheit(30));
