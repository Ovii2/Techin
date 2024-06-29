/* ## Write a function `sumNumbers` which is given an array of numbers and returns the sum of the numbers. Do the same with reduce() method.

- Example:
  - sumNumbers([1, 4, 8]) --> 13 */

// const numbers = [1, 5, 20, 400, 8, 3000, 2987];

const sumNumbers = (n) => {
  let result = 0;
  for (let i = 0; i < n.length; i += 1) {
    result += n[i];
  }
  return result;
};

const sumNumbers2 = (n) => n.reduce((sum, num) => sum + num, 0);

console.log(sumNumbers([1, 4, 8]));
console.log(sumNumbers2([5, 10, 30]));
