class BroccoliStore {

    Broccoli[] broccolis = new Broccoli[20];
    int index = 0;

    void saveBroccoli(Broccoli broccoli) {

        System.out.println("Running saveBroccoli in BroccoliStore");

        if (broccoli != null) {
            if (this.index < this.broccolis.length) {
                this.broccolis[this.index] = broccoli;
                System.out.println("Broccoli added to index: " + this.index);
                this.index++;
            } else {
                System.out.println("Store is full");
            }
        } else {
            System.out.println("Broccoli cannot be null");
        }
    }

    void displayAll() {

        System.out.println("Displaying all Broccoli");

        for (Broccoli broccoli : broccolis) {
            if (broccoli != null) {
                broccoli.display();
            }
			else{
				System.out.println("Broccoli is null");
			}
        }
    }
}