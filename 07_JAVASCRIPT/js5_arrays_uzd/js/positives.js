/* ## Write a function `positives` which is given an array of numbers and returns a new array containing only the positive numbers within the given array.

- Examples:
  - positives([1, -3, 5, -3, 0]) --> [1, 5]
  - positives([1, 2, 3]) --> [1, 2, 3]
  - positives([-1, -2, -3]) --> [] */

const positives = (positivesArr) => positivesArr.filter((n) => n > 0);

console.log(positives([1, -3, 5, -3, 0]));
console.log(positives([1, 2, 3]));
console.log(positives([-1, -2, -3]));
