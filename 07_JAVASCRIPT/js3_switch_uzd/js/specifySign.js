/* ## Write a JavaScript function `specifySign` to find the sign of product of three numbers. Display an alert box with the specified sign. What if product is 0 ?

- Example:
  - specifySign(3, -7, 2) --> The product sign is -(minus)
  - specifySign(10, 5, 4) --> The product sign is +(plus)
*/

function specifySign(n1, n2, n3) {
  const result = n1 * n2 * n3;

  let sign;
  if (result < 0) {
    sign = '-(minus)';
  } else if (result > 0) {
    sign = '+(plus)';
  } else {
    return '0 not allowed';
  }

  return `The product sign is ${sign}`;
}

console.log(specifySign(3, -7, 2));
console.log(specifySign(10, 5, 4));
console.log(specifySign(10, 0, 4));
