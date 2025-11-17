package Searching;

public class BinarySearch {
	
	public int binarySearchIterative(int[] arr, int target ) {
		
		int low = 0;
		int high = arr.length-1;
		int mid;
		
		while(low <= high ) {
			
			mid = low + (high - low)/2;
			
			if(arr[mid] == target) return mid;
			
			if(target > arr[mid] ) {
				// search on left side
				low = mid+1;
			}
			
			if(target < arr[mid] ) {
				// search on right side
				high = mid-1;
			}
			
		}
		// element not found
		return -1;
		
	}
	
	public int binarySearchRecursive(int[] arr, int low, int high, int target) {
		
		int mid;
		
		if(low <= high ) {
			
			mid = low + (high- low)/2;
			
			if(arr[mid] == target ) return mid;
			
			if( target > mid ) {
				// search on left side
				low = mid +1;
			}
			
			if( target < mid ) {
				// search on right side
				high = mid -1;
			}
			
			return binarySearchRecursive(arr, low, high, target);
			
		}
		
		return -1;
	}
	
	public static void main(String[] args ) {
		 
		BinarySearch obj = new BinarySearch();

		// int[] arr = {3,6,8,12,14,17,25,29,31,36,42,47,53,55,62};
		int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
		
		int res = obj.binarySearchIterative(arr, 56);
		int res1 = obj.binarySearchRecursive(arr, 0, arr.length-1, 56);
		
		if (res == -1)
            System.out.println(
                "Element is not present in array");
        else
            System.out.println("Element is present at "
                               + "index " + res);
	
		if (res1 == -1)
            System.out.println(
                "*Element is not present in array");
        else
            System.out.println("*Element is present at "
                               + "index " + res1);
		
	}
}