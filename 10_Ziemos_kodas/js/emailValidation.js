const formEl = document.querySelector("#form__email");
const formElSecond = document.querySelector("#form__emails"); // Pridėjau antrąją formą
const errorEl = document.querySelector(".error__msg");
const errorElSecond = document.querySelector(".error__msgs"); // Pridėjau antrąjį klaidos pranešimą
const emailInput = document.querySelector("#email");
const emailInputSecond = document.querySelector("#emails"); // Pridėjau antrąjį el. pašto įvesties lauką

const testValidity = (inputValue, pattern, errorElement) => {
  if (!pattern.test(inputValue)) {
    errorElement.classList.add("error");
    errorElement.innerHTML = "Not a valid email address";
    throw new Error("Error");
  } else {
    errorElement.classList.remove("error");
    errorElement.innerHTML = "";
  }
};

formEl.addEventListener("submit", (e) => {
  e.preventDefault();
  const userEmail = emailInput.value;
  const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
  try {
    testValidity(userEmail, emailPattern, errorEl);
    emailInput.value = "";
  } catch (error) {}
});

formElSecond.addEventListener("submit", (e) => {
  e.preventDefault();
  const userEmail = emailInputSecond.value;
  const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
  try {
    testValidity(userEmail, emailPattern, errorElSecond);
    emailInputSecond.value = "";
  } catch (error) {}
});
