//utility
function swap(arr, index1, index2){
  const temp = arr[index1];
  arr[index1] = arr[index2];
  arr[index2] = temp;
}

//insertion sort works iteratively inserting the element at its correct position in alreaady sorted part by swapping the adjacent elements;
function insertionSort(arr){
  const n = arr.length;
  for(let i=0; i<=n-1; i++){
    let j = i;
    while(j > 0 && arr[j-1] > arr[j]){
      swap(arr, j-1, j);
      j--;
    }
  }
}

// Testing the insertion sort algorithm with a large random array of 100,000 elements
const arr = Array.from({ length: 100000 }, () =>
    Math.floor(Math.random() * 100000)
);

console.log("Unsorted Array:", arr.splice(0, 20)); // Displaying only the first 20 elements for brevity
const cloneArr = [...arr];
const start = performance.now();
// insertionSort(cloneArr);
cloneArr.sort((a, b) => a - b); // Using built-in sort for comparison
const end = performance.now();
console.log("Sorted Array:", cloneArr.splice(0, 20)); // Displaying only the first 20 elements for brevity

console.log(`Time Taken: ${(end - start).toFixed(4)} ms`);
