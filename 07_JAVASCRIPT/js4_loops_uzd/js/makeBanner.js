/* ## Write a function "makeBanner" which is given some text and returns a banner with a border surrounding the text. The border should stretch to the length of the text.

- Example:
  - makeBanner('Welcome to DigitalCrafts')
    `****************************`
    `* Welcome to DigitalCrafts *`
    `****************************` */

const makeBanner = (text) => {
  let border = '';
  for (let i = 0; i < text.length + 4; i += 1) {
    border += '*';
  }
  return `${border}\n* ${text} *\n${border}`;
};
console.log(makeBanner('Welcome to DigitalCrafts'));
console.log(makeBanner('TECHIN'));
