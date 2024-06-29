/* Darbo dienomis vaisių kainos yra:
Bananai: 2.50
Obuoliai: 1.20
Apelsinai: 0.85
Kivi: 2.70.
Savaitgaliais:
Bananai: 2.70
Obuoliai: 1.25
Apelsinai: 0.90
Kivi: 3.
 
Parašykite fukciją, kuri priima kokį vaisių, kokį kiekį ir kurią dieną perkame ir grąžina kiek kainuos pirkinys. Perkame vieną vaisių. */

function fruitShop(fruit, day, quantity) {
  let price = 0;
  switch (day) {
    case "Monday":
    case "Tuesday":
    case "Wednesday":
    case "Thursday":
    case "Friday":
      switch (fruit) {
        case "banana":
          price = quantity * 2.5;
          break;
        case "apple":
          price = quantity * 1.2;
          break;
        case "orange":
          price = quantity * 0.85;
          break;
        case "kiwi":
          price = quantity * 2.7;
          break;
        default:
          console.log("error");
          return;
      }
      break;
    case "Saturday":
    case "Sunday":
      switch (fruit) {
        case "banana":
          price = quantity * 2.7;
          break;
        case "apple":
          price = quantity * 1.25;
          break;
        case "orange":
          price = quantity * 0.9;
          break;
        case "kiwi":
          price = quantity * 3;
          break;
        default:
          console.log("error");
          return;
      }
      break;
    default:
      console.log("error");
      return;
  }
  console.log(price.toFixed(2));
}

fruitShop("orange", "Sunday", "3");
