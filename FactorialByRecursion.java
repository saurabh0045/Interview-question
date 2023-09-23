class FactorialByRecursion 
{
	static int fact=1;
	public static void main(String[] args) 
	{
		
		int num=5;
		FactorialByRecursion ob=new FactorialByRecursion();
		ob.calFact(num);
		System.out.println("factorial of" +num+ "is:"+fact);
	}
	int calFact(int num)
	{
		if(num>=1)
		{
			fact=fact*num;
			calFact(num-1);
		}
		return 0;
	}
}
