import java.util.Scanner;

public class RevStr 
{
	
	public static void revstr(String m)
	{
		char str1[]=m.toCharArray();
		int l=m.length();
		for(int i=0,j=l-1;i<l;i++,j--)
		{
			str1[j]=m.charAt(i);
		}
		System.out.println(str1);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string to reverse");
		String m=sc.nextLine();
		revstr(m);
	}

}
