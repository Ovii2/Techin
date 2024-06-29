/* ## Write function `anyPositive` which is given an array of numbers and returns true if _any_ element is positive and false otherwise.

- Example:
  - anyPositive([1, 2, 3, 4, 5]); --> true
  - anyPositive([1, 2, -3, 4, 5]); --> true
  - anyPositive([0, 0, 1]); --> true
  - anyPositive([-10, -10, -10]); --> false
  - anyPositive([-10, -10, 1]); --> true
*/

const anyPositive = (n) => n.some((value) => value > 0);

console.log(anyPositive([1, 2, 3, 4, 5]));
console.log(anyPositive([1, 2, -3, 4, 5]));
console.log(anyPositive([0, 0, 1]));
console.log(anyPositive([-10, -10, -10]));
console.log(anyPositive([-10, -10, 1]));
