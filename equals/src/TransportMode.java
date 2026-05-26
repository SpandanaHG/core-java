public class TransportMode {
    private String mode;
    private double speed;
    private int capacity;
    private String fuelType;
    private double fare;

    public TransportMode() {
    }

    public TransportMode(String mode, double speed, int capacity, String fuelType, double fare) {
        this.mode = mode;
        this.speed = speed;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.fare = fare;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
        {
            TransportMode transport1 = this;
            if(obj instanceof TransportMode)
            {
                TransportMode transport2 = (TransportMode) obj;
                if(transport1.mode.equals(transport2.mode) && transport1.fuelType.equals(transport2.fuelType))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }
}
