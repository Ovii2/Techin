//  5.Paimkite duomenis iš API: https://hp-api.onrender.com/api/characters

const baseUrl = 'https://hp-api.onrender.com/api/characters';

// Parašykite funkciją, kuri grąžina visus dar gyvus personažus masyvo pavidalu.
async function fetchAliveCharacters(url) {
  const apiUrl = url;
  const result = [];
  try {
    const response = await fetch(apiUrl);
    const data = await response.json();
    const aliveCharacters = data.filter(({ alive }) => alive);
    result.push(aliveCharacters);
    console.log(result);
    // result.push(aliveCharacters);
  } catch (error) {
    throw new Error(error.message);
  }
}

/* const fetchData = async (url) => {
  try {
    const response = await fetch(url);
    const data = await response.json();
    return data;
  } catch (error) {
    throw new Error(error.message);
  }
}; */

// fetchAliveCharacters(baseUrl);

// Parašykite funkciją, kuri grąžina personažų masyvą, kai personažas turi tik name ir gender.
// Visa kita informacija apie personažą nereikalinga.

async function fetchCharactersNamesAndGenders(url) {
  const apiUrl = url;
  const result = [];
  try {
    const response = await fetch(apiUrl);
    const data = await response.json();
    const nameAndGender = data.map(({ name, gender }) => ({ name, gender }));
    result.push(nameAndGender);
    console.log(result);
  } catch (error) {
    throw new Error(error.message);
  }
}

// fetchCharactersNamesAndGenders(baseUrl);

// Parašykite funkciją, kuri suskaičiuotų ir grąžintų bendrą visų personažų wand.lenght.
// Panaudokite metodą reduce.
async function getTotalWandLength(url) {
  const apiUrl = url;
  try {
    const response = await fetch(apiUrl);
    const data = await response.json();
    const totalWandLength = data.reduce((acc, { wand }) => acc + wand.length, 0);
    console.log(`Total wand length: ${totalWandLength}`);
  } catch (error) {
    throw new Error(error.message);
  }
}

// getTotalWandLength(baseUrl);

// Sūrušiuokite personažus pagal amžių nuo jauniausio iki vyriausio.
async function sortFromYoungestToOldest(url) {
  const apiUrl = url;
  try {
    const response = await fetch(apiUrl);
    const data = await response.json();
    const sortedAge = data.sort((a, b) => a.yearOfBirth - b.yearOfBirth);
    console.log(sortedAge);
  } catch (error) {
    throw new Error(error.message);
  }
}
// sortFromYoungestToOldest(baseUrl);

// Surūšiuokite personažus pagal vardą, abėcėlės tvarka.
async function sortByName(url) {
  const apiUrl = url;
  try {
    const response = await fetch(apiUrl);
    const data = await response.json();
    const sortedNames = data.sort((a, b) => a.name.localeCompare(b.name));
    console.log(sortedNames);
  } catch (error) {
    throw new Error(error.message);
  }
}

// sortByName(baseUrl);

//  Parašykite funkciją, kuri personažus, gimusius anksčiau nei 1960 metais išvestų į HTML‘ą
// kortelių pavidalu. Parašykite minimalų kortelių css.
async function displayCharactersBornBefore1960(url) {
  const apiUrl = url;
  try {
    const response = await fetch(apiUrl);
    const data = await response.json();
    const olderThan1960 = data.filter(({ yearOfBirth }) => yearOfBirth < 1960);
    const cardContainer = document.querySelector('#root');
    olderThan1960.forEach(({ name, yearOfBirth, actor, image }) => {
      const card = document.createElement('div');
      card.classList.add('card');
      card.innerHTML = `        
        <img src="${image}" alt="character-image">
        <h2>${name}</h2>
        <p>Year of Birth: ${yearOfBirth}</p>
        <p>Actor real name: ${actor}</p>
     `;
      cardContainer.append(card);
    });
  } catch (error) {
    throw new Error(error.message);
  }
}

displayCharactersBornBefore1960(baseUrl);
