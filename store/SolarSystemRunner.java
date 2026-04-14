class SolarSystemRunner {

    public static void main(String[] args) 
	{

        SolarSystem solarSystem = new SolarSystem();

        solarSystem.savePlanet("Mercury");
        solarSystem.savePlanet("Venus");
        solarSystem.savePlanet("Earth");
        solarSystem.savePlanet("Mars");
        solarSystem.savePlanet("Jupiter");

        solarSystem.searchPlanet("Earth");  
        solarSystem.searchPlanet("Pluto");  
    }
}