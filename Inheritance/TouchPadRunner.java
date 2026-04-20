class TouchPadRunner {
	
	public static void main(String... values)
	{
		TouchPad touchPad1 = new LaptopTouchPad("Dell" , true);
		System.out.println("Brand : "+touchPad1.brand);
		System.out.println("Multi touch : "+touchPad1.multiTouch);
		
		TouchPad touchPad2 = new LaptopTouchPad("HP" , false);
		System.out.println("Brand : "+touchPad2.brand);
		System.out.println("Multi touch : "+touchPad2.multiTouch);
	}
}