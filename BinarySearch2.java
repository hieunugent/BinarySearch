class BinarySearch2{
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
    return binarySearch(array, target, 0, array.length -1);
  }
	public static int binarySearch(int[] array, int target, int left, int right){
		while (left <= right){
			int middle = (left + right )/2;
			int midValue = array[middle];
			if(target == midValue){
				return middle;
			}
			else if (target < midValue){
				right = middle -1;
			}
			else{
				left = middle +1;
			}
		}
		return -1;
	}
}
