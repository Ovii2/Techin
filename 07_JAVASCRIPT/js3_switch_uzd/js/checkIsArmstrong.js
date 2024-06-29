/* ## Write a JavaScript funcion `checkIsArmstrong` which takes a 3 digits number and returns is it armstrong number or no.

Note : An Armstrong number of three digits is an integer such that the sum of the cubes of its digits is equal to the number itself.

For example, 371 is an Armstrong number since `3**3 + 7**3 + 1**3 = 371`.

- Examples:
  - checkIsArmstrong(153) --> true
  - isMultipleOf(412) --> false */

function checkIsArmstrong(number) {
  number = String(number);
  const n1 = +number[0];
  const n2 = +number[1];
  const n3 = +number[2];

  return n1 ** 3 + n2 ** 3 + n3 ** 3 === +number;
}

// console.log(checkIsArmstrong("371"));
// console.log(checkIsArmstrong("153"));
// console.log(checkIsArmstrong("412"));

console.log(checkIsArmstrong(371));
console.log(checkIsArmstrong(153));
console.log(checkIsArmstrong(412));
