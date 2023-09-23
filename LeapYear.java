class LeapYear 
{
	public static void main(String[] args) 
	{
		int a=20245;
		if(a%4==0)
		{
			if(a%100==0)
			{
				if (a%400==0)
				{
				System.out.println("It is leap year");
				}
				else
				{
				System.out.println("It is not a leap year");
				}
			}
			else
			{
				System.out.println("It is leap year");
			}
		}
		else
		{
			System.out.println("It is not a leap year");
		}
	}
}
