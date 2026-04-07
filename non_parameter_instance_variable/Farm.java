class Farm {

    String ownerName;
    String location;
    int noOfWorkers;
    SugarCane sugarCane;

    Farm(String ownerName, int noOfWorkers) {
        System.out.println("String , int constructor");
        this.ownerName = ownerName;
        this.noOfWorkers = noOfWorkers;
        System.out.println("Owner: " + this.ownerName);
        System.out.println("No of Workers: " + this.noOfWorkers);
        System.out.println("Location: " + this.location);
    }

    void info() {
        System.out.println("Running info in Farm");
        if (this.sugarCane != null) {
            this.sugarCane.display();
        } else {
            System.out.println("Invalid sugarcane");
        }
    }
}