class TouristPlaces {
	public static void main(String[] values)
	{
		String place1 = "Taj Mahal";
		String place2 = "Red Fort";
		String place3 = "Qutub Minar";
		String place4 = "India Gate";
		String place5 = "Mysore Palace";
		String place6 = "Hampi";
		String place7 = "Charminar";
		String place8 = "Gateway of India";
		String place9 = "Golden Temple";
		String place10 = "Kerala Backwaters";
		String place11 = "Goa Beaches";
		String place12 = "Ooty";
		String place13 = "Coorg";
		String place14 = "Manali";
		String place15 = "Shimla";
		String place16 = "Darjeeling";
		String place17 = "Leh Ladakh";
		String place18 = "Rishikesh";
		String place19 = "Varanasi Ghats";
		String place20 = "Ajanta Caves";
		String place21 = "Ellora Caves";
		String place22 = "Konark Sun Temple";
		String place23 = "Khajuraho Temples";
		String place24 = "Meenakshi Temple";
		String place25 = "Jog Falls";
		String place26 = "Belur Temple";
		String place27 = "Halebidu Temple";
		String place28 = "Bandipur National Park";
		String place29 = "Sundarbans";
		String place30 = "Andaman Islands";
		
		String[] places = {place1, place2, place3, place4, place5, place6, place7, place8, place9, place10, place11, place12, place13, place14, place15, place16, place17, place18, place19, place20, place21, place22, place23, place24, place25, place26, place27, place28, place29, place30};
		
		for(int start=29 ; start >=0 ; start--)
		{
			System.out.println("Car Model at position "+start+ " is :"+places[start]);
		}	
		System.out.println(places[30]);
	}
}