class ShopRunner{
	
	public static void main(String... values)
	{
		NailCutter nailCutter1 = new NailCutter("BrandA", 50, NailType.SMALL);
		nailCutter1.color = "Silver";
		nailCutter1.sharp = true;
		
		NailCutter nailCutter2 = new NailCutter("BrandB", 70, NailType.MEDIUM);
		nailCutter2.color = "Blue";
		nailCutter2.sharp = true;
		
		NailCutter nailCutter3 = new NailCutter("BrandC", 90, NailType.LARGE);
		nailCutter3.color = "Purple";
		nailCutter3.sharp = true;
		
		NailCutter[] cutters = {nailCutter1 , nailCutter2 , nailCutter3};
		Shop shop = new Shop("MyShop", "BTM", cutters);
		shop.noOfWorkers = 10;
		shop.open = true;
		
		shop.display();
		
	}
}