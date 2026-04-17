class NewsPaperStore{
	
	NewsPaper[] newsPapers = new NewsPaper[100];
	int index = 0;
	
	void saveDetails(NewsPaper newsPaper)
	{
		System.out.println("Running saveDetails in NewsPaperStore");
		if(newsPaper != null)
		{
			if(this.index < this.newsPapers.length)
			{
				this.newsPapers[this.index] = newsPaper;
				System.out.println("Stored the NewsPaper details in the index : "+this.index);
				this.index++;
			}
			else
			{
				System.out.println("The NewsPaper store is full");
			}
		}
		else
		{
			System.out.println("NewsPaper cannot be null");
		}
	}
	
	void saveAll(NewsPaper[] newsPapers) {
		System.out.println("Running saveAll in NewsPaperStore");
		if (newsPapers != null) 
		{
			for (int start = 0; start < newsPapers.length; start++) 
			{
				if (newsPapers[start] != null) 
				{
					if (this.index < this.newsPapers.length) 
					{
						this.newsPapers[this.index] = newsPapers[start];
						System.out.println("NewsPaper saved in the index: "+this.index);
						this.index++;
					} 
					else 
					{
						System.out.println("NewsPaper Store is full");
						break;
					}
				} 
				else 
				{
					System.out.println("NewsPaper is null at index " + start);
				}
			}
		} 
		else 
		{
			System.out.println("The NewsPaper array is null");
		}
	}
	
	NewsPaper findByName(String name)
	{
		System.out.println("Running findByName in the NewsPaperStore");
		if(name != null)
		{
			for(NewsPaper newsPaper : this.newsPapers)
			{
				if(newsPaper != null && name.equals(newsPaper.name))
				{
					System.out.println("Found the name");
					return newsPaper;
				}
			}
			System.out.println("No match found");
			return null;
		}
		else
		{
			System.out.println("Name cannot be null");
			return null;
		}
	}
	
	void displayAll()
	{
		System.out.println("Running displayAll in the NewsPaperStore");
		boolean found = false;
		for(NewsPaper newsPaper : this.newsPapers)
		{
			if(newsPaper != null)
			{
				newsPaper.display();
				found = true;
			}
		}
		if(!found)
		{
			System.out.println("No NewsPaper is there to display");
		}
	}
	
	String findPaperQualityByName(String name)
	{
		System.out.println("Running findPaperQualityByName in NewsPaperStore");
		if(name != null)
		{
			for(NewsPaper newsPaper : this.newsPapers)
			{
				if(newsPaper != null && name.equals(newsPaper.name))
				{
					System.out.println("Found the Paper Quality from the name: "+name);
					return newsPaper.paperQuality;
				}
			}
			System.out.println("No match found");
			return null;
		}
		else
		{
			System.out.println("The name is null");
			return null;
		}
	}
	
	int findNoOfPagesByNameAndHeadEditor(String name,String headEditor)
	{
		System.out.println("Running findNoOfPagesByNameAndHeadEditor in the NewsPaperStore");
		if(name != null && headEditor != null)
		{
			for(NewsPaper newsPaper : this.newsPapers)
			{
				if(newsPaper != null && name.equals(newsPaper.name) && headEditor.equals(newsPaper.headEditor))
				{
					System.out.println("Found Numbers of Pages from Name : "+name +" and headEditor : "+headEditor);
					return newsPaper.noOfPages;
				}
			}
			System.out.println("No match found");
			return 0;
		}
		else
		{
			System.out.println("The name and Head Editor is null");
			return 0;
		}
	}
	
	void updateLangByName(String name,Lang newLang)
	{
		System.out.println("Running updateLangByName in the NewsPaperStore");
		int found = 0;
		if(name != null && newLang != null)
		{
			for(NewsPaper newsPaper : this.newsPapers)
			{
				if(newsPaper != null && name.equals(newsPaper.name))
				{
					newsPaper.lang = newLang;
					System.out.println("Language updated successfully");
					found = 1;
				}
			}
			if(found==0)
			{
				System.out.println("the name is not found , so language cannot be updated");
			}
		}
		else
		{
			System.out.println("The name or the lang is null");
		}
	}
	
	void updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight(
        InkColor inkColor, int noOfImages, int fontSize,
        String name, double height, double weight) 
	{

		System.out.println("Running updateInkColorAndNoOfImagesAndFontSizeByNameAndHeightAndWeight in the NewsPaperStore");
		boolean found = false;
		if (name != null && inkColor != null) 
		{
			for (NewsPaper paper : this.newsPapers) 
			{
				if (paper != null && name.equals(paper.name) && paper.height == height && paper.weight == weight) 
				{
					paper.inkColor = inkColor;
					paper.noOfImages = noOfImages;
					paper.fontSize = fontSize;
					System.out.println("Details updated successfully");
					found = true;
				}
			}
			if(!found)
			{
				System.out.println("No matching NewsPaper found");
			}
		} 
		else 
		{
			System.out.println("The input values are null");
		}
	}
	
	void replaceByPrintHouseAddress(String printHouseAddress, NewsPaper newsPaper) 
	{
		System.out.println("Running replaceByPrintHouseAddress in NewsPaperStore");
		if (printHouseAddress != null && newsPaper != null) 
		{
			int index = 0;
			for (NewsPaper paper : this.newsPapers) 
			{
				if (paper != null && printHouseAddress.equals(paper.printHouseAddress)) 
				{
					this.newsPapers[index] = newsPaper;
					System.out.println("NewsPaper replaced successfully at index: " + index);
				}
				index++;
			}
			System.out.println("No matching PrintHouseAddress found");
		} 
		else 
		{
			System.out.println("There is no valied inputs");
		}
	}
}