class CreditCardPayment extends Payment {

    @Override
    void pay() {
        System.out.println("Payment done using Credit Card");
    }
}