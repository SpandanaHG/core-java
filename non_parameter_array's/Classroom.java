class Classroom {
	
    int number;
    int floorNo;
    Duster[] dusters;
    String block;
    boolean hasProjector;

    Classroom(int number, int floorNo, Duster[] dusters) 
	{
        this.number = number;
        this.floorNo = floorNo;
        this.dusters = dusters;
    }

    void display() 
	{
        System.out.println("Running display in Classroom");
        System.out.println("Number: " + this.number);
        System.out.println("Floor No: " + this.floorNo);
        System.out.println("Block: " + this.block);
        System.out.println("Projector: " + this.hasProjector);

        if (this.dusters != null) 
		{
            for (Duster ref : dusters) 
			{
                if (ref != null) 
				{
                    ref.info();
                }
            }
        } 
		else 
		{
            System.out.println("Dusters are null");
        }
    }
}