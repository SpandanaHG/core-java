class ToolBox {
	
    String name;
    String location;
    Hammer[] hammers;
    int capacity;
    boolean locked;

    ToolBox(String name, String location, Hammer[] hammers) 
	{
        this.name = name;
        this.location = location;
        this.hammers = hammers;
    }

    void display() 
	{
        System.out.println("Running display in ToolBox");
        System.out.println("Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Locked: " + this.locked);

        if (this.hammers != null) 
		{
            for (Hammer ref : hammers) 
			{
                if (ref != null) 
				{
                    ref.info();
                }
            }
        } 
		else 
		{
            System.out.println("Hammers are null");
        }
    }
}