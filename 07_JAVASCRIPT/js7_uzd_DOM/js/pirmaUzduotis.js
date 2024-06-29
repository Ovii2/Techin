const rootEl = document.querySelector('#root');

const resultEl = document.createElement('div');
resultEl.className = 'result';
resultEl.style.display = 'grid';
resultEl.style.justifyContent = 'center';
resultEl.style.justifyItems = 'center';
resultEl.style.paddingBlockEnd = '1rem';
rootEl.append(resultEl);

const h1El = document.createElement('h1');
h1El.className = 'text-output';
h1El.style.backgroundColor = 'darkslategrey';
h1El.style.color = 'white';
h1El.style.width = '110%';
h1El.style.textAlign = 'center';
h1El.style.borderRadius = '0.3rem';
resultEl.append(h1El);

const btnEl = document.createElement('button');
btnEl.className = 'btn';
btnEl.innerText = 'CLICK ME';
btnEl.style.backgroundColor = 'transparent';
btnEl.style.padding = '0.5rem';
resultEl.append(btnEl);

btnEl.addEventListener('click', (e) => {
  e.preventDefault();
  const num1 = Math.floor(Math.random() * 256);
  const num2 = Math.floor(Math.random() * 256);
  const num3 = Math.floor(Math.random() * 256);
  const rgbColor = `rgb(${num1}, ${num2}, ${num3})`;
  rootEl.style.backgroundColor = rgbColor;
  h1El.innerHTML = `Background color: ${rgbColor}`;
});
