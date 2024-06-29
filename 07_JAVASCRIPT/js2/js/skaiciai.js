/*
Ant popieriaus lapo užrašyti keturi natūralieji skaičiai: A, B, C, D. Po to du iš jų buvo
nutrinti (juos žymėsime nuliais). Reikia atstatyti nutrintuosius skaičius, jeigu žinoma, kad
yra likęs bent vienas iš skaičių A ir B ir kad skaičiai tenkino šitokias lygybes: C = A + B ir
D = A*B. Parašykite programą šiam uždaviniui spręsti.
*/

function skaiciai(a, b, c, d) {
  if (a > 0 && b > 0) {
    c = a + b;
    d = a * b;
  }
  if (a > 0 && c > 0) {
    b = c - a;
    d = a * b;
  }
  if (b > 0 && b > 0) {
    a = c - b;
    d = a * b;
  }
  if (a > 0 && d > 0) {
    if (d > a) {
      b = d / a;
    }
    if (a > d) {
      b = a / d;
    }
    c = a + b;
  }
  if (b > 0 && a > 0) {
    if (d > b) {
      a = d / b;
    }
    if (b > d) {
      a = b / d;
    }
    c = a + b;
  }
  return { a, b, c, d };
}

console.log(skaiciai(0, 15, 0, 15));
console.log(skaiciai(0, 5, 10, 0));
console.log(skaiciai(8, 0, 0, 88));
console.log(skaiciai(8, 0, 88, 0));
console.log(skaiciai(0, 15, 0, 10));
console.log(skaiciai(1, 15, 16, 15));
