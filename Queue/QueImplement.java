package Queue;

import java.util.Scanner;

public class QueImplement {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	 Queue q=new  Queue(3);
	 boolean flag= false;
		while(!flag)
		{
			System.out.println("\nMenu :  \n1.add\n2.remove \n3.display\n4.peek \n6.exit");
			System.out.println("enter your choice");
			switch (sc.nextInt()) {
			case 1:
				if(!q.isQueFull()) {
				System.out.println("Enter the element to be added");
				q.enQue(sc.nextInt());
				}
				else {
					System.out.println("Que is full");
				}
				
				break;
			case 2:
				q.deQue();
		
				break;
			case 3:
				q.display();
				
				break;
			case 4:
			q.peek();
				break;
		
			case 5 :
				flag = true;
				break;
				

			default:
				break;
			}
		}
			
	 

	}

}
