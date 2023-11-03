package StackUsingLL;

public class StackLL {
	private static Node top;
	public static class Node
	{
		String data;
		Node next;
		public Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static boolean isStackEmpty(){
		return top==null;		
		
	}
	
	public static void pushStack(String data) {
		Node newNode = new Node(data);
		if(isStackEmpty())
		{
			top=newNode;
			System.out.println("element Pushed : "+newNode.data );
			
		}
		else
		{
			newNode.next=top;
			top=newNode;
			System.out.println("element Pushed : "+newNode.data );
		}
	}
	
	public static void popStack()
	{
		if(isStackEmpty())
		{
			
			System.out.println("Stack is empty " );
			
		}
		else
		{
			String delData = top.data;
			top=top.next;
			System.out.println("Element popped : "+delData);
		}
	}
	
	public static void peekStack()
	{
		if(isStackEmpty())
		{
			
			System.out.println("Stack is empty " );
			
		}
		else
		{
			System.out.println("Peeked data from stack : "+top.data);
		}
		
	}
	
	public static void displayStack() {
		Node trav=top;
		while(trav!=null)
		{
			System.out.println(trav.data);
			trav=trav.next;
		}
		System.out.println("");
	}

}
