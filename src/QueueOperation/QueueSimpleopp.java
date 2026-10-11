package QueueOperation;
import java.util.*;
public class QueueSimpleopp {
	static int[] queue = new int[5];
	static int front=-1;
	static int rear=-1;
	static int capacity=5;
	public static void enqueue(int element){
		if(isFull()){
			System.out.println("queue is Full");}
		else {
			System.out.println(element+"inserted successfully");
			if(front==-1)
			{
				front=0;
			}
		     rear=(rear+1)%capacity;
		     queue[rear]=element;
		   }
	}
	public static void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
		}
		else {
			System.out.println("element dileted"+queue[front]);
		if(rear==front)
		{
			rear=-1;
			front=-1;
		}
		else {
			front=(front+1)%capacity;
		}
	}
}
	public static boolean isFull()
	{
	
		return (rear+1)%capacity==front;
		
	} 
	public static boolean isEmpty()
	{  
		
		return front==-1;
	}
	public static void display()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
		}
		else {
			System.out.println("queue element are");
			for(int i=front;;i=(i+1)%capacity)
			{
				System.out.println(queue[i]+" ");
				if(i==rear)
				break;
			}
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

	    QueueSimpleopp q = new QueueSimpleopp();

	    System.out.println("Enter queue element:");
	   
	    
	    for (int i = 0; i < 4; i++) {
	    	 int element = sc.nextInt();
	        q.enqueue(element);
	    }

	    
	    q.display();

	    q.dequeue();

	    System.out.println("Is Full: " + q.isFull());
	    System.out.println("Is Empty: " + q.isEmpty());

	    q.display();

	}
	
	
}


