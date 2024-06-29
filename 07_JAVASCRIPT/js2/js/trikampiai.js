/* Duoti trijų atkarpų ilgiai a, b ir c.
Parašykite programą, kuri išvestų į ekraną, kokį trikampį
galima sudaryti iš duotų atkarpų: lygiašonį, lygiakraštį,
statųjį, įvairiakraštį. Yra žinoma,
kad trikampį galima sudaryti tik tada, kai bet kurių dviejų
kraštinių suma yra didesnė
už trečiąją.
Stačiojo trikampio kraštinės tenkina Pitagoro teoremą:
įţambinės (ilgiausios kraštinės) kvadratas yra lygus statinių (trumpesniųjų kraštinių)
kvadratų sumai. Jei
trikampio sudaryti negalima, į ekraną turi būti išvedamas
pranešimas: „Trikampio sudaryti
negalima“. */

function triangle(a, b, c) {
  if (a + b > c && a + c > b && b + c > a) {
    if (a === b && b === c && a === c) return `Trikampis lygiakrastis`;
    if (a === b || a === c || b === c) return `Trikampis lygiasonis`;
    if (a ** 2 + b ** 2 === c ** 2 || a ** 2 + c ** 2 === b ** 2 || b ** 2 + c ** 2 === a ** 2)
      return `Trikampis status`;
    return `Trikampis ivairiakrastis`;
  }
  return `Trikampio sudaryti negalima`;
}

console.log(triangle(4, 4, 4));
console.log(triangle(3, 4, 5));
console.log(triangle(5, 8, 8));
console.log(triangle(4, 5, 6));
console.log(triangle(1, 4, 7));
