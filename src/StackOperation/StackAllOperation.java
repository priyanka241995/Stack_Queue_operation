package StackOperation;
public class StackAllOperation implements StackADT {
		 int[] stack =new int[5];
		 int top;
		 int capacity;
		 public StackAllOperation(int size) {
		        stack = new int[size];
		        capacity = size;
		        top = -1;}
	@Override
	public void push(int element) {
		if(isFull()){
			//System.out.println("stack is full");
			return;}
		stack[++top]=element;
		System.out.println(element+" "+"pushed into stack");}
	@Override
	public int pop() {
		if(isEmpty()){
			//System.out.println("stack is empty");
			return -1;}
		return stack[top--];}
	@Override
	public boolean isFull() {
		//System.out.println("Stack is full");
		return top==capacity-1;}
	@Override
	public boolean isEmpty() {
		//System.out.println("Stack is empty");
		return top==-1;}
	public static void main(String[]  args){
		StackAllOperation s=new StackAllOperation(5);
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.print("reverse a number");
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
		 
		}
	}
