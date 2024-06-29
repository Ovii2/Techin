/* Write a JavaScript function `calcArea` to return the area of a triangle where lengths of the three of its sides are 5, 6, 7. Use Heron's Formula. Round result to 2 decimal places.

- Example:
  - calcArea(5, 6, 7); --> 14.70 */

function calcArea(side1, side2, side3) {
  const perimeter = (side1 + side2 + side3) / 2;
  const area = Math.sqrt(
    perimeter * (perimeter - side1) * (perimeter - side2) * (perimeter - side3)
  );
  return area;
}

console.log(calcArea(5, 6, 7).toFixed(2));
