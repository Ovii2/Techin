const mainEl = document.getElementById("main-content");
const pEl = mainEl.getElementsByTagName("p");
const resultEl = document.getElementById("result");

// console.log(mainEl, pEl, resultEl);
resultEl.innerHTML = `<h2>${pEl[0].innerHTML}</h2>`;

resultEl.style.color = "red";
resultEl.style.fontSize = "2rem";

console.log(resultEl.getAttribute("id"));

resultEl.setAttribute("id", "newResult2");

if (resultEl.getAttribute("id") === "newResult") {
  resultEl.style.color = "blue";
} else {
  resultEl.style.color = "green";
}
