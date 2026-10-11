package StackOperation;
import java.util.Stack;
public class postfixExpresion {
	public static Integer  postfix(String exp){
    Stack<Integer> stack=new Stack<>();
    for(int i=0;i<exp.length();i++){
    	char ch=exp.charAt(i);
		if(Character.isDigit(ch)){
    		stack.push(ch-'0');}
		else{
			int a=stack.pop();
			int b=stack.pop();
			switch(ch)
			{
			case '+':
			{
				stack.push(a+b);
				break;
			}
			case '-':
			{
				stack.push(a-b);
				break;
			}
			case '*':
			{
				stack.push(a*b);
				break;
			}
			case '/':
			{
				stack.push(a/b);
				break;
			}
			}
		}	
    }
    return stack.pop();
    }
	public static void main(String[] args){
		String exp="23*54*+26";
		System.out.println("postfix expresion="+exp);
		System.out.println("ans="+postfix(exp));
	}}
