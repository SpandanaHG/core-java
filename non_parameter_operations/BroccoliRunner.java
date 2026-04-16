class BroccoliRunner {

    public static void main(String... values) {

        BroccoliStore broccoliStore = new BroccoliStore();

        Broccoli broccoli1  = new Broccoli("Green", 0.5, "Fresh", "Bitter", "India", 60, "Small", "Fresh", "Cooking", "Tree");
        Broccoli broccoli2  = new Broccoli("Dark Green", 0.7, "Organic", "Mild", "USA", 80, "Medium", "Fresh", "Salad", "Tree");
        Broccoli broccoli3  = new Broccoli("Light Green", 0.6, "Fresh", "Bitter", "India", 65, "Small", "Fresh", "Cooking", "Tree");
        Broccoli broccoli4  = new Broccoli("Green", 0.8, "Organic", "Mild", "UK", 90, "Large", "Fresh", "Salad", "Tree");
        Broccoli broccoli5  = new Broccoli("Dark Green", 0.9, "Fresh", "Bitter", "India", 70, "Medium", "Fresh", "Cooking", "Tree");
        Broccoli broccoli6  = new Broccoli("Green", 0.5, "Fresh", "Mild", "India", 60, "Small", "Fresh", "Cooking", "Tree");
        Broccoli broccoli7  = new Broccoli("Dark Green", 0.7, "Organic", "Bitter", "USA", 85, "Medium", "Fresh", "Salad", "Tree");
        Broccoli broccoli8  = new Broccoli("Light Green", 0.6, "Fresh", "Mild", "India", 65, "Small", "Fresh", "Cooking", "Tree");
        Broccoli broccoli9  = new Broccoli("Green", 0.8, "Organic", "Bitter", "UK", 95, "Large", "Fresh", "Salad", "Tree");
        Broccoli broccoli10 = new Broccoli("Dark Green", 0.9, "Fresh", "Mild", "India", 75, "Medium", "Fresh", "Cooking", "Tree");
        Broccoli broccoli11 = new Broccoli("Green", 0.5, "Fresh", "Bitter", "India", 60, "Small", "Fresh", "Cooking", "Tree");
        Broccoli broccoli12 = new Broccoli("Dark Green", 0.7, "Organic", "Mild", "USA", 80, "Medium", "Fresh", "Salad", "Tree");
        Broccoli broccoli13 = new Broccoli("Light Green", 0.6, "Fresh", "Bitter", "India", 65, "Small", "Fresh", "Cooking", "Tree");
        Broccoli broccoli14 = new Broccoli("Green", 0.8, "Organic", "Mild", "UK", 90, "Large", "Fresh", "Salad", "Tree");
        Broccoli broccoli15 = new Broccoli("Dark Green", 0.9, "Fresh", "Bitter", "India", 70, "Medium", "Fresh", "Cooking", "Tree");
        Broccoli broccoli16 = new Broccoli("Green", 0.5, "Fresh", "Mild", "India", 60, "Small", "Fresh", "Cooking", "Tree");
        Broccoli broccoli17 = new Broccoli("Dark Green", 0.7, "Organic", "Bitter", "USA", 85, "Medium", "Fresh", "Salad", "Tree");
        Broccoli broccoli18 = new Broccoli("Light Green", 0.6, "Fresh", "Mild", "India", 65, "Small", "Fresh", "Cooking", "Tree");
        Broccoli broccoli19 = new Broccoli("Green", 0.8, "Organic", "Bitter", "UK", 95, "Large", "Fresh", "Salad", "Tree");
        Broccoli broccoli20 = new Broccoli("Dark Green", 0.9, "Fresh", "Mild", "India", 75, "Medium", "Fresh", "Cooking", "Tree");

        broccoliStore.saveBroccoli(null);
        broccoliStore.saveBroccoli(broccoli1);
        broccoliStore.saveBroccoli(broccoli2);
        broccoliStore.saveBroccoli(broccoli3);
        broccoliStore.saveBroccoli(broccoli4);
        broccoliStore.saveBroccoli(broccoli5);
        broccoliStore.saveBroccoli(broccoli6);
        broccoliStore.saveBroccoli(broccoli7);
        broccoliStore.saveBroccoli(broccoli8);
        broccoliStore.saveBroccoli(broccoli9);
        broccoliStore.saveBroccoli(broccoli10);
        broccoliStore.saveBroccoli(broccoli11);
        broccoliStore.saveBroccoli(broccoli12);
        broccoliStore.saveBroccoli(broccoli13);
        broccoliStore.saveBroccoli(broccoli14);
        broccoliStore.saveBroccoli(broccoli15);
        broccoliStore.saveBroccoli(broccoli16);
        broccoliStore.saveBroccoli(broccoli17);
        broccoliStore.saveBroccoli(broccoli18);
        broccoliStore.saveBroccoli(broccoli19);
        broccoliStore.saveBroccoli(broccoli20);
        broccoliStore.displayAll();
    }
}