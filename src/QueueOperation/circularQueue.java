package QueueOperation;
import java.util.*;
public class circularQueue {
	static int[] queue=new int[5];
	static int  front=-1;
	static int rear=-1;
	static int capacity=5;
	public static void enqueue(int element){
		if(isFull()){
			System.out.println("queue is full");}
		else {
			System.out.println(element+"inserted successfully");
			if(front==-1){
				front=0;}
			rear=(rear+1)%capacity;
			queue[rear]=element;}}
	public static void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
		}
		else {
			System.out.println("deleted from the queue="+queue[front]);
			if(rear==front)
			{
				rear=-1;
				front=-1;
			}
			else {
			front=	(front+1)%capacity;
			}
		}
	}
	public static void peek()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
		}
		else {
			System.out.println("front element="+queue[front]);
		}
	}
	public static boolean isEmpty()
	{
		return front==-1;
	}
	public static boolean isFull()
	{
		return(rear+1)%capacity==front;
	}
	public static void display()
	{
		if(isEmpty())
		{
			System.out.println("queue is empty");
		}
		else
		{		
			for(int i=front;;i=(i+1)%capacity)
			{
				System.out.println(queue[i]);
				if(i==rear)
				{
					break;
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int choice =0;
		System.out.println("1.enqueue");
		System.out.println("2.dequeue");
		System.out.println("3.peek");
		System.out.println("4.display");
		System.out.println("5.isEmpty");
		System.out.println("6.isFull");
		System.out.println("7.prograam exited");
		
		
		while(choice!=7)
		{
			
			System.out.println("enter your choice");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("enter queue element= ");
				int element=sc.nextInt();
				enqueue(element);
				
				break;
			case 2:
				dequeue();
				break;
				
			
			case 3:
				peek();
				
				break;
			case 4:
				display();
				
				break;
			case 5:
				if(isEmpty())
				{

					System.out.println("queue is empty");
				}
				else
				{

					System.out.println("queue is not empty");
				}
				break;
			case 6:
				if(isFull())
				{

					System.out.println("queue is full");
				}
				else
				{

					System.out.println("queue is not full");
				}
				break;
			case 7:
				System.out.println("programme exited");
				break;
			default :
			System.out.println("invalid choice");
				break;
			}
		}
			
		
	}

}
