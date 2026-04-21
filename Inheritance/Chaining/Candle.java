class Candle {

    String brand;
    String color;
    String fragrance;
    int quantity;
    double price;

    Candle(String brand, String color) {
        this.brand = brand;
        this.color = color;
        System.out.println("String , String constructor of Candle");
    }

    Candle(String brand, String color, String fragrance) {
        this(brand, color);
        this.fragrance = fragrance;
        System.out.println("String , String , String constructor of Candle");
    }

    Candle(String brand, String color, String fragrance, int quantity, double price) {
        this(brand, color, fragrance);
        this.quantity = quantity;
        this.price = price;
        System.out.println("String , String , String , int , double constructor of Candle");
    }
}