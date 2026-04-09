class BoxRunner {
	
    public static void main(String... args) 
	{

        Pearl pearl1 = new Pearl("White", 5, PearlType.NATURAL);
        pearl1.origin = "Ocean";
        pearl1.shiny = true;

        Pearl pearl2 = new Pearl("Pink", 6, PearlType.CULTURED);
        pearl2.origin = "Sea";
        pearl2.shiny = true;

        Pearl pearl3 = new Pearl("Black", 7, PearlType.ARTIFICIAL);
        pearl3.origin = "Lab";
        pearl3.shiny = false;

        Pearl[] pearls = {pearl1, pearl2, pearl3};

        Box box = new Box(10, 20, 15, pearls);
        box.material = "Wood";
        box.strong = true;

        box.display();
    }
}