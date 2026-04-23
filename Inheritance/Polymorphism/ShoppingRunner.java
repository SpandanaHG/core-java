class ShoppingRunner {

    public static void main(String... args) {

        System.out.println("Static Polymorphism");

        ShoppingCart cart = new ShoppingCart();
        cart.checkout(500);
        cart.checkout(300, 200);

        Customer customer1 = new Customer();
        Customer customer2 = new Customer("Spandana");
    }
}