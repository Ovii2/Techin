"use strict";

// console.log("Nan typeof ==", typeof NaN);
// console.log(typeof Infinity);

// let userName = "Ann";
// let age = 35;

// let message = `${userName}'s is ${age}`;
// console.log(message);

// const mainElement = document.querySelector("#root");
// console.log(mainElement);

// const message = "Best regards";

// const htmlMessage = `
// <h1>${message}</h1>
// `;

// mainElement.innerHTML = htmlMessage;

// let text = "asdq";

// let text2 = new String("asdqz");
// console.log(typeof text);
// console.log(typeof text2);

// console.log(typeof null);
// console.log(typeof undefined);

// const animal = {
//   breed: "Husky",
//   age: 5,
//   name: "Au au",
// };

// animal.color = "grey";

// delete animal.age;

// console.log(animal);

let person = {
  quote: "Oh boy, sleep! That's where I'm a viking!",
  character: "Ralph Wiggum",
  image:
    "https://cdn.glitch.com/3c3ffadc-3406-4440-bb95-d40ec8fcde72%2FRalphWiggum.png?1497567511523",
  characterDirection: "Left",
};

const rootEl = document.querySelector("#root");

let personCard = `
<div class="card">
<h1>${person.character}</h1>  
<p>${person.quote}</p>
<img src="${person.image}" alt="Ralph Wiggum">
</div>
`;

rootEl.innerHTML = personCard;
