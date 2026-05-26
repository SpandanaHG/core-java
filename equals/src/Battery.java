public class Battery {
    private String brand;
    private int capacity;
    private String type;
    private double voltage;
    private boolean rechargeable;

    public Battery() {
    }

    public Battery(String brand, int capacity, String type, double voltage, boolean rechargeable) {
        this.brand = brand;
        this.capacity = capacity;
        this.type = type;
        this.voltage = voltage;
        this.rechargeable = rechargeable;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
        {
            Battery battery1 = this;
            if(obj instanceof Battery)
            {
                Battery battery2 = (Battery) obj;
                if(battery1.brand.equals(battery2.brand) && battery1.type.equals(battery2.type))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public boolean isRechargeable() {
        return rechargeable;
    }

    public void setRechargeable(boolean rechargeable) {
        this.rechargeable = rechargeable;
    }
}
