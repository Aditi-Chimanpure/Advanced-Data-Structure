package sortingAlgo;

import java.util.Arrays;

public class BubbleSortForLoop {

	public static void main(String[] args) {
		//int arr[]= {6,4,2,8,3,1};
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println("before sort");
		System.out.println(Arrays.toString(arr));
		bubbleSorting(arr);
		System.out.println("after sort");
		System.out.println(Arrays.toString(arr));

	}
	
	public static void bubbleSorting(int arr[]) {
		boolean swapflag=false;
		for(int i = 0;i<arr.length;i++)
		{//minus i will help to reduce unnecesary iterations after right positions are final
			for(int j=0;j<arr.length-1-i;j++)
			{
				
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapflag=true;
					
				}
			}
			if(swapflag==false)
				break;
			System.out.println(Arrays.toString(arr));
		}
	}

}
