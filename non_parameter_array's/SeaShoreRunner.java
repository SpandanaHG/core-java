class SeaShoreRunner {
	
    public static void main(String... args) 
	{

        LightHouse lightHouse1 = new LightHouse("LH1", 100, LightType.OLD);
        lightHouse1.location = "Coast1";
        lightHouse1.active = true;

        LightHouse lightHouse2 = new LightHouse("LH2", 120, LightType.MODERN);
        lightHouse2.location = "Coast2";
        lightHouse2.active = true;

        LightHouse lightHouse3 = new LightHouse("LH3", 150, LightType.AUTOMATIC);
        lightHouse3.location = "Coast3";
        lightHouse3.active = false;

        LightHouse[] lights = {lightHouse1, lightHouse2, lightHouse3};

        SeaShore sea = new SeaShore("Goa Beach", "India", lights);
        sea.climate = "Humid";
        sea.touristPlace = true;

        sea.display();
    }
}