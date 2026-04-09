class ToolBoxRunner {
	
    public static void main(String... args) 
	{

        Hammer hammer1 = new Hammer("Bosch", 5, HammerType.WOOD);
        hammer1.handleMaterial = "Wood";
        hammer1.strong = true;

        Hammer hammer2 = new Hammer("Stanley", 7, HammerType.IRON);
        hammer2.handleMaterial = "Fiber";
        hammer2.strong = true;

        Hammer hammer3 = new Hammer("Hitachi", 10, HammerType.STEEL);
        hammer3.handleMaterial = "Steel";
        hammer3.strong = true;

        Hammer[] hammers = {hammer1, hammer2, hammer3};

        ToolBox box = new ToolBox("MyToolBox", "Garage", hammers);
        box.capacity = 20;
        box.locked = true;

        box.display();
    }
}