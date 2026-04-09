class Box {
	
    int weight;
    int length;
    int height;
    Pearl[] pearls;
    String material;
    boolean strong;

    Box(int weight, int length, int height, Pearl[] pearls) 
	{
        this.weight = weight;
        this.length = length;
        this.height = height;
        this.pearls = pearls;
    }

    void display() 
	{
        System.out.println("Running display in Box");
        System.out.println("Weight: " + this.weight);
        System.out.println("Length: " + this.length);
        System.out.println("Height: " + this.height);
        System.out.println("Material: " + this.material);
        System.out.println("Strong: " + this.strong);

        if (this.pearls != null) 
		{
            for (Pearl ref : pearls) 
			{
                if (ref != null) 
				{
                    ref.info();
                }
            }
        } 
		else 
		{
            System.out.println("Pearls are null");
        }
    }
}