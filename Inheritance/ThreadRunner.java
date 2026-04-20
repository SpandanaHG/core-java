class ThreadRunner {
	
	public static void main(String... values)
	{
		Thread thread1 = new SilkThread("Red", 100);
		System.out.println("Color : "+thread1.color);
		System.out.println("Length : "+thread1.length);
		
		Thread thread2 = new SilkThread("Blue", 200);
		System.out.println("Color : "+thread2.color);
		System.out.println("Length : "+thread2.length);
	}
}