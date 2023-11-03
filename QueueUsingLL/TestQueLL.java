package QueueUsingLL;

import java.util.Scanner;
import java.util.Scanner;
import StackUsingLL.StackLL;

public class TestQueLL {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		QueLL ql=new QueLL();
		
		
		boolean flag = false;
		while (!flag) {
			
			System.out.println("Menu :\n1.check if queue empty");
			System.out.println("2.Enque");
			System.out.println("3.Deque");
			System.out.println("4.peek");
			System.out.println("5.display all stack elemets ");
			System.out.println("0.exit");
			System.out.println("enter your choice");
			switch (sc.nextInt()) {
			case 1:
				if(ql.isQueEmpty())
				{
					System.out.println("Queue is Empty");
				}
				else
				{
					System.out.println("Queue is Not Empty");
				}
				break;
			case 2:
				
				System.out.println("Enter the data to be pushed onto the stack : ");
				ql.enque(sc.next());
				
				break;
			case 3:
				ql.deque();
				
				
				break;
			case 4:
				ql.peek();
				break;
			case 5 : 
				ql.displayAll();
				break;

			case 0:
				flag = true;
				break;

			default:
				break;
			}
		}


	}

}
