class Juice {

    String[] juiceNames = new String[5];
    int index = 0;

    void storeJuice(String name) 
	{

        System.out.println("Inside storeJuice");

        if (name != null) 
		{

            if (this.index < this.juiceNames.length) 
			{

                this.juiceNames[this.index] = name;
                System.out.println("Stored: " + name + " at index " + this.index);
                this.index++;

            } 
			else 
			{
                System.out.println("No space available");
            }

        } 
		else 
		{
            System.out.println("Juice name is null");
        }
    }

    void findJuice(String name) 
	{

        System.out.println("Inside findJuice");

        if (name != null) 
		{

            boolean exists = false;

            for (int i = 0; i < this.juiceNames.length; i++) 
			{

                if (name == this.juiceNames[i]) 
				{
                    System.out.println("Juice " + name + " found");
                    exists = true;
                    break;
                }
            }

            if (!exists) 
			{
                System.out.println("Juice " + name + " not found");
            }

        } 
		else 
		{
            System.out.println("Input is null");
        }
    }
}