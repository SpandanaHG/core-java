class Lift {

    String[] liftTypes = new String[5];
    int index = 0;

    void storeLift(String type) 
	{
        System.out.println("Inside storeLift");

        if (type != null) 
		{
            if (this.index < this.liftTypes.length) 
			{
                this.liftTypes[this.index] = type;
                System.out.println("Stored: " + type + " at index " + this.index);
                this.index++;
            } 
			else 
			{
                System.out.println("Storage full");
            }
        } 
		else 
		{
            System.out.println("Lift type is null");
        }
    }

    void findLift(String type) 
	{
        System.out.println("Inside findLift");

        if (type != null) 
		{
            boolean found = false;

            for (int i = 0; i < this.liftTypes.length; i++) 
			{
                if (type == this.liftTypes[i]) 
				{
                    System.out.println("Lift " + type + " found");
                    found = true;
                    break;
                }
            }

            if (!found) 
			{
                System.out.println("Lift " + type + " not found");
            }
        } 
		else 
		{
            System.out.println("Input is null");
        }
    }
}