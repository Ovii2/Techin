let students = ["Bob", "John", "Steve", "Daniel", "Gorge", "Philip"];

const [st1, st2, st3, ...others] = students;

// console.log(st1);
// console.log(st2);
// console.log(st3);
// console.log(others);
const [, stp] = others;
console.log(stp);

