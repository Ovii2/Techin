/* 4.Parašykite funkciją, kuri priima šį objektų masyvą ir suranda jauniausio ir vyriausio žmogaus 
metus, taip pat skirtumą metais, tarp jauniausio ir vyriausio. Grąžina atsakymą objektu: {youngest: 
13, oldest: 67, difference: 54} */

const input = [
  {
    name: "John",
    age: 13,
  },
  {
    name: "Mark",
    age: 56,
  },
  {
    name: "Rachel",
    age: 45,
  },
  {
    name: "Nate",
    age: 67,
  },
  {
    name: "Jennifer",
    age: 65,
  },
];

const findAgeDifference = (arr) => {
  try {
    const allAges = arr.map(({ age }) => age);

    const oldest = Math.max(...allAges);
    const youngest = Math.min(...allAges);

    const difference = oldest - youngest;
    return { oldest, youngest, difference };
  } catch (error) {
    throw new Error(error.message);
  }
};
console.log(findAgeDifference(input));
