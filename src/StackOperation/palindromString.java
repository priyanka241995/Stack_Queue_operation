package StackOperation;
public class palindromString implements StackADT {
	int[] stack=new int[10];
	int top;
	int capacity;
	public palindromString(int size){
		stack=new int[10];
		capacity=size;
		top=-1;}
	@Override
	public void push(char element) {
		if(isFull()){
			return ;}
		stack[++top]=element;	}
	@Override
	public int pop() {
		if(isEmpty()){
			return -1;}
		return stack[top--];}
	@Override
	public boolean isFull() {
		return top==capacity-1;}
	@Override
	public boolean isEmpty() {
		return top==-1;}
	public static void main(String[] args){
		palindromString s=new palindromString(10);
		 String str="computer";
		
		for(int i=0;i<str.length();i++)
		{
			s.push(str.charAt(i)); 
			
		}
		boolean ispalindrome = false;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=s.pop())
			{
				ispalindrome=true;
				break;
			}
		}
		if(ispalindrome)
		{
			System.out.println(str+" "+"not a palindrome" );
		}
		else {
			System.out.println(str+" "+"is a palindrome" );
		}
		 
	}

}
