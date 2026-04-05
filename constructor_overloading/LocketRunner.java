class LocketRunner {
    public static void main(String[] args) {

        Locket locket1 = new Locket();
        Locket locket2 = new Locket("Gold");
        Locket locket3 = new Locket("Gold", "Yellow");
        Locket locket4 = new Locket("Gold", "Yellow", 5000);
        Locket locket5 = new Locket("Gold", "Yellow", 5000, 10, true);

        locket1.display();
        locket2.display();
        locket3.display();
        locket4.display();
        locket5.display();
    }
}