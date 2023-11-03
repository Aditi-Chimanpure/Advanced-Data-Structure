package sortingAlgo;

import java.util.Arrays;

public class SelectionSortTest {

	public static void main(String[] args) {
		
		int arr[]= {6,4,2,8,3,1};
		System.out.println("before sort");
		System.out.println(Arrays.toString(arr));
	

		selctionSorting(arr);
		System.out.println("");
		System.out.println("After sort");
		System.out.println(Arrays.toString(arr));
		
		
	

	}
	
	public static void selctionSorting(int arr[] )
	{
		
		for(int i = 0 ;i<arr.length-1;i++) {
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]>arr[j])
				{
					int temp =arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}System.out.println(Arrays.toString(arr));
			
		}
		Arrays.toString(arr);

	}

}
