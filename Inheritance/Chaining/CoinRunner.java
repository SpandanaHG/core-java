class CoinRunner {

    public static void main(String[] args) {

        Coin coin1 = new RareCoin();
		coin1.design();
        coin1.value();
        coin1.material();
        coin1.shape();
        coin1.usage();
		
        Coin coin2 = new RareCoin();
        coin2.design();
        coin2.value();
        coin2.material();
        coin2.shape();
        coin2.usage();

    }
}