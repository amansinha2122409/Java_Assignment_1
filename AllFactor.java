import java.util.Scanner;

public class AllFactor 
{
	
	public static void allfctr(int inpt)
	{
		for(int i=2;i<=inpt;i++)
		{
			if(inpt%i==0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int inpt=sc.nextInt();
		System.out.println("Factors are:");
		System.out.println("1");
		allfctr(inpt);		
	}

}
