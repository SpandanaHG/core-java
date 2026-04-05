class Runner {
    public static void main(String[] args) {
		
        Locket locket1 = new Locket();
        Locket locket2 = new Locket("Gold");
        Locket locket3 = new Locket("Gold", "Yellow");
        Locket locket4 = new Locket("Gold", "Yellow", 5000);
        Locket locket5 = new Locket("Gold", "Yellow", 5000, 10, true);

        locket1.display();
        locket2.display();
        locket3.display();
        locket4.display();
        locket5.display();
		
		Specs specs1 = new Specs();
        Specs specs2 = new Specs("RayBan");
        Specs specs3 = new Specs("RayBan", "Black");
        Specs specs4 = new Specs("RayBan", "Black", 2500);
        Specs specs5 = new Specs("RayBan", "Black", 2500, 2, true);

        specs1.display();
        specs2.display();
        specs3.display();
        specs4.display();
        specs5.display();
		

        Chain chain1 = new Chain();
        Chain chain2 = new Chain("Gold");
        Chain chain3 = new Chain("Gold", "Yellow");
        Chain chain4 = new Chain("Gold", "Yellow", 10000);
        Chain chain5 = new Chain("Gold", "Yellow", 10000, 20, true);

        chain1.display();
        chain2.display();
        chain3.display();
        chain4.display();
        chain5.display();
		
		Locker locker1 = new Locker();
        Locker locker2 = new Locker("Godrej");
        Locker locker3 = new Locker("Godrej", "Grey");
        Locker locker4 = new Locker("Godrej", "Grey", 15000);
        Locker locker5 = new Locker("Godrej", "Grey", 15000, 5, true);

        locker1.display();
        locker2.display();
        locker3.display();
        locker4.display();
        locker5.display();

        Boomer boomer1 = new Boomer();
        Boomer boomer2 = new Boomer("Boomer");
        Boomer boomer3 = new Boomer("Boomer", "Strawberry");
        Boomer boomer4 = new Boomer("Boomer", "Strawberry", 10);
        Boomer boomer5 = new Boomer("Boomer", "Strawberry", 10, 5, false);

        boomer1.display();
        boomer2.display();
        boomer3.display();
        boomer4.display();
        boomer5.display();
		
		
		Rocket rocket1 = new Rocket();
        Rocket rocket2 = new Rocket("PSLV");
        Rocket rocket3 = new Rocket("PSLV", "India");
        Rocket rocket4 = new Rocket("PSLV", "India", 2000000);
        Rocket rocket5 = new Rocket("PSLV", "India", 2000000, 3, false);

        rocket1.display();
        rocket2.display();
        rocket3.display();
        rocket4.display();
        rocket5.display();
		
		Xerox xerox1 = new Xerox();
        Xerox xerox2 = new Xerox("Canon");
        Xerox xerox3 = new Xerox("Canon", "Laser");
        Xerox xerox4 = new Xerox("Canon", "Laser", 25000);
        Xerox xerox5 = new Xerox("Canon", "Laser", 25000, 30, true);

        xerox1.display();
        xerox2.display();
        xerox3.display();
        xerox4.display();
        xerox5.display();
		
		SoftDrink softDrink1 = new SoftDrink();
        SoftDrink softDrink2 = new SoftDrink("CocaCola");
        SoftDrink softDrink3 = new SoftDrink("CocaCola", "Cola");
        SoftDrink softDrink4 = new SoftDrink("CocaCola", "Cola", 40);
        SoftDrink softDrink5 = new SoftDrink("CocaCola", "Cola", 40, 2, true);

        softDrink1.display();
        softDrink2.display();
        softDrink3.display();
        softDrink4.display();
        softDrink5.display();

        InkPad inkPad1 = new InkPad();
        InkPad inkPad2 = new InkPad("Camel");
        InkPad inkPad3 = new InkPad("Camel", "Blue");
        InkPad inkPad4 = new InkPad("Camel", "Blue", 150);
        InkPad inkPad5 = new InkPad("Camel", "Blue", 150, 5, true);

        inkPad1.display();
        inkPad2.display();
        inkPad3.display();
        inkPad4.display();
        inkPad5.display();

        Stamp stamp1 = new Stamp();
        Stamp stamp2 = new Stamp("Office");
        Stamp stamp3 = new Stamp("Office", "Round");
        Stamp stamp4 = new Stamp("Office", "Round", 200);
        Stamp stamp5 = new Stamp("Office", "Round", 200, 3, true);

        stamp1.display();
        stamp2.display();
        stamp3.display();
        stamp4.display();
        stamp5.display();

        Umbrella umbrella1 = new Umbrella();
        Umbrella umbrella2 = new Umbrella("Puma");
        Umbrella umbrella3 = new Umbrella("Puma", "Black");
        Umbrella umbrella4 = new Umbrella("Puma", "Black", 800);
        Umbrella umbrella5 = new Umbrella("Puma", "Black", 800, 40, true);

        umbrella1.display();
        umbrella2.display();
        umbrella3.display();
        umbrella4.display();
        umbrella5.display();
  
		ArtMaterial artMaterial1 = new ArtMaterial();
        ArtMaterial artMaterial2 = new ArtMaterial("Paint");
        ArtMaterial artMaterial3 = new ArtMaterial("Paint", "Camel");
        ArtMaterial artMaterial4 = new ArtMaterial("Paint", "Camel", 300);
        ArtMaterial artMaterial5 = new ArtMaterial("Paint", "Camel", 300, 10, true);

        artMaterial1.display();
        artMaterial2.display();
        artMaterial3.display();
        artMaterial4.display();
        artMaterial5.display();
		
		Tyre tyre1 = new Tyre();
        Tyre tyre2 = new Tyre("MRF");
        Tyre tyre3 = new Tyre("MRF", "Radial");
        Tyre tyre4 = new Tyre("MRF", "Radial", 5000);
        Tyre tyre5 = new Tyre("MRF", "Radial", 5000, 17, true);

        tyre1.display();
        tyre2.display();
        tyre3.display();
        tyre4.display();
        tyre5.display();
		
		WindShield windShield1 = new WindShield();
        WindShield windShield2 = new WindShield("Car");
        WindShield windShield3 = new WindShield("Car", "Glass");
        WindShield windShield4 = new WindShield("Car", "Glass", 8000);
        WindShield windShield5 = new WindShield("Car", "Glass", 8000, 50, true);

        windShield1.display();
        windShield2.display();
        windShield3.display();
        windShield4.display();
        windShield5.display();
		
		ThinkPad thinkPad1 = new ThinkPad();
        ThinkPad thinkPad2 = new ThinkPad("Lenovo");
        ThinkPad thinkPad3 = new ThinkPad("Lenovo", "T480");
        ThinkPad thinkPad4 = new ThinkPad("Lenovo", "T480", 80000);
        ThinkPad thinkPad5 = new ThinkPad("Lenovo", "T480", 80000, 16, true);

        thinkPad1.display();
        thinkPad2.display();
        thinkPad3.display();
        thinkPad4.display();
        thinkPad5.display();
    }
}