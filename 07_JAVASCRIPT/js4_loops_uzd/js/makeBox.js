/* ## Write a function "makeBox" which is given a width and height and returns a hollow box of those dimensions.

- Example:
  - makeBox(6, 4)
    `******`
    `*    *`
    `*    *`
    `******` */

const makeBox = (x, y) => {
  let result = '';
  for (let i = 1; i <= y; i += 1) {
    for (let j = 1; j <= x; j += 1) {
      if (i === 1 || i === y || j === 1 || j === x) {
        result += '*';
      } else {
        result += ' ';
      }
    }
    result += '\n';
  }
  return result;
};

console.log(makeBox(6, 4));
console.log(makeBox(12, 8));
