/* ## Write a function `makeSquare` which is given a size and returns a square of that size using asterisks.

- Example:
  - makeSquare(5)
    `*****`
    `*****`
    `*****`
    `*****`
    `*****` */

const makeSquare = (n) => {
  let result = '';
  for (let i = 0; i < n; i += 1) {
    for (let j = 0; j < n; j += 1) {
      result += '*';
    }
    result += '\n';
  }
  return result;
};

console.log(makeSquare(5));
console.log(makeSquare(20));
