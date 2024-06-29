/* Konkursas. Restorano „Skanu“ vadybininkas sugalvojo surengti konkursą lankytojams, kurio
mėtu galima laimėti marškinėlius su restorano logotipu. Visi lankytojai kartu su sąskaita gauna
po vieną kortėlę, ant kurios parašytas sveikasis teigiamas skaičius iš intervalo (a;5] (a —
intervalo pradžia, b — intervalo pabaiga). Laimi tie lankytojai, kurių kortelėse įrašytas skaičius
dalijasi iš 6. Parašykite programą, kuri apskaičiuotų, kiek marškinėlių reikia užsakyti restorano
vadybininkui. 

Duomenys Rezultatai

Įveskite intervalo pradžią: 5 Reikalingų marškinėlių skaičius: 4
Įveskite intervalo pabaigą: 24

Įveskite intervalo pradžią: 31 Reikalingų marškinėlių skaičius: 5
Įveskite intervalo pabaigą: 62 */

const countTshirts = (intStart, intEnd) => {
  let tShirtsTotal = 0;

  for (let i = intStart; i <= intEnd; i++) {
    if (i % 6 === 0) {
      tShirtsTotal += 1;
    }
  }
  return tShirtsTotal;
};

console.log(countTshirts(5, 24));
