const rootEl = document.querySelector('#root');

const resultEl = document.createElement('div');
resultEl.className = 'result';
resultEl.style.maxWidth = '60%';
resultEl.style.textAlign = 'center';
resultEl.style.margin = '0 auto';
resultEl.style.paddingBlockEnd = '1rem';
rootEl.append(resultEl);

const counterResult = document.createElement('p');
counterResult.innerText = '0';
counterResult.style.textAlign = 'center';
counterResult.style.fontSize = '2rem';
counterResult.style.fontWeight = 'bold';
resultEl.append(counterResult);

const decreaseBtn = document.createElement('button');
decreaseBtn.className = 'btn';
decreaseBtn.innerText = 'Decrease';
decreaseBtn.style.backgroundColor = 'transparent';
decreaseBtn.style.padding = '0.5rem';
decreaseBtn.style.borderRadius = '0.5rem';
decreaseBtn.style.marginRight = '0.5rem';
resultEl.append(decreaseBtn);

const resetBtn = document.createElement('button');
resetBtn.className = 'btn';
resetBtn.innerText = 'Reset';
resetBtn.style.backgroundColor = 'transparent';
resetBtn.style.padding = '0.5rem';
resetBtn.style.borderRadius = '0.5rem';
resetBtn.style.marginRight = '0.5rem';
resultEl.append(resetBtn);

const increaseBtn = document.createElement('button');
increaseBtn.className = 'btn';
increaseBtn.innerText = 'Increase';
increaseBtn.style.backgroundColor = 'transparent';
increaseBtn.style.padding = '0.5rem';
increaseBtn.style.borderRadius = '0.5rem';
increaseBtn.style.marginRight = '0.5rem';
resultEl.append(increaseBtn);

let counter = 0;

const updateColor = () => {
  counterResult.classList.remove('green', 'red', 'grey');

  if (counter > 0) {
    counterResult.classList.add('green');
  } else if (counter < 0) {
    counterResult.classList.add('red');
  } else {
    counterResult.classList.add('grey');
  }
};

const updateCounter = () => {
  counterResult.textContent = counter;
  updateColor();
};

updateCounter();

decreaseBtn.addEventListener('click', () => {
  counter -= 1;
  updateCounter();
});

resetBtn.addEventListener('click', () => {
  counter = 0;
  updateCounter();
});

increaseBtn.addEventListener('click', () => {
  counter += 1;
  updateCounter();
});
