class KnifeRunner {
	
	public static void main(String... values)
	{
		Knife knife1 = new KitchenKnife("Steel", 10);
		System.out.println("Material : "+knife1.material);
		System.out.println("Length : "+knife1.length);
		
        Knife knife2 = new KitchenKnife("Iron", 8);
		System.out.println("Material : "+knife2.material);
		System.out.println("Length : "+knife2.length);
	}
}