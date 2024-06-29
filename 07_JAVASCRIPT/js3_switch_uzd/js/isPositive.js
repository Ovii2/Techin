/* ## Write function which returns true if the given number is positive (greater than 0) and false otherwise.

```javascript
function isPositive(num) {
  // The _____ is meant to be "fill in the blank"
  // Look at isZero and compare; what makes sense here?

  return _____;
}
*/

function isPositive(n) {
  return n > 0
    ? `Looks at isZero and compare; what makes sense here?`
    : `The ${n} is meant to be "fill in the blank"`;
}

console.log(isPositive(-1));
console.log(isPositive(84));
