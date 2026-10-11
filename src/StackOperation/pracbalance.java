package StackOperation;

public class pracbalance {
	public static boolean ckeckpair(int open,int close)
	{
		return (open=='(' && close==')')||(open=='{'&& close=='}')||
				(open=='[' && close ==']');
	}
	public static boolean checkexpresion(String exp)
	{
		int n=exp.length();
		char[] stack=new char[n];
		int top=-1;
		for(int i=0;i<n;i++)
		{
			char ch=exp.charAt(i);
			
		
		if(ch=='(' || ch=='['||ch=='{')
		{
			stack[++top]=ch;
		}
		else
		{
			if(top==-1)
			{
				return false;
			}
			if(ckeckpair(stack[top],ch))
			{
				 top--;
			}
		}
		
	}
		return top==-1;
	
	}
	public static void main(String[] args)
	{
		String exp="[a+b*(c-d)]";
		System.out.println(checkexpresion(exp)?"balanced":"not balanced");
	}
}
