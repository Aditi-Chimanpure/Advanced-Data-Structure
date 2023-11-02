package StackTwo;

public class Stack {
	public static int n =10;
	public static int stack []= new int[n];

	public  static int top=-1;
	
	public void pushStack(int element) {
		if(top==stack.length){
			System.out.println("Stack is full");
		}
		else{
			top=top+1;
			
			stack[top]=element;
			System.out.println("element "+element+" added onto stack ");
		}

}
	public  void popStack()
	{
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else
		{
		int element = stack[top];
		top=top-1;
		System.out.println("Element "+element+" popped from the stack ");
		}
	}
	public  void Display() {
		if(top==-1)
		{
			System.out.println("Stack is empty");
		}
		else {
		for(int i = top;i>=0;i--) {
			System.out.println(stack[i]+" ");
		}
		}
	}
	public void peekStack()
	{
		System.out.println(stack[top]);
	}
	
	public void searchStack(int position) {
		System.out.println(stack[position-1]);
	}

}
