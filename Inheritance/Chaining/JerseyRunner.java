class JerseyRunner {
	
    public static void main(String... args) 
	{

        Jersey jersey1 = new SportsJersey();
        jersey1.team(); 
		jersey1.material(); 
		jersey1.size(); 
		jersey1.usage(); 
		jersey1.color();

        Jersey jersey2 = new SportsJersey();
        jersey2.team(); 
		jersey2.material(); 
		jersey2.size(); 
		jersey2.usage(); 
		jersey2.color();
    }
}