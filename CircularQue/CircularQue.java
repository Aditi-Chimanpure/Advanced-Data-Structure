package CircularQue;

public class CircularQue {
	private static int arr[];
	private static int front=-1;
	private static int rear=-1;
	private static int size;

	public CircularQue(int size) {
		this.size=size;
		arr= new int [size];
		
	}
	
	public static boolean isQueueEmpty() {
		
		return rear==-1&& front==-1;
		
	}
	
	public static boolean isQueueFull() {
		return (rear+1)%size==front;
	}
	
	
	
	public static  void enque(int element) {
		if(isQueueFull()) {
			System.out.println("queue is full, cant add element");
			
		}
		else {
			rear = (rear+1)% size;
			if (front==-1) {
				front =front +1;
				
			}
			arr[rear]=element;
			System.out.println("Element "+element+" is added in que");
		}
//		 for(int i = front;i<=rear;i++)
//		  {
//			  System.out.println(arr[i]+" ");
//		  }
//		
	}
	
	
	 public static int  deque() {
		 if(isQueueEmpty()) {
				System.out.println("queue is EMPTY, cant delete element");
				return -1;
			}
		 else {
		 
		 int first= arr[front];
		 if(rear==front)
		 {
			 rear=front=-1;
		 }
		 front = (front+1)%size;
		 return first;
		 }
		 
	 }
	 
	 
	  public static void Display() {
		  if(isQueueEmpty()) {
				System.out.println("queue is EMPTY");
				
			}
		  if(front<rear)
		  {

		  for(int i = front;i<=rear;i++)
		  {
			  System.out.println(arr[i]+" ");
		  }
		  }
		  else
		  {
			  for(int i = front;i<size;i++)
			  {
				  System.out.println(arr[i]+" ");
			  }
			  for(int i = 0;i<=rear;i++)
			  {
				  System.out.println(arr[i]+" ");
			  }
			  
		  }
	  }
	  
	  public static void peekQue()
	  {
		  System.out.println("Peeked : "+arr[front]);
	  }
	
}
