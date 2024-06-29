const person = { firstName: "Daniel", lastName: "Smith", age: 28 };

// const { lastName } = person;
const { lastName: surname } = person;
console.log(surname);

// console.log(person.lastName);

const printFullName = ({ firstName, lastName }) =>
  console.log(`Full name is ${firstName} ${lastName}`);

printFullName(person);
