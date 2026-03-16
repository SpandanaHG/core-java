class FibonacciSeries
{
	static int series(int n)
	{
		if(n <= 1)
        {
            return n;
        }
        else
        {
            return series(n-1) + series(n-2);
        }
		
	}
}