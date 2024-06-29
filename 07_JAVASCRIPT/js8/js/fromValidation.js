// const liEl = document.querySelector("ul li:nth-child(2)");
// console.log(liEl);

// let spanEl = liEl.childNodes[1];
// console.log(spanEl);

// let liEl2 = liEl.nextElementSibling;
// console.log(liEl2);

const formEl = document.querySelector('#contact-form');

const testValidity = (element, pattern) => {
  if (!pattern.test(element.value)) {
    element.classList.add('error');
    element.nextElementSibling.innerHTML = 'Neteisingi duomenys';
    throw new Error('Klaida');
  } else {
    element.classList.remove('error');
    element.nextElementSibling.innerHTML = '';
  }
};

formEl.addEventListener('submit', (e) => {
  e.preventDefault();
  const userName = formEl.querySelector('#userName');
  const pattern = /^[a-zA-Z]+$/;
  try {
    testValidity(userName, pattern);
    console.log('Forma uzpildyta');
  } catch (error) {
    console.error(error.message);
  }
});
