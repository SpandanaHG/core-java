class SilencerStore {

    Silencer[] silencers = new Silencer[20];
    int index = 0;

    void saveSilencer(Silencer silencer) {
        System.out.println("Running saveSilencer in SilencerStore");

        if (silencer != null) {
            if (this.index < this.silencers.length) {
                this.silencers[this.index] = silencer;
                System.out.println("Silencer added to index: " + this.index);
                this.index++;
            } else {
                System.out.println("Store is full");
            }
        } else {
            System.out.println("Silencer cannot be null");
        }
    }

    void displayAll() {
        System.out.println("Displaying all Silencers");

        for (Silencer silencer : silencers) {
            if (silencer != null) {
                silencer.display();
            }
        }
    }
}