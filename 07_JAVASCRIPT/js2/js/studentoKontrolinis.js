/* Studentas kontrolinį darbą pradėjo spręsti,
kai elektroninis laikrodis rodė h valandų,
m minučių ir s sekundžių, o baigė, kai buvo h1 valandų,
m1 minučių ir s1 sekundžių.Sudarykite programą,
kuri suskaičiuotų, kiek laiko (valandų, minučių ir
sekundžių) sprendė studentas kontrolinį darbą. Laikykite,
kad studentas kontrolinį darbą rašė mažiau kaip parą. */

function countTime(startH, startM, startS, finishH, finishM, finishS) {
  const startTime = startH * 3600 + startM * 60 + startS;
  const finishTime = finishH * 3600 + finishM * 60 + finishS;
  const taskTime = finishTime - startTime;

  const seconds = taskTime % 60;
  const minutes = Math.floor(taskTime / 60);
  const hours = Math.floor(taskTime / 3600);

  return `Total time: Hours ${hours} Minutes ${minutes} Seconds ${seconds}`;
}

console.log(countTime(3, 20, 5, 4, 5, 0));
