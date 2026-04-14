class AlloyRunner {

    public static void main(String[] args) {

        Alloy alloy = new Alloy();

        alloy.saveAlloy("Steel");
        alloy.saveAlloy("Bronze");
        alloy.saveAlloy("Brass");
        alloy.saveAlloy("Alloy Steel");
        alloy.saveAlloy("Duralumin");

        alloy.searchAlloy("Brass");
        alloy.searchAlloy("Iron");
    }
}