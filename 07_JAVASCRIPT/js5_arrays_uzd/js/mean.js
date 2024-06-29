/* ## Write function `mean`, which takes an array of numbers and returns their mean. We use "mean" instead of average because "average" can mean many things — mean, median, or mode while mean only ever means one thing.

The mean of three numbers a,b,c is (a + b + c) / 3.
The mean of four numbers a,b,c,d is (a + b + c + d) / 4.
etc.

See https://en.wikipedia.org/wiki/Arithmetic_mean

- Examples:
  - mean([30, 10, 20]); --> 20 (i.e., (30 + 10 + 20) / 3)
  - mean([-10, 10]); --> 0 (i.e., (-10 + 10) / 2)
*/

const mean = (arr) => arr.reduce((a, b) => a + b, 0) / arr.length;

console.log(mean([30, 10, 20]));
console.log(mean([-10, 10]));
