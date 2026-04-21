class RareCoin extends Coin {

    @Override
    void design() {
        System.out.println("RareCoin has unique design");
    }

    @Override
    void value() {
        System.out.println("RareCoin has high value");
    }

    @Override
    void material() {
        System.out.println("RareCoin made of gold/silver");
    }
}