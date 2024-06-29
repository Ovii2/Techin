const contactForm = document.getElementById("main__contact__form");
const userName = document.getElementById("userName");
const email = document.getElementById("userEmail");
const title = document.getElementById("title");
const message = document.getElementById("message");

const demoForm = document.getElementById("demo__form__contacts");
const demotextfield = document.getElementById("input__contact");

// const testValidity = (element, pattern) => {
//   let errorMsg = element.nextElementSibling.innerHTML;
//   if (!pattern.test(elem.value)) {
//     element.classList.add("error");
//     errorMsg = "Wrong email field";
//     throw new Error("Bug");
//   } else {
//     element.classList.remove("error");
//     errorMsg = "";
//   }
// };

// form.addEventListener("submit", (e) => {
//   e.preventDefault();
//   const userName = form.querySelector("#userName");//bandymas su userName
//   const patternText = /^[a-zA-Z0-9]+$/;
//   const patternEmail = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
//   try {
//     testValidity(userName, patternText);
//     alert("forma uzpildyta teisingai. Sent!");
//   } catch (error) {
//     console.log(error.message);
//   }
// });
