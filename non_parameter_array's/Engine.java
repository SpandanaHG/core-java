class Engine {
	
    String name;
    String model;
    Starter[] starters;
    int capacity;
    boolean running;

    Engine(String name, String model, Starter[] starters) 
	{
        this.name = name;
        this.model = model;
        this.starters = starters;
    }

    void display() 
	{
        System.out.println("Running display in Engine");
        System.out.println("Name: " + this.name);
        System.out.println("Model: " + this.model);
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Running: " + this.running);

        if (this.starters != null) 
		{
            for (Starter ref : starters) 
			{
                if (ref != null) 
				{
                    ref.info();
                }
            }
        } 
		else 
		{
            System.out.println("Starters are null");
        }
    }
}