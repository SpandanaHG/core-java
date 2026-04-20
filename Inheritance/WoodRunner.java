class WoodRunner {
	
	public static void main(String... values)
	{
		Wood wood1 = new FurnitureWood("Teak", 10);
		System.out.println("Type : "+wood1.type);
		System.out.println("length : "+wood1.length);
		
		Wood wood2 = new FurnitureWood("Oak", 8);
		System.out.println("Type : "+wood2.type);
		System.out.println("length : "+wood2.length);
	}
}