/* „Snaigės už lango. Per atostogas Simas turėjo daugiau laisvo laiko ir nutarė suskaičiuoti, kiek
sningant po jo namo langu nukrenta snaigių. Jis pastebėjo, kad kiekvieną kitą sekundę nukrenta
dvigubai daugiau snaigių, nei prieš tai buvusią. Parašykite programą, skaičiuojančią kiek snaigių
s bus nukritę per n sekundžių, kai per pirmąją sekundę nukrito k snaigių.

Duomenys Rezultatai
Įveskite, kiek snaigių nukrito per pirmąją sekundę ir kiek 35
sekundžių snigo: 5 3

Įveskite, kiek snaigių nukrito per pirmąją sekundę ir kiek 30
sekundžių snigo: 2 4 */

// const countSnowFlakes = (number, seconds) => {
//   try {
//     if (+number <= 0 || +seconds <= 0 || Number.isNaN(+number) || Number.isNaN(+seconds))
//       throw new Error('error');
//     let total = 0;
//     for (let i = 0; i < seconds; i += 1) {
//       total = number + total;
//       number *= 2;
//     }
//     return total;
//   } catch (error) {
//     return error.message;
//   }
// };

const countSnowFlakes = (num, sec) => {
  const number = +num;
  const seconds = +sec;
  try {
    if (number <= 0 || seconds <= 0 || Number.isNaN(number) || Number.isNaN(seconds))
      throw new Error('error');
    let total = 0;
    let snowFlakes = number;
    for (let i = 0; i < seconds; i += 1) {
      total += snowFlakes;
      snowFlakes *= 2;
    }
    return total;
  } catch (error) {
    return error.message;
  }
};

console.log(countSnowFlakes(5, 3));
console.log(countSnowFlakes(2, 4));
console.log(countSnowFlakes('s', 'p'));
console.log(countSnowFlakes('s', 2));
console.log(countSnowFlakes(undefined, 2));
console.log(countSnowFlakes('45', 2));
console.log(countSnowFlakes('45', '50'));
