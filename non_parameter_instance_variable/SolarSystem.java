class SolarSystem {

    String brand;
    int powerOutput;
    String inverterType;
    SolarPanel solarPanel;

    SolarSystem(String brand, int powerOutput) {
        System.out.println("String , int constructor");
        this.brand = brand;
        this.powerOutput = powerOutput;
        System.out.println("Brand: " + this.brand);
        System.out.println("Power Output: " + this.powerOutput);
        System.out.println("Inverter Type: " + this.inverterType);
    }

    void info() {
        System.out.println("Running info in SolarSystem");
        if (this.solarPanel != null) {
            this.solarPanel.display();
        } else {
            System.out.println("Invalid solar panel");
        }
    }
}