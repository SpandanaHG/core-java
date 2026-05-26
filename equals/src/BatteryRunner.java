public class BatteryRunner
{
    public static void main(String[] args)
    {
        Battery battery1 = new Battery("Duracell", 5000, "Lithium-Ion", 3.7, true);
        Battery battery2 = new Battery("Amaron", 4500, "Lead Acid", 12.0, false);
        Battery battery3 = new Battery("Duracell", 6000, "Lithium-Ion", 4.0, true);
        boolean isSame = battery1.equals(battery2);
        System.out.println("Battery is same: " + isSame);
        boolean same = battery1.equals(battery3);
        System.out.println("Battery is same: " + same);
    }
}