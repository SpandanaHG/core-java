class ArmstrongNumber
{
	static void numbers(int n)
	{
		int original = n;
		int sum = 0;
		int digitCount = 0;
		int temp = n;
		while(temp != 0)
		{
			digitCount++;
			temp = temp/10;
		}
		temp = n;
		while(temp !=0)
		{
			int digit = temp%10;
			sum = sum + (int)Math.pow(digit, digitCount);
            temp = temp / 10;
		}
		if(sum == original)
		{
			System.out.println(original + " is an Armstrong Number");
		}
		else
		{
			System.out.println(original + " is not a Armstrong Number");
		}
	}
}