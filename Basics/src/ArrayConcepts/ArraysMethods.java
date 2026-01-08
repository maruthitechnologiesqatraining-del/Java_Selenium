package ArrayConcepts;
import java.util.Arrays;
public class ArraysMethods {

	public void foreachLoopArray() {
		int[] arr = {5,10,15,20,25};
		System.out.println("Array values using for-each loop:");
		//for-each loop is used to iterate through array elements. no need to initialize counter variable and condition check is not required and increment statement is also not required
		//by default initializes value is 0 to counter variable and increments by 1 until it reaches the end of the array 
		//find end of array considered by null value
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("***********************");
	}
	
	public  void arraySort() {
		int[] arr = {50,20,10,40,30};
		System.out.println("Array values before sorting:");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("***********************");
		Arrays.sort(arr); //importing Arrays class from java.util package
		System.out.println("Array values after sorting:");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("***********************");
	}
	
	public void arraySortUsingStrings() {
		String[] arr = {"Banana","Apple","Orange","Mango","Grapes"};
		System.out.println("Array values before sorting:");
		for(String i:arr) {
			System.out.println(i);
		}
		System.out.println("***********************");
		Arrays.sort(arr); //importing Arrays class from java.util package
		System.out.println("Array values after sorting:");
		for(String i:arr) {
			System.out.println(i);
		}
		System.out.println("***********************");
	}
	
	public void copyOfArray() {
		int[] arr = {1,2,3,4,5};
		System.out.println("Original Array:");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("***********************");
		int[] copiedArray = Arrays.copyOf(arr, arr.length); //copying original array to new array
		System.out.println("Copied Array:");
		for(int i:copiedArray) {
			System.out.println(i);
		}
		System.out.println("***********************");
	}
	
	public void fillArray() {
		int[] arr = new int[5];
		Arrays.fill(arr,10); //filling all array elements with a specific value
		System.out.println("Array values after filling with 10:");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("***********************");
		arr[2] = 20; //overriding specific index value
		System.out.println("Array values after overriding index 2 with 20:");
		for(int i:arr) {
			System.out.println(i);
		}
		System.out.println("***********************");
	}
	
	public void arrayLength() {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Length of the array is: " + arr.length);
		System.out.println("***********************");
		
	}
	
	public void equalsArray() {
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,2};
		boolean isEqual = Arrays.equals(arr1, arr2);
		System.out.println("Are both arrays equal? " + isEqual);
		System.out.println("***********************");
	}
	
	public void toStringArray() {
		int[] arr = {1,2,3,4,5};
		String arrString = Arrays.toString(arr);
		System.out.println("Array as String: " + arrString);
		System.out.println("Data types of arr :"+ arrString.getClass().getSimpleName());
		System.out.println("***********************");
	}
	
	public void binarySearchArray() {
		int[] arr = {10,20,30,40,50};
		int key = 3;
		//return value is index of the search key, if it is contained in the array; otherwise, 
		//(-(insertion point) - 1). The insertion point is defined as the point at which the key would be inserted into the array:
		//the index of the first element greater than the key, or a.length if all elements 
		//in the array are less than the specified key. Note that this guarantees that the return value will be >= 0 
		//if and only if the key is found.
		int result = Arrays.binarySearch(arr, key);
		if(result >= 0) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found in the array.");
		}
		System.out.println("***********************");
	}
	public static void main(String[] args) {
		ArraysMethods obj = new ArraysMethods();
		obj.foreachLoopArray();
		obj.arraySort();
		obj.arraySortUsingStrings();
		obj.copyOfArray();
		obj.fillArray();
		obj.arrayLength();
		obj.equalsArray();
		obj.toStringArray();
		obj.binarySearchArray();
		int arr[] = new int[6];
		arr[0] = 10;  //assign value to position 0
		System.out.println("Store value at 0 position:"+arr[0]); //getting values from array of position 0
		arr[0] = 20;
		System.out.println("Override 0 position values:"+arr[0]);
		System.out.println("All values in array :"+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		System.out.println("***********************");
		arr[1] = 30;
		arr[2] = 40;
		arr[3] = 50;
		arr[4] = 60;
		System.out.println("All values in array after assigning all position values :"+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]);
		arr[5] = 70;
		System.out.println("All values in array after assigning all position values :"+arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3]+" "+arr[4]+" "+arr[5]);
		for(int i=0;i<arr.length;i++) {
			System.out.println("Array values using for loop at index "+i+" :"+arr[i]);
		}
		System.out.println("***********************");
		
		int[] arr_literals = {1, 2, 3, 4, 5};
		System.out.println("Array values using literals:");
		System.out.println(arr_literals[0]+" "+arr_literals[1]+" "+arr_literals[2]+" "+arr_literals[3]+" "+arr_literals[4]);
		
		for(int i=0;i<arr_literals.length;i++) {
			System.out.println("Array values using for loop at index "+i+" :"+arr_literals[i]);
		}
	}

}
