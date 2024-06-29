/* 1.Parašykite funkciją, kuri grąžina visų lyginių ir visų nelyginių skaičių sumą intervale nuo 0 iki 
100. Panaudokite for loop. */

const sumNumbers = () => {
  let evenNumbers = 0;
  let oddNumbers = 0;
  try {
    for (let i = 0; i <= 100; i += 1) {
      if (i % 2 === 0) {
        evenNumbers += i;
      } else {
        oddNumbers += i;
      }
    }
    return { evenNumbers, oddNumbers };
  } catch (error) {
    throw new Error(error.message);
  }
};

console.log(`Even numbers sum: ${sumNumbers().evenNumbers}`);
console.log(`Odd numbers sum: ${sumNumbers().oddNumbers}`);
