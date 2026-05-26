public class CityRunner
{
    public static void main(String[] args)
    {
        City city1 = new City("Bangalore", "Karnataka", 12000000, 741.0, "Vidhana Soudha");
        City city2 = new City("Mysore", "Karnataka", 1000000, 156.0, "Mysore Palace");
        City city3 = new City("Bangalore", "Karnataka", 13000000, 800.0, "Cubbon Park");
        boolean isSame = city1.equals(city2);
        System.out.println("City is same: " + isSame);
        boolean same = city1.equals(city3);
        System.out.println("City is same: " + same);
    }
}