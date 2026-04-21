final class Stock {

    String stockName;
    String company;
    double price;
    int quantity;
    String market;

    Stock(String stockName , String company , double price , int quantity , String market) 
	{
        this.stockName = stockName;
		this.company = company;
		this.price = price;
		this.quantity = quantity;
		this.market = market;
    }
}