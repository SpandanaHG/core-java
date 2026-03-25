class CountryPresidentRunner {
    public static void main(String[] values) {

        String[] countries = { "India", "USA", "France", "Russia", "China","Brazil", "Germany", "Italy", 
			"Turkey", "Argentina","South Africa", "Mexico", "Indonesia", "South Korea", "Sri Lanka","Nepal",
			"Bangladesh", "Pakistan", "Iran", "Iraq","Israel", "Egypt", "Nigeria", "Kenya", "Uganda","Ghana",
			"Ethiopia", "Tanzania", "Zimbabwe", "Zambia","Angola", "Algeria", "Morocco", "Saudi Arabia","UAE",
			"Qatar", "Kuwait", "Oman", "Jordan", "Thailand","Malaysia", "Singapore", "Philippines", "Vietnam", 
			"Myanmar","Cambodia", "Laos", "Mongolia", "Kazakhstan", "Uzbekistan", "Turkmenistan", "Kyrgyzstan", 
			"Tajikistan", "Poland", "Ukraine","Czech Republic", "Slovakia", "Hungary", "Romania", "Bulgaria",
		"Greece", "Portugal", "Spain", "Norway", "Sweden","Finland", "Denmark", "Iceland", "Ireland", "Switzerland"};
		for(int i = 0; i < countries.length; i++) 
		{
            String president = CountryPresident.getPresident(countries[i]);
            if(president != null) 
			{
                System.out.println("Country: " + countries[i]);
                System.out.println("President: " + president);
            } 
			else 
			{
                System.out.println("Country: " + countries[i]);
                System.out.println("President not found");
            }
        }
    }
}