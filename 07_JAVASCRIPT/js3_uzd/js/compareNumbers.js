/* ## Write a JavaScript function `compareNumbers` that accept two integers and display the larger. 
Use conditional statement `if` and conditional (ternary) operator `?`. */

function compareNumbers(n1, n2) {
  if (n1 > n2) return n1;
  if (n1 < n2) return n2;
  if (n1 === n2) return `Check your numbers`;
}

console.log(compareNumbers(5, 7));
console.log(compareNumbers(10, 3));
console.log(compareNumbers(7, 7));

function compareNumbers2(n1, n2) {
  return n1 > n2 ? n1 : n2;
}

console.log(compareNumbers2(5, 7));
console.log(compareNumbers2(10, 3));
