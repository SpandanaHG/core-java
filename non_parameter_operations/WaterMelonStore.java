class WaterMelonStore{
	
	WaterMelon[] waterMelons = new WaterMelon[20];
	int index = 0;
	
	void saveWaterMelon(WaterMelon waterMelon)
	{
		System.out.println("Running saveWaterMelon in WaterMelonStore");
		if(waterMelon != null)
		{
			if(this.index < this.waterMelons.length)
			{
				this.waterMelons[this.index] = waterMelon;
				System.out.println("WaterMelon added to the index: "+this.index);
				this.index++;
			}
			else
			{
				System.out.println("The Store if full");
			}
		}
		else
		{
			System.out.println("WaterMelon cannot be null");
		}
	}
	
	void displayAll()
	{
		System.out.println("Displaying all the WaterMelons");
		
		for(WaterMelon melon : waterMelons)
		{
			if(melon != null)
			{
				melon.display();
			}
		}
	}
}