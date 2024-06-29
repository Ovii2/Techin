const endpoint = 'https://api.openweathermap.org/data/2.5/weather?q=';
const apiKey = '6207b6c1300c0e4b658010aa797e13c6';

const searchButton = document.querySelector('.search-button');
const searchBar = document.querySelector('.search-bar');

const city = document.querySelector('.city');
const temp = document.querySelector('.temp');
const icon = document.querySelector('.icon');
const description = document.querySelector('.description');
const humidity = document.querySelector('.humidity');
const wind = document.querySelector('.wind');

async function fetchData(cityName) {
  const address = `${endpoint}${cityName}&appid=${apiKey}&units=metric`;

  try {
    const response = await fetch(address);
    const data = await response.json();
    console.log(data);
    city.innerHTML = `Weather in ${cityName}`;
    temp.innerHTML = `${Math.round(data.main.temp)} &degC`;
    icon.src = `https://openweathermap.org/img/wn/${data.weather[0].icon}@2x.png`;
    description.innerHTML = `${data.weather[0].description}`;
    humidity.innerHTML = `Humidity: ${data.main.humidity} %`;
    wind.innerHTML = `Wind speed: ${data.wind.speed} m/s`;
    console.log(data);
  } catch (error) {
    console.log(error.message);
  }
}

searchButton.addEventListener('click', (e) => {
  e.preventDefault();
  const cityName = searchBar.value.trim();
  fetchData(cityName);
});

fetchData('Vilnius');
