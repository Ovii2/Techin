/* HTML'e sukurti stačiakampį elementą, su fono spalva. 
Pridėti šalia mygtuką, kurį paspaudus vieną kartą spalva pasikeičia, dar kartą paspaudus  atsistato į pradinę. */
const mainEl = document.querySelector("#root");

const divEl = document.createElement("div");
divEl.className = "basic";
divEl.style.border = "0.05rem solid black";
divEl.style.maxWidth = "50%";
divEl.style.margin = "0 auto";
divEl.style.padding = "1rem";
mainEl.append(divEl);

const btnEl = document.createElement("button");
// btnEl.className = "toggleBtn";
btnEl.textContent = "Send";
divEl.append(btnEl);

btnEl.addEventListener("click", (e) => {
  e.preventDefault();
  divEl.classList.toggle("active");
});
