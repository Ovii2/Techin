"use strict";

function getData() {
  let fname = document.querySelector("#fname").value;
  let lname = document.querySelector("#lname").value;
  let email = document.querySelector("#email").value;
  let result = document.querySelector("#root");

  let user = { name: fname, lastname: lname, email: email };

  //   console.log(user);
  result.innerHTML = `
 <h1>${fname} ${lname} ${email}</h1>
`;
}

document.querySelector("#submit").addEventListener("click", (e) => {
  e.preventDefault();
  getData();
});
