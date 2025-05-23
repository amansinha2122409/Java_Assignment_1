//Q4 Convert input string into title case
import java.util.Scanner;

public class StrToTitle 
{
	
	public static void cnvrt(String str)
	{
		char str1[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(i==0 && (int)str1[i]>=97 && (int)str1[i]<=122)
			{
				str1[i]= (char)((int)str1[i]-32);
			}
			
			else if(str1[i-1]==' ' && (int)str1[i]>=97 && (int)str1[i]<=122)
			{
				str1[i]= (char)((int)str1[i]-32);
			}
			
			else if((int)str1[i]>=65 && (int)str1[i]<=90)
				str1[i]= (char)((int)str1[i]+32);
		}
		
			System.out.println(str1);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		String inpt1=sc.nextLine();
		cnvrt(inpt1);
	}

}
