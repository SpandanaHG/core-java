public class City {
    private String cityName;
    private String state;
    private long population;
    private double area;
    private String famousPlace;

    public City() {
    }

    public City(String cityName, String state, long population, double area, String famousPlace) {
        this.cityName = cityName;
        this.state = state;
        this.population = population;
        this.area = area;
        this.famousPlace = famousPlace;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null)
        {
            City city1 = this;
            if(obj instanceof City)
            {
                City city2 = (City) obj;

                if(city1.cityName.equals(city2.cityName) &&
                        city1.state.equals(city2.state))
                {
                    return true;
                }
            }
        }
        return false;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getPopulation() {
        return population;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getFamousPlace() {
        return famousPlace;
    }

    public void setFamousPlace(String famousPlace) {
        this.famousPlace = famousPlace;
    }
}
