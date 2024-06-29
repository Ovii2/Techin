/* Jonas ir Petras dalyvavo šaškių turnyre. Jonas surinko n taškų o Petras m. 
nustatykite kuris iš dalyvių surinko daugiau taškų turnyre. */

function points(n, m) {
  if (n > m) return `Jonas surinko daugiau tasku`;
  if (n < m) return `Petras surinko daugiau tasku`;
  if (n === m) return `Abu surinko vienodai tasku`;
}

console.log(points(5, 4));
console.log(points(2, 6));
console.log(points(3, 3));
