/* Mark and John are trying to compare their BMI (Body Mass Index), which is calculated using the formula: BMI = mass / height^2 = mass / (height * height).(mass in kg and height in meter).
 Dont use if.
Write function `compareBMI` whitch takes Mark's and John's mass and height. 

1. Calculate both their BMIs.
2. Create a boolean variable containing information about whether Mark has a higher BMI than John.
3. Return a string containing the variable from step 2.

(Something like "Is Mark's BMI higher than John's? true").

- Example:
  - compareBMI(70, 185, 68, 187) --> true

*/

function compareBmi(mass1, height1, mass2, height2) {
  const markBmi = mass1 / height1 ** 2;
  const johnBmi = mass2 / height2 ** 2;

  const isMarkHigherThanJohn = markBmi > johnBmi;
  return `Is Mark's BMI higher than John's? ${isMarkHigherThanJohn}`;
}

console.log(compareBmi(80, 170, 90, 160));
