class LaserCollection {

    Laser[] lasers = new Laser[20];
    int index = 0;

    void addLaser(Laser laser) {

        System.out.println("Running addLaser in LaserCollection");

        if (laser != null) {
            if (this.index < this.lasers.length) {
                this.lasers[this.index] = laser;
                System.out.println("Laser added at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Collection is full");
            }
        } else {
            System.out.println("Laser cannot be null");
        }
    }

    void displayAll() {

        System.out.println("Displaying all Lasers");

        for (Laser laser : lasers) {
            if (laser != null) {
                laser.display();
            }
			else{
				System.out.println("Laser is null");
			}
        }
    }
}