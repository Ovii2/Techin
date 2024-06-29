/* ## Write a function `numberJoinerWhile` which is given a start number and an end number.

It should return a string of the numbers joined together by the `_` character.
Use a `while` loop to do this.

- Examples:
  - numberJoinerWhile(1, 10) --> '1_2_3_4_5_6_7_8_9_10'
  - numberJoinerWhile(12, 14) --> '12_13_14' */

const numberJoinerWhile = (start, end) => {
  let result = '';
  while (start <= end) {
    result += start;

    if (start < end) {
      result += '_';
    }
    start += 1;
  }
  return result;
};

console.log(numberJoinerWhile(1, 10));
console.log(numberJoinerWhile(12, 14));
