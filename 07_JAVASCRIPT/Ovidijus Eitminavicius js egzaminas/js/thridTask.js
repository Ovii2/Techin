const names = ["Olivia", "Jackson", "Sophia", "Elijah", "Ava", "Liam", "Isabella"];

// 1. Parašykite funkciją, kuri pašalina Olivia
const removeFirstArrEl = (arr) => {
  try {
    arr.shift();
  } catch (error) {
    throw new Error(error.message);
  }
};
// removeFirstArrEl(names);
// console.log(names);

// 2. Parašykite funkciją, kuri prideda vardą Mason į priekį.
const addFirstArrEl = (arr, element) => {
  try {
    arr.unshift(element);
  } catch (error) {
    throw new Error(error.message);
  }
};
// addFirstArrEl(names, "Mason");
// console.log(names);

// 3. Į masyvo pabaigą pridėkite savo vardą
const addMyName = (arr, name) => {
  try {
    arr.push(name);
  } catch (error) {
    throw new Error(error.message);
  }
};
// addMyName(names, "Ovidijus");
// console.log(names);

// 4. Parašykte funkciją, kuri priima vardą ir jį pašalina iš masyvo.
const removeName = (arr, elementToRemove) => {
  try {
    const result = arr.filter((element) => element !== elementToRemove);
    console.log(result);
  } catch (error) {
    throw new Error(error.message);
  }
};
// removeName(names, "Ava");

// 5.Sukurkite masyvą withBob ir sudėkite ten vardus, kiekvienas vardas turėtų būti sujungtas su
// ‘withBob’, pvz. OliviawithBob, JacksonwithBob.

const concatNames = (arr) => {
  try {
    const result = arr.map((name) => `${name}withBob`);
    console.log(result);
  } catch (error) {
    throw new Error(error.message);
  }
};
// concatNames(names);

// 6. Išrikiuokite vardus nuo Z iki A.
const sortNamesZtoA = (arr) => {
  try {
    const result = arr.sort((a, b) => b.localeCompare(a));
    console.log(result);
  } catch (error) {
    throw new Error(error.message);
  }
};
// sortNamesZtoA(names);
