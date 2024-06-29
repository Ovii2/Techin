/* Write a Java program that calculates and shows the sum of all
even integers from 0 to n, where n is specified by the user via
keyboard. Assume that n is an integer greater than O. */

const sumEvenIntegers = (n) => {
  try {
    if (n <= 0 || Number.isNaN(n)) {
      throw new Error("Blogai ivesti duomenys");
    }
    let result = 0;
    for (let i = 0; i <= n; i += 1) {
      if (i % 2 === 0) {
        result += i;
      }
    }
    return result;
  } catch (error) {
    return error.message;
  }
};

console.log(sumEvenIntegers(-4));
console.log(sumEvenIntegers(129));
