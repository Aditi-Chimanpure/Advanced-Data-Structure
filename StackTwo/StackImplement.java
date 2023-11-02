package StackTwo;
import static StackTwo.Stack.*;
import java.util.Scanner;


public class StackImplement {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Stack s = new Stack();
		boolean flag= false;
	while(!flag)
	{
		System.out.println("Menu :  \n1.push\n2.pop\n3.display\n4.peek \n6.exit");
		System.out.println("enter your choice");
		switch (sc.nextInt()) {
		case 1:
			System.out.println("Enter the element to be added");
			s.pushStack( sc.nextInt()) ;
			
			break;
		case 2:
			s.popStack();
			break;
		case 3:
			s.Display();
			break;
		case 4:
			s.peekStack();
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
