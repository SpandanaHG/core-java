class Rocket {

    String name;
    String country;
    double cost;
    int stages;
    boolean reusable;

    Rocket() {
        System.out.println("Default constructor");
    }

    Rocket(String name) {
        this.name = name;
    }

    Rocket(String name, String country) {
        this.name = name;
        this.country = country;
    }

    Rocket(String name, String country, double cost) {
        this.name = name;
        this.country = country;
        this.cost = cost;
    }
	
    Rocket(String name, String country, double cost, int stages, boolean reusable) {
        this.name = name;
        this.country = country;
        this.cost = cost;
        this.stages = stages;
        this.reusable = reusable;
    }

    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Country: " + this.country);
        System.out.println("Cost: " + this.cost);
        System.out.println("Stages: " + this.stages);
        System.out.println("Reusable: " + this.reusable);
		System.out.println("----------------------");
    }
}