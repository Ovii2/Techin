/* ## Write a function `integers` which takes an array of numbers and returns a new array containing only the integers in the given array.

- Example:
  - integers([3.14, 2.4, 7, 8.1, 2]) --> [7, 2] */

const integers = (arr) => arr.filter((n) => Number.isInteger(n));

console.log(integers([3.14, 2.4, 7, 8.1, 2]));
