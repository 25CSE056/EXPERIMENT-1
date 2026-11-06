import java.util.Scanner;
public class test2
{
	int num,rem,sum=0;
	public void all()
	{
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Sum is"+sum);
	}
	public static void main(String args[])
	{
		test2 ob=new test2();
		ob.all();
	}
}