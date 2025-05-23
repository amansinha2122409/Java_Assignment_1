import java.util.Arrays;
import java.util.Scanner;

public class Angrm 
{
	
	public static void ngrm(String str,String str1)
	{
		if(str.length()==str1.length())
		{
			char c[]=str.toCharArray();
			char c1[]=str1.toCharArray();
			Arrays.sort(c);
			Arrays.sort(c1);
			for(int i=0;i<str.length();i++)
			{
				if(c[i]!=c1[i])
				{
					System.out.println("Not an Anagram");
					break;
				}
				    
			}
			System.out.println("Anagram");
	    }
		else
			System.out.println("Not an Anagram");
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String 1:");
		String inpt1=sc.nextLine();
		System.out.println("Enter String 2:");
		String inpt2=sc.nextLine();	
		ngrm(inpt1,inpt2);
	}

}
