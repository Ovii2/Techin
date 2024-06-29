/* Write a function "callNTimes" that takes two arguments: times (a number), and fn (a function). Execute the "fn" function "times" times.

- In this case, we assume that the person who is using "callNTimes" has defined their function, and is passing it into our function as an argument (ie: passing it around as a variable).

- Example:

  - callNTimes(5, hello)
    `Hello, world!`
    `Hello, world!`
    `Hello, world!`
    `Hello, world!`
    `Hello, world!`

  - In this example we assume there is a function "hello" already defined and that it prints "Hello, world!" to the console.
*/

function hello() {
  return "Hello, world! ";
}

function callNTimes(times, fn) {
  return fn.repeat(times);
}

console.log(callNTimes(5, hello()));
console.log(callNTimes(8, hello()));
console.log(callNTimes(10, hello()));
