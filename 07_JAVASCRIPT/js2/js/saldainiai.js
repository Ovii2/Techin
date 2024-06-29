/* Firma „Sanite“ sald. „Mars“ parduoda po 0.28 eurus. 
Perkant daugiau kaip už 1000 eurųtaikoma 3 % nuolaida, 
daugiau kaip už 2000 eurų - 4 % nuolaida. Kiek litų kainuos N saldainių? 
(kursas 1euras = 3.45 Lt) */

function calculatePrice(candies) {
  const pricePerUnitEur = 0.28;
  const rate = 3.45;
  const totalPriceEur = candies * pricePerUnitEur;

  let discount;
  if (totalPriceEur > 1000) {
    discount = 0.03;
  } else if (totalPriceEur > 2000) {
    discount = 0.04;
  } else {
    discount = 0.0;
  }

  const priceInLT = (totalPriceEur - totalPriceEur * discount) * rate;
  return `Kaina uz ${candies} saldainiu ${priceInLT.toFixed(2)} LT`;
}

console.log(calculatePrice(6000));
console.log(calculatePrice(-6000));
