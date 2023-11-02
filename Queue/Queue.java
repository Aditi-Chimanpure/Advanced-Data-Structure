package Queue;

public class Queue {
	static int que[];
	static int front=-1;
	static int rear = -1;
	static int n;
	public Queue(int n) {
		que=new int[n];
		this.n=n;
	}
	public boolean isQueEmpty() {
		return rear==-1;
		
	}
	public boolean isQueFull() {
		return rear==n-1;
		
	}
	public void enQue(int ele) {
		if(rear==n-1)
		{
			System.out.println("Que is full");
		}
		else
		{
			rear+=1;
			
			que[rear]= ele;
			System.out.println("Element "+ele+" is added into the que");
		}
	}
	
	public void deQue() {
		if(isQueEmpty())
		{
			System.out.println("Que is empty");
		}
		else {
			int first = que[0];
			for(int i =0 ;i<=rear;i++)
			{
				que[i]=que[i+1];
			}
			rear--;
			System.out.println("Element "+first+ "is removed");
		}
		
	}
	public void display()
	{
		if(isQueEmpty())
		{
			System.out.println("Que is empty");
		}
		else
		{
			for(int i = 0;i<=rear;i++)
			{
				System.out.print(que[i]+" ");
			}
		}
	}
	public void peek()
	{
		System.out.println("Peek "+ que[0]);
	}

}
