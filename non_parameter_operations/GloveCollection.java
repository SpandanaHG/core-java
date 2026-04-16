class GloveCollection {

    Glove[] gloves = new Glove[20];
    int index = 0;

    void addGlove(Glove glove) {

        System.out.println("Running addGlove in GloveCollection");

        if (glove != null) {
            if (this.index < this.gloves.length) {
                this.gloves[this.index] = glove;
                System.out.println("Glove added at index: " + this.index);
                this.index++;
            } else {
                System.out.println("Collection is full");
            }
        } else {
            System.out.println("Glove cannot be null");
        }
    }

    void displayAll() {

        System.out.println("Displaying all Gloves");

        for (Glove glove : gloves) {
            if (glove != null) {
                glove.display();
            }
			else{
				System.out.println("Glove is null");
			}
        }
    }
}