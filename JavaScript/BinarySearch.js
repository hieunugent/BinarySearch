function binarySearch(array, target){
  return binarySearchHelper(array, target, 0, array.length -1);
}
function binarySearchHelper(array, target, left, right){
  while(left <= right){
    const middle = Math.floor((left + right)/2);
    const midValue = array[middle];
    if(target === midValue){
      return middle;
    }
    else if(target < midValue){
      right = middle -1;
    }else{
      left = middle +1;
    }
  }
  return -1;
}
