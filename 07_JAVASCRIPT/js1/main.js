"use strict";

// const user = ['Ann', 30, '168.10', true];

// console.log(user[2]);
// console.log(user[3] = false);

// const fruits = ['apple', 'pear', 'banana', '🍍'];
// console.log(fruits);

// const fruits2 = [
//     {name: "apple", weight: 20, color: "red"},
//     {name: "pea", weight: 1, color: "green"},
// ]

// const num = "6";
// let res = num/2;
// console.log(res);

// 1. uzduotis
// let input = prompt("Iveskite skaiciu");

// let result = input / 3;
// alert(`Atsakymas ${result.toFixed(2)}`);

// 2.2. Uzduotis
// let radius = prompt("Enter radius");
// let length = prompt("Enter length");

// let area = Math.pow(radius, 2) * Math.PI;
// // let area = (radius * radius) * Math.PI;
// alert(`The area is ${area.toFixed(4)}`);
// let volume = area * length;
// alert(`The volume is ${volume.toFixed(1)}`);

// 2.25.
// let a = 15;
// let b = 27;
// let temp;

// temp = a;
// a = b;
// b = temp;
// alert(`${a}, ${b}`);

// 2.3.
// let input = +prompt('Enter a value for feet: ');
// alert(`${input} feet is ${(input * 0.305).toFixed(4)} meters`)

// 2.9.
// let v0 = +prompt("Enter v0");
// let v1 = +prompt("Enter v1");
// let t = +prompt("Enter t");

// alert(`The average acceleration is ${((v1 - v0) / t).toFixed(4)}`);


 const htmlEl = document.querySelector('#root');

 let fname = 'Vardas';

htmlEl.innerHTML = `
<h1>${fname}</h1>
`
 