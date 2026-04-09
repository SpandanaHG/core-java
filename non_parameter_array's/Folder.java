class Folder {
	
    String name;
    String classification;
    String path;
    File[] files;
    boolean hidden;
    int count;

    Folder(String name, String classification, String path, File[] files) 
	{
        this.name = name;
        this.classification = classification;
        this.path = path;
        this.files = files;
    }

    void display() 
	{
        System.out.println("Running display in Folder");
        System.out.println("Name: " + this.name);
        System.out.println("Classification: " + this.classification);
        System.out.println("Path: " + this.path);
        System.out.println("Hidden: " + this.hidden);
        System.out.println("Count: " + this.count);

        if (this.files != null) 
		{
            for (File ref : files) 
			{
                if (ref != null) 
				{
                    ref.info();
                }
            }
        } 
		else 
		{
            System.out.println("Files are null");
        }
    }
}