package selectionSort;

import java.util.stream.IntStream;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = {9,7,4,8,1,6,3,2,5};
		
	IntStream.range(0, arr.length-1).forEach(i->{
		int index = i;
		for(int j=i+1;j<arr.length;j++) {
			if(arr[j]<arr[index]) {
				index = j;
			}
		}
		int smallNumber = arr[index];
		arr[index] = arr[i];
		arr[i] = smallNumber;
	});
  
		for(int data : arr) {
			System.out.print(data+" ");
		}
	}
}
