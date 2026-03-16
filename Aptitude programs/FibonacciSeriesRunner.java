class FibonacciSeriesRunner
{
	public static void main(String[] args)
	{
		int n = 10;

        System.out.println("Fibonacci Series:");

        for(int i = 0; i < n; i++)
        {
            System.out.print(FibonacciSeries.series(i) + " ");
        }
	}
}