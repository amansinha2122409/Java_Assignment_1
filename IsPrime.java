//Q3 Check whether input number is prime or not
import java.util.Scanner;

public class IsPrime 
{
	
	public static int primeornot(int m)
	{
		int rt=(int) Math.sqrt(m);
		int flag=1;
		for(int i=2;i<=rt;i++)
		{
			if(m%i==0)
			{
				flag=0;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to check prime:");
		int inpt1=sc.nextInt();
		if(primeornot(inpt1)==0)
			System.out.println("Number is not prime");
		else
			System.out.println("Number is prime");
	}

}
