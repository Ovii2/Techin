/* ## Write a function `max` that takes an array of numbers returns the highest number in the array. */

const numbers = [1, 5, 20, 400, 8, 3000, 2987];

const max = () => Math.max(...numbers);

console.log(max(numbers));
