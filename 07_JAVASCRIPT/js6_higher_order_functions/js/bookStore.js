const endpoint = "https://fakestoreapi.com/products/";

/*  1. Parašykite funkciją, kuri atspausdintų visą knygų sąrašą (knygos eilės numerį ir pavadinimą. 
Panaudokite metodą map. */
const printProducts = (productsArr) => {
  productsArr.forEach((product) => {
    // console.log(`${product.id}.${product.title}`);
    const { id, title } = product;
    console.log(`${id}.${title}`);
  });
};

/* 2. Parašykite funkciją, kuri paskaičiuotų, kiek knygų yra lentynoje. */
const countProducts = (productsArr) => console.log(`Total products: ${productsArr.length}`);

/* 3. Parašykite funkciją, kuri į duoto knygų masyvo galą pridėtų knygą.
Pvz. 'Knyga #6', kaina 2,75. Panaudokite metodą push(). */
const product = {
  id: 21,
  title: "Test",
  price: 99.99,
  description: "Test description",
  category: "Test category",
  image: "https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg",
  rating: {
    rate: 3.9,
    count: 225,
  },
};

// const addProduct = (productArr, newProduct) => {
//   const newArray = productArr;
//   newArray.push(newProduct);
//   console.log(newArray);
// };

/* 4. Parašykite funkciją, kuri išvestų paskutinės knygos pavadinimą ir kainą. */
// const lastProduct = (productsArr) => {
//   const last = productsArr[productsArr.length - 1];
//   console.log(`Last product title: ${last.title}. Price : ${last.price}€`);
// };

/* 5. Parašykite funkciją suskaičiuojančią, už kiek eurų yra knygų knygyne. */
// const countTotalPrice = (productsArr) => {
//   const totalPrice = productsArr.reduce((sum, { price }) => sum + price, 0);
//   console.log(`Total all products price is : ${totalPrice.toFixed(2)}€`);
// };

/* 6. Parašykite funkciją, kuri apskaičiuotų 25 % nuolaidą knygoms, kurių kaina didesnė nei 10 eurų ir atspausdintų: */
// const countDiscount = (productsArr) => {
//   productsArr.forEach(({ price, title }) => {
//     if (price > 10) {
//       const fullPrice = price;
//       const discountedPrice = fullPrice - fullPrice * 0.25;
//       console.log(
//         `!!! Nukainuota !!!\nProduktas: ${title} Sena Kaina: ${fullPrice}€ Pardavimo kaina: ${discountedPrice.toFixed(
//           2
//         )}€ Pritaikyta nuolaida -25%`
//       );
//     }
//   });
// };

/* 7.Parašykite kodą, kuris išrikiuotų knygas nuo pigiausios iki brangiausios. */
// const sortByPrice = (productArr) => {
//   const sorted = productArr.sort((a, b) => a.price - b.price);
//   console.log(sorted);
// };

/* 8. Analogiškai išrikiuokite knygas pagal pavadinimus, nuo A iki Z. Prieš tai pakoreguokite knygų pavadinimus masyve.

nuo A iki Z

nuo Z iki A */
// const sortBytitleAtoZ = (productArr) => {
//   const sorted = productArr.sort((a, b) => a.title.localeCompare(b.title));
//   console.log(sorted);
// };

// const sortBytitleZtoA = (productArr) => {
//   const sorted = productArr.sort((a, b) => b.title.localeCompare(a.title));
//   console.log(sorted);
// };

/* 9.Atspausdinkite knygas, kurios yra brangesnės nei 7,5 eur. Panaudokite metodą filter(). */
// const expensiveBooks = (productsArr) => console.log(productsArr.filter(({ price }) => price > 75));

async function fetchData() {
  try {
    const response = await fetch(endpoint);
    const data = await response.json();
    console.log(data);
    // printProducts(data);
    // countProducts(data);
    // addProduct(data, product);
    // lastProduct(data);
    // countTotalPrice(data);
    // countDiscount(data);
    // sortByPrice(data);
    // sortBytitleAtoZ(data);
    // sortBytitleZtoA(data);
    // expensiveBooks(data);
  } catch (error) {
    console.error(error.message);
  }
}

fetchData();
