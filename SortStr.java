//Q10 Arrange input string characters in acsending order
import java.util.Arrays;
import java.util.Scanner;

public class SortStr 
{
	
	public static void srtstr(String str)
	{
		char c[]=str.toCharArray();
		Arrays.sort(c);
		for(int i=0;i<str.length()-1;i++)
		{
			for(int j=0;j<str.length()-1;j++)
			{
				char temp[]= {'a'};
				int m=(int)c[j];
				int n=(int)c[j+1];
				if(m>n)	
				{
					temp[0]=c[j];
					c[j]=c[j+1];
					c[j+1]=temp[0];
				}
			}
		}
		System.out.println(c);
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1:");
		String inpt1=sc.nextLine();
		srtstr(inpt1);
	}

}
