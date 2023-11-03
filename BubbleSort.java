package sortingAlgo;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {6,4,2,8,3,1};
		System.out.println("before sort");
		System.out.println(Arrays.toString(arr));
		int count = arr.length;
		
		while(count!=0) {
		int i=0;
		while(i<arr.length-1)
		{
			int j =i+1;
			if(arr[i]>arr[j])
			{
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
			i++;
			j++;
		}
		count--;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
