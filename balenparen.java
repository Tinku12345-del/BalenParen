package Ques;
import java.util.Scanner;
import java.util.Stack;
public class BalParen {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=s.next();
		Stack<Character> s1=new Stack<Character>();
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='{' ||st.charAt(i)=='['||st.charAt(i)=='(' )
			{
				s1.push(st.charAt(i));
			}
			if(!s1.isEmpty())
			{
				if(st.charAt(i)==')' && s1.peek()=='(' )
					s1.pop();
				else if(st.charAt(i)==']' && s1.peek()=='[' )
					s1.pop();
				if(st.charAt(i)=='}' && s1.peek()=='{' )
					s1.pop();
			}

		}
		if(s1.isEmpty())
		{
			System.out.println("Expression is balanced");
		}
		else
		{
			System.out.println();
		}
	}

}
