class SolarRunner {

    public static void main(String... args) {

        SolarPanel panel = new SolarPanel();
        panel.capacity = 500;
        panel.type = PanelType.MONOCRYSTALLINE;

        SolarSystem system = new SolarSystem("Tata", 1000);
        system.inverterType = "Hybrid";
        system.solarPanel = panel;

        system.info();

        System.out.println("\n--------------------\n");

        SolarPanel panel1 = new SolarPanel();
        panel1.capacity = 300;
        panel1.type = PanelType.POLYCRYSTALLINE;

        SolarSystem system1 = new SolarSystem("Adani", 800);
        system1.inverterType = "OnGrid";
        system1.solarPanel = panel1;

        system1.info();
    }
}