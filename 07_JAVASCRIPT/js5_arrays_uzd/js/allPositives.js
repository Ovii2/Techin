/* ## Write function `allPositive` which is given an array of numbers and returns true if _every_ element is positive and false otherwise.

- Example:
  - allPositive([1, 2, 3, 4, 5]); --> true
  - allPositive([1, 2, -3, 4, 5]); --> false
  - allPositive([0, 0, 1]); --> false */

const allPositive = (n) => n.every((value) => value > 0);

console.log(allPositive([1, 2, 3, 4, 5]));
console.log(allPositive([1, 2, -3, 4, 5]));
console.log(allPositive([0, 0, 1]));
