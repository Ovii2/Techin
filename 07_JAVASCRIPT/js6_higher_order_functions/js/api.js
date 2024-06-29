// CRUD

// create - POST
// read - GET
// update - PUT,PATCH
// delete - DELETE
const endpoint = 'https://jsonplaceholder.typicode.com/posts/';

async function fetchData() {
  //   const apiUrl = url;
  try {
    const response = await fetch(endpoint);
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.log(error.message);
  }
}

fetchData();
