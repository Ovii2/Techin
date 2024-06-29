/* ## Write a function `fizzbuzz` that returns the fizzbuzz string for an input number.

- A fizzbuzz string is defined as the following:

  - For every number from 1 to the input number
    - if that number is not a multiple of 3 or 5, add a period "." to the fizzbuzz string
    - for every number that is a multiple of 3 (but not 5), add "fizz" to the fizzbuzz string
    - for every number that is a multiple of 5 (but not 3), add "buzz" to the fizzbuzz string
    - for every number that is a multiple of 3 and 5, add "fizzbuzz" to the fizzbuzz string

- Examples:
  - fizzbuzz(3) --> '..fizz'
  - fizzbuzz(15) --> '..fizz.buzzfizz..fizzbuzz.fizz..fizzbuzz' */

const fizzBuzz = (n) => {
  try {
    if (Number.isNaN(+n) || +n <= 0) throw new Error(`Enter valid number`);

    let result = '';
    for (let i = 1; i <= n; i += 1) {
      if (i % 3 === 0 && i % 5 === 0) {
        result += 'fizzbuzz';
      } else if (i % 3 === 0) {
        result += 'fizz';
      } else if (i % 5 === 0) {
        result += 'buzz';
      } else {
        result += '.';
      }
    }
    return result;
  } catch (error) {
    return error.message;
  }
};

console.log(fizzBuzz(3));
console.log(fizzBuzz(15));
console.log(fizzBuzz(30));
console.log(fizzBuzz(41));
console.log(fizzBuzz(-10));
console.log(fizzBuzz('s'));
console.log(fizzBuzz(0));
