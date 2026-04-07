class SugarCaneRunner {

    public static void main(String... args) {

        SugarCane sugarCane = new SugarCane();
        sugarCane.height = 10;
        sugarCane.type = SugarType.SWEET;

        Farm farm = new Farm("Ravi", 20);
        farm.location = "Mandya";
        farm.sugarCane = sugarCane;

        farm.info();

        System.out.println("\n--------------------\n");

        SugarCane sugarCane1 = new SugarCane();
        sugarCane1.height = 7;
        sugarCane1.type = SugarType.DRY;

        Farm farm1 = new Farm("Kiran", 15);
        farm1.location = "Mysore";
        farm1.sugarCane = sugarCane1;

        farm1.info();
    }
}