const formEl = document.querySelector(".getUsers");

formEl.addEventListener("submit", (e) => {
  e.preventDefault();

  const uernameEl = document.querySelector("#name").value.trim();
  const emailEl = document.querySelector("#email").value.trim();
  const user = { uernameEl, emailEl };
  console.log(user);
});
