/* ## Implement a function `isLandscape` that can detect whether an image is landscape.
The function should take two parameters: the width and height of an image. 

If width is greater than height, then the image is landscape and function return true. Otherwise - if the height is greater than the width - it returns false, then the image is portrait.

Store image parameters comparision result into boolean variable, then use boolean variable in `if` statement. */

function isLandscape(width, height) {
  //   return width > height ? `The image is landscape` : `The image is portrait`;
  if (width > height) return `The image is landscape`;
  if (width < height) return `The image is portrait`;
  if (width === height) return `Check your data`;
}

console.log(isLandscape(200, 300));
console.log(isLandscape(700, 600));
console.log(isLandscape(100, 100));
