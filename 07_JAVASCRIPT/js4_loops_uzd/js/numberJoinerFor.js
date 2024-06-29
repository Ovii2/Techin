/* ## Write a function `numberJoinerFor` which does the same thing as `numberJoinerWhile`, except using a `for` loop internally. */

const numberJonerFor = (start, end) => {
  let result = '';

  for (let i = start; i <= end; i += 1) {
    result += i;
    if (i < end) {
      result += '_';
    }
  }
  return result;
};

console.log(numberJonerFor(1, 10));
console.log(numberJonerFor(12, 14));
