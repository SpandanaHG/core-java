public class IceCream {
    private String flavor;
    private String brand;
    private double price;
    private String size;
    private boolean sugarFree;

    public IceCream() {
    }

    public IceCream(String flavor, String brand, double price, String size, boolean sugarFree) {
        this.flavor = flavor;
        this.brand = brand;
        this.price = price;
        this.size = size;
        this.sugarFree = sugarFree;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
        {
            IceCream iceCream1 = this;
            if(obj instanceof IceCream)
            {
                IceCream iceCream2 = (IceCream) obj;
                if(iceCream1.flavor.equals(iceCream2.flavor) && iceCream1.brand.equals(iceCream2.brand))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public boolean isSugarFree() {
        return sugarFree;
    }

    public void setSugarFree(boolean sugarFree) {
        this.sugarFree = sugarFree;
    }
}
