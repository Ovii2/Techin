/* Šeima į mėnesį gauna n litų. 5% išleidžia mokesčiams
o likusius pinigus buitinėms reikmėms: 50% maistui, 30% rūbams ir likusius pramogoms.
Sudarykite programą šeimos  biudžiatui skaičiuoti. */

function countBudget(money) {
  const dues = money * 0.05;
  const balance = money - dues;
  const food = balance * 0.5;
  const clothes = balance * 0.3;
  const funActivities = balance - food - clothes;
  return `Dues ${dues} \nFood: ${food.toFixed(0)} \nClothes: ${clothes} \nFun Activities: ${funActivities}`;
}

console.log(countBudget(100));
