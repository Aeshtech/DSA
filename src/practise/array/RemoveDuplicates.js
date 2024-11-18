/* 
We need to remove duplicate elements from the array without using any built in function 

OR

we need to find unique elements from the orignal array.
*/

const arr = [1, 2, 3, 2, 4, 5, 1, 5, 6];
const newArr = [];
let isFoundDuplicate = false;

for (let i = 0; i < arr.length; i++) {
  isFoundDuplicate = false;
  for (let j = i + 1; j < arr.length; j++) {
    if (arr[i] === arr[j]) {
      isFoundDuplicate = true;
      break;
    }
  }
  //if duplicate flag is true then don't push it into new arr
  if (!isFoundDuplicate) {
    newArr.push(arr[i]);
  }
}
console.log(newArr);
