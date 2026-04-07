class SolarPanel {

    int capacity;
    PanelType type;

    void display() {
        System.out.println("Running display in SolarPanel");
        System.out.println("Capacity: " + this.capacity);
        System.out.println("Type: " + this.type);
    }
}