class CricketData {

    Cricket[] crickets = new Cricket[20];
    int index = 0;

    void addCricket(Cricket cricket) {

        System.out.println("Running addCricket in CricketData");

        if (cricket != null) {
            if (this.index < this.crickets.length) {
                this.crickets[this.index] = cricket;
                System.out.println("Cricket added at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Data is full");
            }
        } else {
            System.out.println("Cricket cannot be null");
        }
    }

    void displayAll() {

        System.out.println("Displaying all Cricket data");

        for (Cricket cricket : crickets) {
            if (cricket != null) {
                cricket.display();
            }
			else{
				System.out.println("Cricket is Null");
			}
        }
    }
}