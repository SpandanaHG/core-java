class Library{
	
	
	String[] names = new String[5];
	int index = 0;
	
	void saveBookName(String name)
	{
		
		System.out.println("Running saveBookName in Library");
		if(name!=null)
		{
			if(this.index < this.names.length)
			{
				System.out.println("Saving the book name: "+name);
				this.names[this.index]=name;
				System.out.println("Saved "+ name+" in the index "+ this.index);
				this.index++;
			}
			else
			{
				System.out.println("Array is full , cannot save the book : "+name);
			}
		}
		else
		{
				System.out.println("Book name is null");
		}
	}
	
	void searchBookName(String name)
	{
		System.out.println("Runnin searchBookName in Library");
		if(name != null)
		{
			System.out.println("Finding book : "+name);
			boolean found = false;
			for(String temp : this.names)
			{
				if(name == temp)
				{
					System.out.println("Book "+name +" is found");
					found = true;
					break;
				}
			}
			if(!found)
			{
				System.out.println("Book "+name+" is not found");
			}
		}
		else{
			System.out.println("Name is null");
		}
	}
}
