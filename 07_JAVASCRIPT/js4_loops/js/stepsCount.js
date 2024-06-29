/* Kelias į mokyklą. Kiekvieną dieną Petriukas, eidamas į mokyklą, skaičiuoja kiekvieną savo
nį ir žaidžia tokį žaidimą: kai žingsnių skaičius baigiasi nuliu, Petriukas suploja rankomis, 0

kai penketu - spragteli pirštais. Parašykite programą, kuri suskaičiuotų, kiek kartų Petriukas
plos rankomis ir kiek — spragtels pirštais, jei jam iki mokyklos yra lygiai » žingsi */

const stepsCount = (steps) => {
  try {
    if (steps <= 0) {
      throw new Error("blogai ivesti zingsniai");
    }
    let claps = 0;
    let clicks = 0;

    for (let i = 1; i <= steps; i += 1) {
      if (i % 10 === 0) {
        claps += 1;
      } else if (i % 10 === 5) {
        clicks += 1;
      }
    }
    //   return `Clicks: ${clicks}, claps: ${claps}`;
    //   return { clicks: clicks, claps: claps };
    return { clicks, claps };
  } catch (err) {
    return err.message;
  }
};

console.log(stepsCount(20));
console.log(stepsCount(50));
console.log(stepsCount(100));
console.log(stepsCount(-10));
