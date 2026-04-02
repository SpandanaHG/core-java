class Runner{
	public static void main(String... values)
	{
		System.out.println("\n----------Locket----------\n");
		Locket locket1 = new Locket("Gold", "Yellow", 5000, 10, "Tanishq", "Heart", true, "Floral", 2, "India");
		locket1.display();
		
		Locket locket2 = new Locket("Silver", "White", 2000, 8, "Malabar", "Round", false, "Plain", 1, "India");
		locket2.display();
		
		Locket locket3 = new Locket("Platinum", "Gray", 8000, 12, "Kalyan", "Oval", true, "Modern", 3, "India");
		locket3.display();
		
		System.out.println("\n----------Specs----------\n");
		Specs specs1 = new Specs("FullFrame", "Black", 1500, 0.2, "RayBan", "Power", true, "Reading", 1, "USA");
		specs1.display();
		
		Specs specs2 = new Specs("HalfFrame", "Blue", 1200, 0.18, "Titan", "Normal", false, "Fashion", 1, "India");
		specs2.display();
		
		Specs specs3 = new Specs("Rimless", "Brown", 2000, 0.15, "Fastrack", "Power", true, "Computer", 2, "India");
		specs3.display();
		
		System.out.println("\n----------Chain----------\n");
		Chain chain1 = new Chain("Gold", "Yellow", 15000, 20, "Tanishq", "Neck", true, "Traditional", 2, "India");
		chain1.display();
		
		Chain chain2 = new Chain("Silver", "White", 5000, 18, "Malabar", "Neck", false, "Simple", 1, "India");
		chain2.display();
		
		Chain chain3 = new Chain("Platinum", "Gray", 20000, 22, "Kalyan", "Neck", true, "Modern", 3, "India");
		chain3.display();
		
		System.out.println("\n----------Locker----------\n");
		Locker locker1 = new Locker("Steel", "Gray", 10000, 6, "Godrej", "Home", true, "Storage", 4, "India");
		locker1.display();
		
		Locker locker2 = new Locker("Iron", "Black", 8000, 5.5, "Samsung", "Office", false, "Documents", 3, "India");
		locker2.display();
		
		Locker locker3 = new Locker("Alloy", "White", 12000, 6.5, "LG", "Digital", true, "Valuables", 5, "India");
		locker3.display();
		
		System.out.println("\n----------Boomer----------\n");
		Boomer boomer1 = new Boomer("BubbleGum", "Pink", 10, 0.01, "Wrigley", "Strawberry", false, "Round", 5, "India");
		boomer1.display();
		
		Boomer boomer2 = new Boomer("ChewingGum", "Blue", 15, 0.02, "CenterFresh", "Mint", true, "Square", 6, "India");
		boomer2.display();
		
		Boomer boomer3 = new Boomer("BubbleGum", "Green", 12, 0.015, "Happydent", "GreenApple", false, "Oval", 4, "India");
		boomer3.display();

		System.out.println("\n----------Rocket----------\n");
		Rocket rocket1 = new Rocket("LaunchVehicle", "Liquid", 5000000, 20000, "ISRO", "Satellite", true, 44, 3, "India");
		rocket1.display();
		
		Rocket rocket2 = new Rocket("SpaceRocket", "Solid", 8000000, 30000, "NASA", "Exploration", false, 70, 2, "USA");
		rocket2.display(); 
		
		Rocket rocket3 = new Rocket("ReusableRocket", "Hybrid", 10000000, 25000, "SpaceX", "Cargo", true, 65, 2, "USA");
		rocket3.display();
		
		System.out.println("\n----------Xerox----------\n");
		Xerox xerox1 = new Xerox("HP", "LaserJet", 15000, 8.5, "Printer", true, 20, "WiFi", 2, "India");
		xerox1.display();
		
		Xerox xerox2 = new Xerox("Canon", "Pixma", 12000, 7.0, "All-in-One", true, 15, "USB", 1, "Japan");
		xerox2.display();
		
		Xerox xerox3 = new Xerox("Epson", "EcoTank", 18000, 9.0, "InkTank", true, 18, "WiFi", 3, "China");
		xerox3.display();
		
		System.out.println("\n----------Soft Drink----------\n");
		SoftDrink drink1 = new SoftDrink("Coke", "Cola", 40, 0.5, "CocaCola", "Black", true, "Bottle", 6, "India");
		drink1.display();
		
		SoftDrink drink2 = new SoftDrink("Pepsi", "Cola", 40, 0.5, "PepsiCo", "Black", true, "Can", 6, "India");
		drink2.display();
		
		SoftDrink drink3 = new SoftDrink("Sprite", "Lemon", 35, 0.5, "CocaCola", "Clear", true, "Bottle", 6, "India");
		drink3.display();
		
		System.out.println("\n----------Ink Pad----------\n");
		InkPad inkpad1 = new InkPad("Camel", "Blue", 100, 0.2, "Office", true, "Medium", "Plastic", 1, "India");
		inkpad1.display();
		
		InkPad inkpad2 = new InkPad("FaberCastell", "Black", 120, 0.25, "School", false, "Small", "Fiber", 1, "Germany");
		inkpad2.display();
		
		InkPad inkpad3 = new InkPad("Doms", "Red", 90, 0.18, "Office", true, "Large", "Plastic", 2, "India");
		inkpad3.display();

		System.out.println("\n----------Stamp----------\n");
		Stamp stamp1 = new Stamp("Trodat", "Rubber", 300, 0.5, "Rectangle", true, "Office", "Plastic", 2, "Austria");
		stamp1.display();
		
		Stamp stamp2 = new Stamp("Shiny", "SelfInking", 350, 0.6, "Square", true, "Official", "Metal", 2, "Taiwan");
		stamp2.display();
		
		Stamp stamp3 = new Stamp("Deli", "Manual", 200, 0.4, "Round", false, "Personal", "Plastic", 1, "China");
		stamp3.display();
		
		System.out.println("\n----------Umbrella----------\n");
		Umbrella umbrella1 = new Umbrella("Popy", "Black", 500, 0.5, "Foldable", true, "Medium", "Polyester", 1, "India");
		umbrella1.display();
		
		Umbrella umbrella2 = new Umbrella("Skybags", "Blue", 700, 0.6, "Straight", false, "Large", "Nylon", 2, "India");
		umbrella2.display();
		
		Umbrella umbrella3 = new Umbrella("Wildcraft", "Red", 800, 0.55, "Foldable", true, "Medium", "Polyester", 2, "India");
		umbrella3.display();

		System.out.println("\n----------Art Material----------\n");
		ArtMaterial art1 = new ArtMaterial("Paint", "Camel", 300, 0.4, "WaterColor", "Multi", true, "Drawing", 12, "India");
		art1.display();

		ArtMaterial art2 = new ArtMaterial("Pencil", "Apsara", 100, 0.2, "Graphite", "Black", true, "Sketching", 10, "India");
		art2.display();
				
		ArtMaterial art3 = new ArtMaterial("Brush", "FaberCastell", 200, 0.3, "Round", "Brown", true, "Painting", 6, "Germany");
		art3.display();

		System.out.println("\n----------Tyre----------\n");
		Tyre tyre1 = new Tyre("MRF", "Radial", 4000, 8.5, "Car", "15inch", true, "Rubber", 3, "India");
		tyre1.display();
		
		Tyre tyre2 = new Tyre("Apollo", "Tubed", 3000, 7.5, "Bike", "12inch", false, "Rubber", 2, "India");
		tyre2.display();
		
		Tyre tyre3 = new Tyre("CEAT", "Radial", 4500, 9.0, "Car", "16inch", true, "Rubber", 4, "India");
		tyre3.display();

		System.out.println("\n----------Wind Shield----------\n");
		WindShield windShield1 = new WindShield("SaintGobain", "Front", 8000, 12.5, "Car", "Glass", true, "Large", 2, "India");
		windShield1.display();
		
		WindShield windShield2 = new WindShield("Asahi", "Rear", 6000, 10.0, "Car", "TemperedGlass", true, "Medium", 2, "Japan");
		windShield2.display();
		
		WindShield windShield3 = new WindShield("Fuyao", "Front", 7500, 11.5, "SUV", "LaminatedGlass", true, "Large", 3, "China");
		windShield3.display();

		System.out.println("\n----------Think Pad----------\n");
		ThinkPad thinkPad1 = new ThinkPad("X1 Carbon", "i7", 120000, 1.2, "16GB", "512GB SSD", true, "Windows", 3, "USA");
		thinkPad1.display();
		
		ThinkPad thinkPad2 = new ThinkPad("E14", "i5", 70000, 1.6, "8GB", "256GB SSD", false, "Windows", 2, "India");
		thinkPad2.display();
		
		ThinkPad thinkPad3 = new ThinkPad("T14", "Ryzen 7", 90000, 1.5, "16GB", "1TB SSD", false, "Windows", 3, "China");
		thinkPad3.display();

	}
}