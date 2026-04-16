class SpaceHubRunner {

    public static void main(String... values) {

        SpaceHub spaceHub = new SpaceHub();

        SpaceShip spaceShip1  = new SpaceShip("Apollo", "Crew", 25000, 5000, "Moon", "USA", 3, 30000, "Alloy", "1969");
        SpaceShip spaceShip2  = new SpaceShip("Chandrayaan", "Research", 20000, 4000, "Moon", "India", 0, 25000, "Alloy", "2019");
        SpaceShip spaceShip3  = new SpaceShip("Falcon", "Cargo", 27000, 6000, "Orbit", "USA", 2, 35000, "Steel", "2020");
        SpaceShip spaceShip4  = new SpaceShip("Soyuz", "Crew", 22000, 4500, "ISS", "Russia", 3, 28000, "Alloy", "2015");
        SpaceShip spaceShip5  = new SpaceShip("Starship", "Cargo", 30000, 7000, "Mars", "USA", 5, 50000, "Steel", "2023");
        SpaceShip spaceShip6  = new SpaceShip("Gaganyaan", "Crew", 24000, 4800, "Orbit", "India", 3, 29000, "Alloy", "2024");
        SpaceShip spaceShip7  = new SpaceShip("Dragon", "Cargo", 26000, 5500, "ISS", "USA", 4, 32000, "Steel", "2021");
        SpaceShip spaceShip8  = new SpaceShip("Shenzhou", "Crew", 23000, 4600, "ISS", "China", 3, 27000, "Alloy", "2018");
        SpaceShip spaceShip9  = new SpaceShip("Orion", "Crew", 28000, 6500, "Moon", "USA", 4, 40000, "Alloy", "2022");
        SpaceShip spaceShip10 = new SpaceShip("Viking", "Research", 21000, 4200, "Mars", "USA", 0, 26000, "Alloy", "1976");
        SpaceShip spaceShip11 = new SpaceShip("Hubble", "Research", 15000, 3000, "Orbit", "USA", 0, 20000, "Alloy", "1990");
        SpaceShip spaceShip12 = new SpaceShip("Voyager", "Research", 17000, 3500, "Space", "USA", 0, 22000, "Alloy", "1977");
        SpaceShip spaceShip13 = new SpaceShip("Pioneer", "Research", 16000, 3400, "Space", "USA", 0, 21000, "Alloy", "1973");
        SpaceShip spaceShip14 = new SpaceShip("Sputnik", "Satellite", 14000, 2000, "Orbit", "Russia", 0, 18000, "Metal", "1957");
        SpaceShip spaceShip15 = new SpaceShip("Luna", "Research", 19000, 3800, "Moon", "Russia", 0, 24000, "Alloy", "1966");
        SpaceShip spaceShip16 = new SpaceShip("NewHorizons", "Research", 30000, 5000, "Pluto", "USA", 0, 35000, "Alloy", "2006");
        SpaceShip spaceShip17 = new SpaceShip("Cassini", "Research", 25000, 4800, "Saturn", "USA", 0, 30000, "Alloy", "1997");
        SpaceShip spaceShip18 = new SpaceShip("Juno", "Research", 26000, 4900, "Jupiter", "USA", 0, 31000, "Alloy", "2011");
        SpaceShip spaceShip19 = new SpaceShip("MarsOrbiter", "Research", 20000, 4200, "Mars", "India", 0, 26000, "Alloy", "2014");
        SpaceShip spaceShip20 = new SpaceShip("Artemis", "Crew", 29000, 6800, "Moon", "USA", 4, 42000, "Alloy", "2025");

        spaceHub.addSpaceShip(null);
        spaceHub.addSpaceShip(spaceShip1);
        spaceHub.addSpaceShip(spaceShip2);
        spaceHub.addSpaceShip(spaceShip3);
        spaceHub.addSpaceShip(spaceShip4);
        spaceHub.addSpaceShip(spaceShip5);
        spaceHub.addSpaceShip(spaceShip6);
        spaceHub.addSpaceShip(spaceShip7);
        spaceHub.addSpaceShip(spaceShip8);
        spaceHub.addSpaceShip(spaceShip9);
        spaceHub.addSpaceShip(spaceShip10);
        spaceHub.addSpaceShip(spaceShip11);
        spaceHub.addSpaceShip(spaceShip12);
        spaceHub.addSpaceShip(spaceShip13);
        spaceHub.addSpaceShip(spaceShip14);
        spaceHub.addSpaceShip(spaceShip15);
        spaceHub.addSpaceShip(spaceShip16);
        spaceHub.addSpaceShip(spaceShip17);
        spaceHub.addSpaceShip(spaceShip18);
        spaceHub.addSpaceShip(spaceShip19);
        spaceHub.addSpaceShip(spaceShip20);
        spaceHub.displayAll();
    }
}