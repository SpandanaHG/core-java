class WaterMelonStoreRunner{
	
	public static void main(String... values)
	{
		WaterMelonStore waterMelonStore = new WaterMelonStore();
		
		WaterMelon waterMelon1  = new WaterMelon("Green", 5.5, 8, 200, "Round", "India", 120, true, "Sugar Baby", "Medium");
		WaterMelon waterMelon2  = new WaterMelon("Dark Green", 6.0, 9, 250, "Oval", "USA", 150, true, "Crimson Sweet", "Large");
		WaterMelon waterMelon3  = new WaterMelon("Light Green", 4.5, 7, 180, "Round", "Brazil", 100, false, "Charleston Gray", "Small");
		WaterMelon waterMelon4  = new WaterMelon("Green Striped", 5.8, 8, 210, "Oval", "India", 130, true, "Jubilee", "Medium");
		WaterMelon waterMelon5  = new WaterMelon("Dark Green", 6.2, 9, 260, "Round", "USA", 155, true, "Black Diamond", "Large");
		WaterMelon waterMelon6  = new WaterMelon("Light Green", 4.8, 7, 190, "Oval", "Mexico", 110, false, "Golden Midget", "Small");
		WaterMelon waterMelon7  = new WaterMelon("Green", 5.3, 8, 205, "Round", "India", 125, true, "Sugar Baby", "Medium");
		WaterMelon waterMelon8  = new WaterMelon("Striped Green", 6.5, 9, 270, "Oval", "USA", 160, true, "Crimson Sweet", "Large");
		WaterMelon waterMelon9  = new WaterMelon("Light Green", 4.2, 6, 170, "Round", "Brazil", 95, false, "Icebox", "Small");
		WaterMelon waterMelon10 = new WaterMelon("Green", 5.9, 8, 220, "Oval", "India", 135, true, "Jubilee", "Medium");
		WaterMelon waterMelon11 = new WaterMelon("Dark Green", 6.3, 9, 255, "Round", "USA", 158, true, "Black Diamond", "Large");
		WaterMelon waterMelon12 = new WaterMelon("Light Green", 4.7, 7, 185, "Oval", "Mexico", 105, false, "Golden Midget", "Small");
		WaterMelon waterMelon13 = new WaterMelon("Green", 5.4, 8, 210, "Round", "India", 128, true, "Sugar Baby", "Medium");
		WaterMelon waterMelon14 = new WaterMelon("Striped Green", 6.6, 9, 275, "Oval", "USA", 165, true, "Crimson Sweet", "Large");
		WaterMelon waterMelon15 = new WaterMelon("Light Green", 4.3, 6, 175, "Round", "Brazil", 98, false, "Icebox", "Small");
		WaterMelon waterMelon16 = new WaterMelon("Green", 5.7, 8, 215, "Oval", "India", 132, true, "Jubilee", "Medium");
		WaterMelon waterMelon17 = new WaterMelon("Dark Green", 6.4, 9, 265, "Round", "USA", 162, true, "Black Diamond", "Large");
		WaterMelon waterMelon18 = new WaterMelon("Light Green", 4.6, 7, 180, "Oval", "Mexico", 108, false, "Golden Midget", "Small");
		WaterMelon waterMelon19 = new WaterMelon("Green", 5.2, 8, 200, "Round", "India", 122, true, "Sugar Baby", "Medium");
		WaterMelon waterMelon20 = new WaterMelon("Striped Green", 6.7, 9, 280, "Oval", "USA", 170, true, "Crimson Sweet", "Large");
		
		waterMelonStore.saveWaterMelon(null);
		waterMelonStore.saveWaterMelon(waterMelon1);
		waterMelonStore.saveWaterMelon(waterMelon2);
		waterMelonStore.saveWaterMelon(waterMelon3);
		waterMelonStore.saveWaterMelon(waterMelon4);
		waterMelonStore.saveWaterMelon(waterMelon5);
		waterMelonStore.saveWaterMelon(waterMelon6);
		waterMelonStore.saveWaterMelon(waterMelon7);
		waterMelonStore.saveWaterMelon(waterMelon8);
		waterMelonStore.saveWaterMelon(waterMelon9);
		waterMelonStore.saveWaterMelon(waterMelon10);
		waterMelonStore.saveWaterMelon(waterMelon11);
		waterMelonStore.saveWaterMelon(waterMelon12);
		waterMelonStore.saveWaterMelon(waterMelon13);
		waterMelonStore.saveWaterMelon(waterMelon14);
		waterMelonStore.saveWaterMelon(waterMelon15);
		waterMelonStore.saveWaterMelon(waterMelon16);
		waterMelonStore.saveWaterMelon(waterMelon17);
		waterMelonStore.saveWaterMelon(waterMelon18);
		waterMelonStore.saveWaterMelon(waterMelon19);
		waterMelonStore.saveWaterMelon(waterMelon20);
		
		waterMelonStore.displayAll();
	}
}