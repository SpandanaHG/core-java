class StockRunner {

    public static void main(String... args) {

        Stock stock = new Stock("TCS","Tata Consultancy Services",3500.50,100,"NSE");

        System.out.println("Stock Name: " + stock.stockName);
        System.out.println("Company: " + stock.company);
        System.out.println("Price: " + stock.price);
        System.out.println("Quantity: " + stock.quantity);
        System.out.println("Market: " + stock.market);
    }
}