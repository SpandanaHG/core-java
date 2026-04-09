class Port {
	
    String portName;
    String location;
    Boat[] boats;
    int docks;
    boolean open;

    Port(String portName, String location, Boat[] boats) 
	{
        this.portName = portName;
        this.location = location;
        this.boats = boats;
    }

    void display() 
	{
        System.out.println("Running display in Port");
        System.out.println("Port Name: " + this.portName);
        System.out.println("Location: " + this.location);
        System.out.println("Docks: " + this.docks);
        System.out.println("Open: " + this.open);

        if (this.boats != null)
		{
            for (Boat temp : boats) 
			{
                if (temp != null) 
				{
                    temp.info();
                }
            }
        } 
		else 
		{
            System.out.println("Boats are null");
        }
    }
}