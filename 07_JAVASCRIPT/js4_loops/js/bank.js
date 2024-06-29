/* 2. While:
Bankas moka indėlininkui p (p>0) procentų palūkanų per metus. 
Parašykite programą, kuri apskaičiuotų, po kiek metų šimto eurų indėlis taps didesnis už milijoną.

Ats: Palūkanų procentas 5, tai metų 191. */

function bank(p, money) {
  let year = 0;
  const interest = p / 100;

  while (money < 1_000_000) {
    money = money * interest + money;
    year += 1;
  }
  return year;
}

console.log(bank(5, 100));
