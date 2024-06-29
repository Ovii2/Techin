// function testRegexp(text) {
//     // Regexp
//     const regexp = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
//     return regexp.test(text);
// }

// function checkField() {
//     let userInput = document.getElementById('input__contacts__button').value;
//     let result = testRegexp(userInput);

//     if (result) {
//         alert('El pastas yra teisingas');
//     } else {
//         alert('El pastas yra neteisingas');
//     }
// }
//////

function testRegexp(text) {
  const regexp = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
  return regexp.test(text);
}

function checkField() {
  let userInput = document.getElementById("input__contacts").value;
  let result = testRegexp(userInput);

  let myButton = document.getElementById("myButton");

  if (result) {
    myButton.removeAttribute("disabled");
  } else {
    myButton.setAttribute("disabled", "disabled");
  }
}
