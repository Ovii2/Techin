const baseUrl = "https://reqres.in/api/users/";

const rootEl = document.querySelector("#root");

const cardContainerEl = document.createElement("div");
cardContainerEl.className = "card-container";
rootEl.append(cardContainerEl);

async function fetchData(url) {
  const apiUrl = url;
  try {
    const response = await fetch(apiUrl);
    const data = await response.json();
    console.log("data ===", data);
    // const mainEl = document.querySelector('#root');
    cardContainerEl.innerHTML = "";
    data.data.forEach(({ first_name, email, avatar }) => {
      cardContainerEl.innerHTML += `<div class="card">
      <h1>${first_name}</h1>
      <p>${email}</p>
      <img src="${avatar}" alt="card-image">
      </div>
      `;
    });
    console.log(data);
  } catch (error) {
    console.log(error.message);
  }
}

fetchData(baseUrl);
