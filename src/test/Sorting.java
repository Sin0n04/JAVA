package test;

public class Sorting {

	public static int[] insertSort(int[] arr)  {
		int n = arr.length;
		for(int i = 1 ; i < n ; i++) {
			int insert_index = i;
			int current_value = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > current_value) {
				 arr[j+1] = arr[j];
				 insert_index = j;
				 j--;
			 }
			 arr[insert_index] = current_value;
			
		}
		
		System.out.println("Sorted array: ");
		for(int value : arr) {
			System.out.print(value + " | ");
		}
		
		return arr;
	}

}
