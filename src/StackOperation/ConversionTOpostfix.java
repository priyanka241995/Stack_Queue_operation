package StackOperation;
import java.util.*;
public class ConversionTOpostfix {
static int priority(char ch){
	if(ch=='+' || ch=='-'){
		return 1;}
	if(ch=='*' ||ch=='/'){
		return 2;}
	return 0;
	
}
public static void main(String[] args){
	String exp="(A+B)*(C-D)";
			
	Stack<Character> stack=new Stack<>();
	String postfix="";
	for(int i=0;i<exp.length();i++){
		char ch=exp.charAt(i);
	 if(Character.isLetterOrDigit(ch)){
		 postfix=postfix + ch;}
	 else if(ch=='('||ch=='{' || ch=='['){
		 stack.push(ch);}
	 else if(ch==')'||ch=='}' ||ch==']'){
		 while(!stack.isEmpty() && stack.peek()!='(' && stack.peek()!='{' && stack.peek()!='['){
			postfix=postfix + stack.pop();}
		 stack.pop();
	 }
	 else
	 {
		 while(!stack.isEmpty() && priority( stack.peek())>=priority(ch))
		 {
			postfix=postfix + stack.pop(); 
		 }
		 stack.push(ch);
	 }
	 
}
	while(!stack.isEmpty())
	{
		postfix= postfix + stack.pop();
	}
	System.out.println("postfix expresion ="+postfix);

}

}

