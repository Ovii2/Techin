/* ## Given two integers, n and d, write function `isMultipleOf` which returns true if n is a multiple of d and false otherwise.

n is a multiple of d means that d divides n without remainder.

```javascript
function isMultipleOf(n, d) {
  // This is your job. :)
  // Consider handling two cases separately:
  //   1. When d === 0
  //   2. When d !== 0
}
```

- Examples:
  - isMultipleOf(3, 15) --> true
  - isMultipleOf(2, 7) --> false
  - isMultipleOf(2, 0) -->false
*/

function isMultipleOf(n, d) {
  if (d !== 0 && n !== 0) {
    return d % n === 0;
  }
  return false;
}

console.log(isMultipleOf(3, 15));
console.log(isMultipleOf(2, 7));
console.log(isMultipleOf(2, 0));
console.log(isMultipleOf(0, 0));
