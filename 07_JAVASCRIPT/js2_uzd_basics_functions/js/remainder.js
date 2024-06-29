/* Given two positive, `n` and `d`, returns the remainder of `n` after dividing by `d`.

- Example:
  - remainderOf(10, 1); --> 0
  - remainderOf(10, 2); --> 0
  - remainderOf(10, 3); --> 1
  - remainderOf(10, 4); --> 2
  - remainderOf(129, 17); --> 10 */

function remainderOf(n, d) {
  const remainder = n % d;
  return `The remainder of ${n} % ${d} is ${remainder}`;
}
console.log(remainderOf(10, 1));
console.log(remainderOf(10, 2));
console.log(remainderOf(10, 3));
console.log(remainderOf(10, 4));
console.log(remainderOf(129, 17));
