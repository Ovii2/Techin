function getDays(str) {
  switch (str) {
    case "January":
      console.log(30);
      break;
    case "February":
      console.log(28);
      break;
    case "March":
      console.log(31);
      break;
    case "April":
      console.log(30);
      break;
    case "May":
      console.log(31);
      break;
    case "June":
      console.log(30);
      break;
    case "July":
      console.log(31);
      break;
    case "August":
      console.log(31);
      break;
    case "Septemper":
      console.log(30);
      break;
    case "October":
      console.log(31);
      break;
    case "November":
      console.log(30);
      break;
    case "December":
      console.log(31);
      break;
    default:
      console.log("Error");
      break;
  }
}

console.log(getDays("October"));
console.log(getDays("December"));
console.log(getDays("Apple"));
