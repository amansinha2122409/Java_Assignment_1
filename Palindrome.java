//Q8 Check whether input string is palindrome or not
import java.util.Scanner;

public class Palindrome 
{
	
	public static void plndrm(String str)
	{
		char str1[]=str.toCharArray();
		int l=str.length();
		for(int i=0,j=l-1;i<l;i++,j--)
		{
			str1[j]=str.charAt(i);
		}
		System.out.println(str1);
		for(int i=0;i<l;i++)
		{
			if(str1[i]!=str.charAt(i))
			{
				System.out.println("False");
				break;
			}
		}
		System.out.println("True");
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		String inpt1=sc.nextLine();
		plndrm(inpt1);
	}

}
