class JuiceRunner {

    public static void main(String[] args) {

        Juice juice = new Juice();

        juice.storeJuice("Apple");
        juice.storeJuice("Mango");
        juice.storeJuice("Orange");
        juice.storeJuice("Grape");
        juice.storeJuice("Pineapple");

        juice.findJuice("Mango");    
        juice.findJuice("Banana");  
    }
}