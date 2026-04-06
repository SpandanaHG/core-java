class Powder {
	
	String brand = "Ponds";
    String type = "Face";
    int weight = 100;
    String fragrance = "Rose";
    boolean isOrganic = false;
	
	void display()
	{
		System.out.println("Running display in the Powder");
		System.out.println("Brand: " + this.brand);
		System.out.println("Type: " + this.type);
		System.out.println("Weight: " + this.weight);
		System.out.println("Fragrance: " + this.fragrance);
		System.out.println("Is Organic: " + this.isOrganic);
	}
}