/* ## Write a function `gcd` that returns the Greatest Common Divisor of two numbers. If no GCD exists, return 1.

- Greatest Common Divisor --> https://tinyurl.com/gr84qca

- Examples:
  - gcd(5, 1) --> 1 - isMultipleOf(3, 15) --> true
  - isMultipleOf(2, 7) --> false
  -
  - gcd(3, 15) --> 3
  - gcd(50, 20) --> 10
*/

const gcd = (n1, n2) => {
  if (n2 !== 0) {
    return gcd(n2, n1 % n2);
  }
  return Math.abs(n1);
};

console.log(gcd(3, 15));
console.log(gcd(50, 20));
console.log(gcd(5, 1));
