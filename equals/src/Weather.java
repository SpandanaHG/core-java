public class Weather {
    private String climate;
    private double temperature;
    private int humidity;
    private double windSpeed;
    private String city;

    public Weather() {
    }

    public Weather(String climate, double temperature, int humidity, double windSpeed, String city) {
        this.climate = climate;
        this.temperature = temperature;
        this.humidity = humidity;
        this.windSpeed = windSpeed;
        this.city = city;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
        {
            Weather weather1 = this;
            if(obj instanceof Weather)
            {
                Weather weather2 = (Weather) obj;

                if(weather1.climate.equals(weather2.climate) && weather1.city.equals(weather2.city))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
