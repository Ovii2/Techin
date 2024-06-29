/* 2.Parašykite funkciją, kuri klausinėtų „Ar norėtumėt monetos?“, ir reaguotų į atsakymą 
„Taip“ pridėdama po vieną monetą prie turimų monetų sumos ir išvesdama, kiek monetų turite. 
Jeigu į klausimą atsakote „Ne“ funkcija baigia darbą. Pradžioje turite 0 monetų. Panaudokite while 
loop.  */

const askForCoin = () => {
  let counter = 0;
  let question = prompt(`Ar norėtumėt monetos?`);
  try {
    while (question.toLowerCase() === "taip") {
      counter += 1;
      alert(`Jus turite ${counter} monetą/as.`);
      question = prompt(`Ar norėtumėt monetos?`);
    }
    alert("Iki!");
  } catch (error) {
    throw new Error(error.message);
  }
};
askForCoin();
