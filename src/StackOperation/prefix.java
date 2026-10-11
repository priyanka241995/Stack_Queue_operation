package StackOperation;
import java.util.*;
public class prefix {
	public static int prefixcheck(String exp){
		Stack<Integer> stack=new Stack<>();
		String[] arr=exp.split(" ");
		for(int i=arr.length-1 ; i >= 0 ; i--){
			String ch=arr[i];
			if(ch.matches("\\d+")){
				stack.push(Integer.parseInt(ch));}
			else{
				int a=stack.pop();
				int b=stack.pop();
				switch(ch){
				case "+":
					stack.push(a+b);
					break;
			
				case "-":
				
					stack.push(a-b);
					break;
				
				case "*":
				
					stack.push(a*b);
					break;
				
				case "/":
				
					stack.push(a/b);
					break;}}}
		return stack.pop();
	}
	public static void main(String[] args){
		String exp = "/ * 9 2 - 7 3";
				
				
		System.out.println("prefix expresion="+exp);
		System.out.println("prefix expresion="+prefixcheck(exp));
	}

}
