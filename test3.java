import java.util.Scanner;
public class test3
{
	int num,org,rev=0,rem;
	public void palindrome()
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		org=num;
		while(num>0)
		{
			rem=num%10;
			org=rev*10+rem;
			num=num/10;
		}
		if(org==rev)
		{
		System.out.println("Palindrome number");
		}
		else
		{
		System.out.println("Not a Palindrome number");
		}
	}
	public static void main(String args[])
	{
		test3 ob=new test3();
		ob.palindrome();
	}
}