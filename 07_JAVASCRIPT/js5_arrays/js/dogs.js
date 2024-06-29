// Parasyti funkcija kuri grazina sunu vardu masyva
// const dogName = (dogsArr) => dogsArr.map((d) => d.name);

const dogsArr = [
  { name: "Dog", age: 4 },
  { name: "Dog2", age: 6 },
  { name: "Dog3", age: 8 },
];

const dogName = (dogsArr) => dogsArr.map((dog) => dog.name);

console.log(dogName(dogsArr));
