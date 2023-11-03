package StackUsingLL;

import java.util.Scanner;

public class StackLLTester {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StackLL st =new StackLL();
		
		boolean flag = false;
		while (!flag) {
			
			System.out.println("Menu :\n1.check if stack empty");
			System.out.println("2.push");
			System.out.println("3.pop");
			System.out.println("4.peek");
			System.out.println("5.display all stack elemets ");
			System.out.println("0.exit");
			System.out.println("enter your choice");
			switch (sc.nextInt()) {
			case 1:
				if(st.isStackEmpty())
				{
					System.out.println("Stack is Empty");
				}
				else
				{
					System.out.println("Stack is NOT Empty");
				}				

				break;
			case 2:
				
				System.out.println("Enter the data to be pushed onto the stack : ");
				st.pushStack(sc.next());
				
				break;
			case 3:
				
				st.popStack();
				
				break;
			case 4:
				st.peekStack();
				break;
			case 5 : 
				st.displayStack();
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
