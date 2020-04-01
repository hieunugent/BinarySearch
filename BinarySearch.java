class BinarySearch{
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
    return  binarySearch(array, target, 0, array.length-1);
  }
	public static int binarySearch(int[] array, int target, int start, int end){
		if (start > end) {return -1;}
		int middle = (start + end) /2;
		if (target == array[middle]){
			return middle;
		}
		else if(target > array[middle]){
    return  binarySearch(array, target, middle+1, end);
		}
		else {
    return  binarySearch(array, target, start, middle-1);
		}	
	}
}
