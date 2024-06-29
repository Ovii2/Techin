'use strict';

// 1 uzduotis
// let height = Number(prompt("Is kokio aukscio soka parasiutininkas?"));
// let time = Number(prompt("Per kiek sekundziu issikleidzia jo parasiutas"));

// let c = Math.sqrt((2 * height) / 9.8).toFixed(2);

// if ((isNaN(+height) && isNaN(+height)) || (height < 0 && time < 0)) {
//   alert("Enter valid number");
// } else {
//   if (c > time) {
//     alert(`Parasiutas issikleis `);
//   } else {
//     alert(`Parasiutas neissikleis `);
//   }
// }

// 2 uzduotis
// let frogWeight = Number(prompt('Kiek sveria varle?'));
// let frogCount = Number(prompt('Kiek varliu norima stebeti?'));

// let result = frogWeight * frogCount;

// if ((frogWeight < 0 && frogCount < 0) || (isNaN(+frogWeight) && isNaN(+frogCount))) {
//   console.log('Patikrinkite skaiciu');
// } else {
//   if (result > 5000 && result > 0) {
//     console.log(`Varliu stebejimui pakanka`);
//   } else {
//     console.log(`Varliu stebejimui per mazai`);
//   }
// }

// 3 uzduotis
// let grade1 = Number(prompt("Kokius pazymius gavo Petriukas?"));
// let grade2 = Number(prompt("Kokius pazymius gavo Petriukas?"));
// let grade3 = Number(prompt("Kokius pazymius gavo Petriukas?"));
// let grade4 = Number(prompt("Kokius pazymius gavo Petriukas?"));
// let grade5 = Number(prompt("Kokius pazymius gavo Petriukas?"));

// let avg = (grade1 + grade2 + grade3 + grade4 + grade5) / 5;
// console.log(avg);
// if (
//   grade1 <= 0 ||
//   (grade1 > 10 && grade2 <= 0) ||
//   (grade2 > 10 && grade3 <= 0) ||
//   (grade3 > 10 && grade4 <= 0) ||
//   (grade4 > 10 && grade5 <= 0) ||
//   grade5 < 10 ||
//   (isNaN(+grade1) &&
//     isNaN(+grade2) &&
//     isNaN(+grade3) &&
//     isNaN(+grade4) &&
//     isNaN(+grade5))
// ) {
//   alert(`Iveskite teigima skaicu`);
// } else {
//   if (avg > 9) {
//     alert(`Petriukas gaus tris saldainius`);
//   } else if (avg <= 9 && avg >= 7) {
//     alert(`Petriukas gaus du saldainius`);
//   } else {
//     alert(`Petriukas gaus viena saldaini`);
//   }
// }

// 4 uzduotis
// let priceA = +prompt('Iveskite kaina a');
// let priceB = +prompt('Iveskite kaina b');

// let quantityN1 = +prompt('Iveskite kiekius n1');
// let quantityN2 = +prompt('Iveskite kiekius n2');
// let quantityN3 = +prompt('Iveskite kiekius n3');

// let bunPrice = +prompt('Iveskite bandeles kaina');

// if (bunPrice <= priceA) {
//   console.log(`Uz bandeles bus sumoketa: ${(bunPrice * quantityN1).toFixed(2)}Lt`);
// } else if (bunPrice > priceA && bunPrice < priceB) {
//   console.log(`Uz bandeles bus sumoketa: ${(bunPrice * quantityN2).toFixed(2)}Lt`);
// } else {
//   console.log(`Uz bandeles bus sumoketa ${(bunPrice * quantityN3).toFixed(2)}Lt`);
// }
