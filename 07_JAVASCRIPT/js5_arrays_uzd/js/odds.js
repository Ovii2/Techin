/* ## Write a function `odds` which takes an array of numbers and returns a new array containing only the odd numbers in the given array. */
const odds = (arr) => arr.filter((n) => n % 2 !== 0);

console.log(odds([2, 5, 8, 10]));
console.log(odds([3, 0, 9, 12]));
console.log(odds([-1, 2, 22, 44]));
