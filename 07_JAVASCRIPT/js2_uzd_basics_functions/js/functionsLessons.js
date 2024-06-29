function hello() {
  return "Hello, world! ";
}

function callNTimes(times, fn) {
  return fn.repeat(times);
}

console.log(callNTimes(hello));

//   console.log(callNTimes(5, hello()));
//   console.log(callNTimes(8, hello()));
//   console.log(callNTimes(10, hello()));
