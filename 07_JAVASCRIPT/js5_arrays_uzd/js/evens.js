/* ## Write a function `evens` which takes an array of numbers and returns a new array containing only the even numbers in the given array. */

const evens = (arr) => arr.filter((n) => n % 2 === 0);

console.log(evens([2, 5, 8, 10]));
console.log(evens([3, 0, 9, 12]));
console.log(evens([-1, 2, 22, 44]));
