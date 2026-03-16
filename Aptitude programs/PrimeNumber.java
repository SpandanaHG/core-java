class PrimeNumber{
	static void numbers(int n)
	{
		if(n >=1)
		{
			for(int i=2 ; i<n ; i++)
			{
				if(n%i == 0)
				{
					System.out.println(n+" is not a  Prime Number");
					return;
				}
				
			}
			System.out.println(n+" is a Prime Number");
			return;
		}
		else
		{
			System.out.println("Invalid Number");
		}
	}
}