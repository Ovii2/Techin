"use strict";

// function sumNumbers(fNum, sNum) {
//   //   let fNum = Number(prompt("Iveskite pirma skaiciu"));
//   //   let sNum = Number(prompt("Iveskite antra skaiciu"));
//   //   let result = fNum + sNum;
//   return fNum + sNum;
//   //   return result;
// }

// // console.log(sumNumbers());
// let num1 = Number(prompt("Iveskite pirma skaiciu"));
// let num2 = Number(prompt("Iveskite antra skaiciu"));
// let sum = sumNumbers(num1, num2);
// console.log(sum);

// let sumNumbers = (fn, sn) => {
//   return fn + sn;
// };

// sumNumbers();

// let sumNumbers = (fn, sn) => fn + sn;

// sumNumbers();

//anomimine funkcija
// let mult = function () {};
// mult();

// let a = 5;
// let b = "5";

// let res = a === b;
// console.log(res);

// let year = 2023;
// let day = 10;

// if (year < 2015) {
//   true;
// } else {
//   false;
// }

/*Write a JavaScript program that accept two integers and display the larger.*/
let num1 = Number(prompt("Iveskite pirma skaiciu"));
let num2 = Number(prompt("Iveskite antra skaiciu"));

// 1 budas
if (num1 > num2 && num1 != 0 && num2 != 0) {
  console.log(`Larger number ${num1}`);
} else {
  if (num1 === num2) {
    console.log(`Lygus`);
  } else {
    if (num1 !== 0 || num2 !== 0) {
      console.log(`Larger number ${num2}`);
    }
    console.log(`Patikrinkite duomenis`);
  }
}

// 2 budas
// let result = num1 < num2 ? `Larger number ${num2}` : `Larger number ${num1}`;
