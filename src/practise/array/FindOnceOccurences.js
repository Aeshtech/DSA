/* p2 Find the elements that appears once in an array  */

const arr = [1, 2, 3, 2, 4, 5, 1, 5, 6];
const uniqueElements = [];

for (let i = 0; i < arr.length; i++) {
  let count = 0;
  // Check if the current element exists anywhere else in the array
  for (let j = 0; j < arr.length; j++) {
    if (arr[i] === arr[j]) {
      count++;
    }
  }

  // If count is 1, the element appears only once
  if (count === 1) {
    uniqueElements.push(arr[i]);
  }
}

console.log("Unique elements:", uniqueElements); // Output: [3, 4, 5, 6]
