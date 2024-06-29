/* ## Write a function `factors` which is given a number and returns an array containing all its factors.

- What are factors? --> https://tinyurl.com/gncg62o

- Examples:
  - factors(1) --> [1]
  - factors(12) --> [1, 2, 3, 4, 6, 12]
  - factors(42) --> [1, 2, 3, 6, 7, 14, 21, 42] */

const factors = (n) => {
  const result = [];
  for (let i = 1; i <= n; i += 1) {
    if (n % i === 0) {
      result.push(i);
    }
  }
  return result;
};

console.log(factors(1));
console.log(factors(12));
console.log(factors(42));
