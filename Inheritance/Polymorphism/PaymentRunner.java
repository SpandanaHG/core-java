class PaymentRunner {

    public static void main(String... args) {

        System.out.println("Dynamic Polymorphism");

        Payment payment = new CreditCardPayment();
        payment.pay();
    }
}