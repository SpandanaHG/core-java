public class WeatherRunner {
    public static void main(String... values){
        Weather weather1 = new Weather("Sunny", 32.5, 60, 12.5, "Bangalore");
        Weather weather2 = new Weather("Rainy", 24.0, 80, 18.0, "Mysore");
        Weather weather3 = new Weather("Sunny", 35.0, 55, 10.0, "Bangalore");
        boolean isSame = weather1.equals(weather2);
        System.out.println("Weather is same: " + isSame);
        boolean same = weather1.equals(weather3);
        System.out.println("Weather is same: " + same);
    }
}
