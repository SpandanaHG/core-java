class CandleRunner {

    public static void main(String[] args) {

        Candle candle1 = new Candle("IKEA", "White");
        System.out.println("Brand : " + candle1.brand);
        System.out.println("Color : " + candle1.color);
        System.out.println("Fragrance : " + candle1.fragrance);
        System.out.println("Quantity : " + candle1.quantity);
        System.out.println("Price : " + candle1.price);

        Candle candle2 = new Candle("HomeCentre", "Red", "Rose");
        System.out.println("Brand : " + candle2.brand);
        System.out.println("Color : " + candle2.color);
        System.out.println("Fragrance : " + candle2.fragrance);
        System.out.println("Quantity : " + candle2.quantity);
        System.out.println("Price : " + candle2.price);

        Candle candle3 = new Candle("Miniso", "Blue", "Lavender", 10, 499.0);
        System.out.println("Brand : " + candle3.brand);
        System.out.println("Color : " + candle3.color);
        System.out.println("Fragrance : " + candle3.fragrance);
        System.out.println("Quantity : " + candle3.quantity);
        System.out.println("Price : " + candle3.price);
    }
}