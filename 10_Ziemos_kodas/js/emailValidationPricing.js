const formEl = document.querySelector("#form__pricing");
const errorEl = document.querySelector(".error__pricing");
const emailInput = document.querySelector("#pricing");

const testValidity = (inputValue, pattern) => {
  if (!pattern.test(inputValue)) {
    errorEl.classList.add("error");
    errorEl.innerHTML = "Not a valid email address";
    throw new Error("Error");
  } else {
    errorEl.classList.remove("error");
    errorEl.innerHTML = "";
  }
};

formEl.addEventListener("submit", (e) => {
  e.preventDefault();
  const userEmail = emailInput.value;
  const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/;
  try {
    testValidity(userEmail, emailPattern);
    emailInput.value = "";
  } catch (error) {}
});
