import java.util.*;
class Factorial 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int fact=1;
		for (int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " +a+ " is:"+fact);
	}
}
