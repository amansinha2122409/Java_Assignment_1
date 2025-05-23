//Q2 Display sum of  all natural numbers between given range
import java.util.Scanner;

public class SumOfNtrlNo 
{
	
	public static int sume(int m,int n)
	{
		int sum=0;
		while(m<=n)
		{
			sum+=m;
			m++;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range:");
		int inpt1=sc.nextInt();
		int inpt2=sc.nextInt();
		//int add=sume(inpt1,inpt2);
		System.out.println("Sum of "+inpt1+" & "+inpt2+"is :"+ sume(inpt1,inpt2));	
	}

}
