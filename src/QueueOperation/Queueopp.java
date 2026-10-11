package QueueOperation;
import java.util.*;

public class Queueopp{
static 	 int[] queue = new int[5];
static  int rear=-1;
static int  front=-1;
static int capacity=5;
public static void enqueue(int element){ 
	if(isFull()){
		System.out.println("queue is full");}
	else {
		if(front==-1){
			front=0;}
		rear++;	
	     queue[rear]=element;
	     System.out.println(element+"inserted succesfully");}}
public static  void dequeue(){
	if(isEmpty()){
		System.out.println("queue is empty");}
	else{
		System.out.println("deleted element from queue is ="+queue[front]);
		if(front==rear){
			front=-1;
			rear=-1;}
		else {
			front++;
		}
	}	
}
public static  void peek()
{
	if(isEmpty())
	{
		System.out.println("queue is empty");
	}
	else {
	System.out.println("front element ="+queue[front]);
	
	}
}

public static boolean isFull()
{
	return rear == capacity-1;
}
public static  boolean isEmpty()
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
		for(int i=front;i<=rear;i++)
		{
			System.out.println(queue[i]);
		}
		System.out.println();
	}
	
}
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int choice=0;;
	
		System.out.println("\n*****************Queue menu**************");
		System.out.println("1.Enqueue");
		System.out.println("2. Dequeue");
		System.out.println("3. peek");
		System.out.println("4. isFull");
		System.out.println("5.isEmpty");
		System.out.println("6. display");
		System.out.println("7.programme exited");
		while(choice!=7) {
		System.out.println("enter your choice=");
		choice=sc.nextInt();
		switch(choice)
		{
		case 1:
		{
		  System.out.println("enter queue eliment=");
		  int element=sc.nextInt();
		  enqueue(element);
		  break;
		}
		case 2:
		{
			dequeue();
			break;
		}
		case 3:
		{
			peek();
			break;
		}
		case 4:
		{
			display();
			break;
			
		}
		case 5:
		{
		if(isEmpty())
		{
			System.out.println("queue is empty");
		}
		else
		{
			System.out.println("queue is not empty");
		}
		break;
		}
		case 6:
		{
		if(isFull())
		{

			System.out.println("queue is full");
		}
		else {

			System.out.println("queue is not Full");
		}
		break;		
		}
		case 7:
		{
			System.out.println("programme exited");
			break;
			
		}
		 default:
		{
			System.out.println("invalid choice");
			break;	
		}
		}
	}
}

}


