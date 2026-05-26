public class Sensor {
    private String sensorType;
    private String brand;
    private double range;
    private boolean active;
    private int accuracy;

    public Sensor() {
    }

    public Sensor(String sensorType, String brand, double range, boolean active, int accuracy) {
        this.sensorType = sensorType;
        this.brand = brand;
        this.range = range;
        this.active = active;
        this.accuracy = accuracy;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
        {
            Sensor sensor1 = this;
            if(obj instanceof Sensor)
            {
                Sensor sensor2 = (Sensor) obj;
                if(sensor1.sensorType.equals(sensor2.sensorType) && sensor1.brand.equals(sensor2.brand))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
