class CupRunner {

    public static void main(String[] args) {

        Cup cup = new Cup();

        cup.addCup("Small Cup");
        cup.addCup("Big Cup");
        cup.addCup("Glass Cup");
        cup.addCup("Steel Cup");
        cup.addCup("Paper Cup");

        cup.findCup("Glass Cup");   
        cup.findCup("Plastic Cup"); 
    }
}