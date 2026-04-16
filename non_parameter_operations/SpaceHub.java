class SpaceHub {

    SpaceShip[] ships = new SpaceShip[20];
    int index = 0;

    void addSpaceShip(SpaceShip ship) {

        System.out.println("Running addSpaceShip in SpaceHub");

        if (ship != null) {
            if (this.index < this.ships.length) {
                this.ships[this.index] = ship;
                System.out.println("SpaceShip added at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Hub is full");
            }
        } else {
            System.out.println("SpaceShip cannot be null");
        }
    }

    void displayAll() {

        System.out.println("Displaying all SpaceShips");

        for (SpaceShip spaceShip : ships) {
            if (spaceShip != null) {
                spaceShip.display();
            }
        }
    }
}