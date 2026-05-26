public class TransportModeRunner
{
    public static void main(String[] args)
    {
        TransportMode transport1 = new TransportMode("Bus", 60.0, 50, "Diesel", 25.0);
        TransportMode transport2 = new TransportMode("Train", 120.0, 500, "Electric", 150.0);
        TransportMode transport3 = new TransportMode("Bus", 70.0, 45, "Diesel", 30.0);
        boolean isSame = transport1.equals(transport2);
        System.out.println("TransportMode is same: " + isSame);
        boolean same = transport1.equals(transport3);
        System.out.println("TransportMode is same: " + same);
    }
}