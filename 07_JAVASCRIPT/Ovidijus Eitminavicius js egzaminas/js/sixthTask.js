/* 6.Panaudodami for loop konsolėje atspausdinkite eglutę, kaip parodyta paveikslėlyje. Parašykite 
funkciją, kuri priima eglutės eilučių skaičių ir išspausdina eglutę. */

function drawTree(n) {
  try {
    for (let i = 0; i <= n; i += 1) {
      let tree = " ";
      for (let j = 1; j <= n - i; j += 1) {
        tree += " ";
      }
      for (let k = 0; k <= i; k += 1) {
        tree += "* ";
      }
      console.log(tree);
    }
  } catch (error) {
    throw new Error(error.message);
  }
}

drawTree(20);
