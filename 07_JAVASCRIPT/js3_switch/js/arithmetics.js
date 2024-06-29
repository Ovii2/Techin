/* Parasykite paprastus, aritmetinius veiksmus atiekancia funkcija su duotais skaiciais.
pvz
calculate(16,18,'/')
calculate(-5,7,'x')
calculate(10,100,'+') */

function calc(number1, number2, operator) {
  switch (operator) {
    case "/":
      return number1 / number2;
    case "x":
      return number1 * number2;
    case "+":
      return number1 + number2;
    case "-":
      return number1 - number2;
    case "**":
      return number1 ** number2;
    case "%":
      return number1 % number2;
    default:
      return `Error`;
  }
}
console.log(calc(16, 18, "/"));
console.log(calc(-5, 7, "x"));
console.log(calc(10, 100, "+"));
console.log(calc(13, 8, "-"));
console.log(calc(5, 5, "**"));
console.log(calc(5, 2, "%"));
