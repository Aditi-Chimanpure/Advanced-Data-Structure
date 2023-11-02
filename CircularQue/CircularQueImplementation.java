package CircularQue;
import java.util.Scanner;

public class CircularQueImplementation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean flag = false;

		CircularQue cq = new CircularQue(4);
		while(!flag)
		{
			System.out.println("MENU: 1.Add\n2.Delete element\n3.peek \n4.display all \n5.exit");
			System.out.println("Enter your choice : ");
			switch (sc.nextInt()) {
			case 1:
				System.out.println("Enter element to add");
				cq.enque(sc.nextInt());
				
				break;
			case 2:
				System.out.println("Deleted element form que "+cq.deque());
				break;
			case 3:
				cq.peekQue();
				break;
			case 4:
				cq.Display();
				break;
			case 5:
				flag= true;
				break;

			default:
				System.out.println("Enter valid choice ");
				break;
			}
		}

	}

}
