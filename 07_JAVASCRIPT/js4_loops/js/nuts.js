/* 1. Turime dvi lėkštes. Pirmoje yra riešutai, o antra tuščia. Riešutus perkeliame iš pirmos lėkštės i antrąją pagal taisykles:
a) jei riešutų skaičius pirmoje lėkštėje lyginis, perkeliame pusę jų;
b) jei riešutų skaičius pirmoje lėkštėje nelyginis, perkeliame vieną;
c) pirmąjį ir antrąjį veiksmą kartojame tol, kol visi riešutai neatsidurs antroje lėkštėje.
Nustatykite, kiek reikia perkėlimų, kad riešutai atsidurtų antroje lėkštėje, jei iš pradžių buvo n riešutų. */

function nutsTransport(nuts) {
  let nutsInPlate = nuts;
  let transfers = 0;

  while (nutsInPlate > 0) {
    if (nutsInPlate % 2 === 0) {
      //   nuts = nuts / 2;
      nutsInPlate /= 2;
      //   transfers = transfers + 1;
      transfers += 1;
    } else {
      nutsInPlate -= 1;
      transfers += 1;
    }
  }
  return transfers;
}

console.log(nutsTransport(10));
console.log(nutsTransport(20));
console.log(nutsTransport(100));
