/* ## Given an array of numbers, return their product. Use reduce metod.

- Example
  - product([2, 4, 6]); // => 48 (i.e., 2 _ 4 _ 6)
  - product([-10, 10]); // => -100 (i.e., -10 \* 10) */

const returnProduct = (n) => n.reduce((mult, num) => mult * num, 1);

console.log(returnProduct([2, 4, 6]));
console.log(returnProduct([-10, 10]));
