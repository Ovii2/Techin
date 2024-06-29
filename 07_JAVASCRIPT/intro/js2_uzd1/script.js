'use strict';

// 1. Pamoka
// let mondayLessons = prompt("Kiek pamoku pirmadieni?", 0);
// let tuesdayLessons = prompt("Kiek pamoku antradieni?", 0);
// let wednesdayLessons = prompt("Kiek pamoku treciadieni?", 0);
// let thursdayLessons = prompt("Kiek pamoku ketvirtadieni?", 0);
// let fridayLessons = prompt("Kiek pamoku penktadieni?", 0);

// let lessonsPerWeek =
//   Number(mondayLessons) +
//   Number(tuesdayLessons) +
//   Number(wednesdayLessons) +
//   Number(thursdayLessons) +
//   Number(fridayLessons);

// let lessonsLength = lessonsPerWeek * 45;
// console.log(`Pamoku skaicius ${lessonsPerWeek}`);
// console.log(`Tai sudaro minuciu ${lessonsLength}`);

// 2 uzduotis
// let fish = Number(prompt("Kiek zuvu gyvena akvariume?"), 0);
// let fishPerDay = Number(
//   prompt("Kiek zuvu idedama i akavriuma kiekviena diena?"),
//   0
// );
// let days = Number(prompt("Kiek dienu praejo?"), 0);

// let result = fish + fishPerDay * days;

// console.log(`Po ${days} dienu akvariume gyvens ${result} zuvu.`);

// 3 uzduotis

// let aCoins = Number(prompt("Kiek yra monetu po 5ct?"), 0);
// let bCoins = Number(prompt("Kiek yra monetu po 20ct?"), 0);
// let cCoins = Number(prompt("Kiek yra monetu po 2lt?"), 0);

// let result = aCoins * 0.05 + bCoins * 0.2 + cCoins * 2;
// console.log(`Taupykleje yra ${result} LT`);

// 4 uzduotis

// let speed = Number(prompt("Koks automobilio greitis?"), 0);
// let result = (264 / (speed * 1000)) * 3600;

// console.log(`Automobilis tuneli pravaziuos per ${result.toFixed(2)}`);

// 5

// let wallLength = Number(prompt("Koks sienos ilgis?") * 100, 0);
// let wallHeight = Number(prompt("Koks sienos aukstis?") * 100, 0);
// let pricePerBrick = Number(prompt("Kokia plytos kaina?"), 0);

// let brickCount = (wallLength * wallHeight) / 200;
// let brickPrice = brickCount * pricePerBrick;

// console.log(`Plytu kiekis ${brickCount}\n Plytos kainuos ${brickPrice} LT`);

// 6 uzduotis
// let baseA = Number(prompt("Koks ilgesniojo pagrindo ilgis?"));
// let baseB = Number(prompt("Koks trumpesniojo pagrindo ilgis?"));
// let h = Number(prompt("Koks aukstines ilgis?"));

// console.log(`${((baseA + baseB) / 2) * h}`);

// 7 uzduotis

// function calculateCups() {
//   let cups = document.querySelector("#cups").value;
//   let result = document.querySelector("#root");

//   result.innerHTML = `
//   <h1>Pilnu dezuciu skaicius: ${Math.floor(
//     cups / 3
//   )} Nesupakuotu puodeliu skacius: ${cups % 3}</h1>
//  `;
// }

// document.querySelector("#submit").addEventListener("click", (e) => {
//   e.preventDefault();
//   calculateCups();
// });

// 8 uzduotis

// let numCars = Number(prompt('Kiek yra automobiliu?'), 0);
// let capacity = 10;

// let result = Math.floor(numCars / capacity);
// let overboard = numCars % capacity;

// console.log(`Perkels per kartu ${result}`);
// console.log(`Liks neperkeltu ${overboard}`);

// 9 uzduotis

// let tautvydas = Number(prompt('Kiek sausainiu iskepe Tautvydas?'), 0);
// let friends = Number(prompt('Keli draugai dar atsinese po tiek pat sausainiu?'), 0);
// let totalFriends = Number(prompt('Kiek zmoniu is viso dalyvavo sventeje?'), 0);

// let totalCookies = tautvydas + tautvydas * friends;

// let cookiesToAll = Math.floor(totalCookies / totalFriends);
// let leftToTautyvas = totalCookies % totalFriends;

// console.log(`Kiekvienas sventes dalyvis gavo po ${cookiesToAll} sausainiu`);
// console.log(`Tautyvdui papildomai atiteko ${leftToTautyvas} sausainiai`);

// 10 uzduotis

// let candyToMarius = Number(prompt('Kiek saldainiu gauna Marius?'), 0);
// let candiesAte = Number(prompt('Po kiek saldainiu suvalgo?'), 0);
// let daysUntilXmas = Number(prompt('Kelios dienos liko iki Kaledu?'), 0);

// let totalCandies = candyToMarius * daysUntilXmas - daysUntilXmas * candiesAte;

// console.log(
//   `Marius paruos dovanas ${Math.trunc(totalCandies / candiesAte)} draugu. Supakavus dovanas liks ${
//     totalCandies % candiesAte
//   } saldainiai`
// );
