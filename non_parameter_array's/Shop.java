class Shop {
	
    String name;
    String address;
    NailCutter[] cutters;
    int noOfWorkers;
    boolean open;

    Shop(String name, String address, NailCutter[] cutters) {
        this.name = name;
        this.address = address;
        this.cutters = cutters;
    }

    void display() {
        System.out.println("Running display in Shop ");
		System.out.println("Name: "+this.name);
		System.out.println("Address: "+this.address);
		System.out.println("Workers: "+this.noOfWorkers);
		System.out.println("Open: "+this.open);
		if(this.cutters != null)
		{
			for (NailCutter start : cutters) 
			{
				if(start != null)
				{
					start.info();
				}
			}
		}
		else
		{
			System.out.println("Cutters are null");
		}
    }
}