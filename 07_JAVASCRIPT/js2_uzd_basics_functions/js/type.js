/* Write a JavaScript function which accepts an argument and returns the type.

Note : There are six possible values that typeof returns: object, boolean, function, number, string, and undefined. */

function returnType(type) {
  const t = typeof type;
  return `${type} type is ${t}`;
}

console.log(returnType({}));
console.log(returnType(true));
console.log(returnType(() => {}));
console.log(returnType(12));
console.log(returnType("asd"));
console.log(returnType(undefined));
