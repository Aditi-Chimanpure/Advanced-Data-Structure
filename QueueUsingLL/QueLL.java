package QueueUsingLL;

public class QueLL {
	private static Node front;
	private static Node rear;
	public static class Node{
		String data;
		Node next;
		public Node(String data)
		{
			this.data=data;
			this.next=null;
		}
	}
	
	public static boolean isQueEmpty()
	{
		return front==null;
	}
	
	public static void enque(String data)
	{
		Node newNode = new Node(data);
		if(isQueEmpty())
		{
			front=newNode;
			rear=newNode;
			System.out.println("Element added in que : "+ newNode.data);
		}
		else {
			rear.next=newNode;
			rear=newNode;
			System.out.println("Element added in que : "+ newNode.data);
		}
	}
	
	public static void deque()
	{
		if(isQueEmpty())
		{
			System.out.println("Que is empty ");
		}
		else
		{
			String delData= front.data;
			front =front.next;
			System.out.println("Deleted element : "+delData);
		}
	}
	
	public static void peek()
	{
		if(isQueEmpty())
		{
			System.out.println("Que is empty ");
		}
		else
		{
			System.out.println("Peeked data from que : "+front.data);
		}
		
	}
	public static void displayAll() {
		Node trav = front;
		while(trav!=null)
		{
			System.out.println(trav.data+" -> ");
			trav=trav.next;
		}
	}

}
