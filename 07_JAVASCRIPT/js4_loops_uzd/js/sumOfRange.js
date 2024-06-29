/* ## Given two integers, function returns the sum of all integers between those two integers, inclusive.

- Example:
- sumOfRange(1, 5) --> 15 (i.e., 1 + 2 + 3 + 4 + 5)
- sumOfRange(-3, 4) --> 4 (i.e., 3 + -2 + -1 + 0 + 1 + 2 + 3 + 4)

```javascript
function sumOfRange(leftSummand, rightSummand) {
  // This is your job. :)
} */

const sumOfRange = (leftSummand, rightSummand) => {
  let sum = 0;
  for (let i = leftSummand; i <= rightSummand; i += 1) {
    sum += i;
  }
  return sum;
};

console.log(sumOfRange(1, 5));
console.log(sumOfRange(-3, 4));
