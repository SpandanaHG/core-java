class ShoppingCart {

    // method overloading
    void checkout(int price) {
        System.out.println("Single item checkout: " + price);
    }

    void checkout(int price1, int price2) {
        System.out.println("Two items checkout: " + (price1 + price2));
    }
}
