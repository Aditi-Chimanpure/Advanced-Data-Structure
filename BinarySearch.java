package searchingAlgo;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.println("Enter the element to be search");
		int key=sc.nextInt();
		int left = 0;
		int right = arr.length-1;
		int mid=(left+right)/2;
		while(left<=right)
		{
			if(key==arr[mid])
			{
				System.out.println("Key "+arr[mid]+" found at index "+mid+" position "+(mid+1));
				System.exit(0);
			}
			else if(key>arr[mid])
					{
						left = mid+1;
						mid=(left+right)/2;
					}
			else if(key<arr[mid])
			{
				right = mid-1;
				mid=(left+right)/2;
			}
		}
		System.out.println("Key not found");
	    

	}

}
