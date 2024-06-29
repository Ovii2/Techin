/* ## Write a function `numberJoinerFancy` which does the same thing as `numberJoinerWhile`, except it takes an optional third argument specifying the separator between the numbers.

Use either a `while` or a `for` loop (your preference).

- Examples:
  - numberJoinerFancy(1, 10) --> '1_2_3_4_5_6_7_8_9_10'
  - numberJoinerFancy(1, 5, '~') --> 1~2~3~4~5
  - numberJoinerFancy(3, 6, '**_BANANAS_**') --> 1**_BANANAS_**2**_BANANAS_**3 */

const numberJonerFor = (start, end, separator = '_') => {
  let result = '';

  for (let i = start; i <= end; i += 1) {
    result += i;
    if (i < end) {
      result += separator;
    }
  }
  return result;
};

console.log(numberJonerFor(1, 10));
console.log(numberJonerFor(1, 5, '~'));
console.log(numberJonerFor(1, 3, '**_BANANAS_**'));
