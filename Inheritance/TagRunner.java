class TagRunner {
	
	public static void main(String... values)
	{
		Tag tag1 = new PriceTag("Top" , 1);
		System.out.println("Name : "+tag1.name);
		System.out.println("id : "+tag1.id);
		
		Tag tag2 = new PriceTag("Pant" , 2);
		System.out.println("Name : "+tag2.name);
		System.out.println("id : "+tag2.id);
	}
}