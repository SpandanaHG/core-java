class Tablet {

    String[] tabletNames = new String[5];
    int size = 0;

    void insertTablet(String name) 
	{

        System.out.println("Inside insertTablet");

        if (name != null) 
		{

            if (this.size < this.tabletNames.length) 
			{

                this.tabletNames[this.size] = name;
                System.out.println("Inserted: " + name + " at index " + this.size);
                this.size++;

            } 
			else 
			{
                System.out.println("Cannot insert, storage full");
            }

        } 
		else 
		{
            System.out.println("Tablet name is null");
        }
    }

    void checkTablet(String name) 
	{

        System.out.println("Inside checkTablet");

        if (name != null) 
		{

            boolean present = false;

            for (int i = 0; i < this.tabletNames.length; i++) 
			{

                if (name == this.tabletNames[i]) 
				{
                    System.out.println("Tablet " + name + " is available");
                    present = true;
                    break;
                }
            }

            if (!present) 
			{
                System.out.println("Tablet " + name + " is not available");
            }

        } 
		else 
		{
            System.out.println("Input is null");
        }
    }
}