const endpoint = "https://jsonplaceholder.typicode.com/posts/";

async function fetchData(url) {
  const apiUrl = url;
  try {
    const response = await fetch(apiUrl);
    const data = await response.json();

    let mainEl = document.querySelector("#root");
    data.forEach(({ title, body }) => {
      mainEl.innerHTML += `<div class="card">
      <h1 class='post-title'>${title}</h1>
      <p>${body}</p>
      </div>
      `;
    });
    console.log(data);
  } catch (error) {
    console.log(error.message);
  }
}

fetchData(endpoint);
