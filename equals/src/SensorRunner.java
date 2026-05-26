public class SensorRunner
{
    public static void main(String[] args)
    {
        Sensor sensor1 = new Sensor("Temperature", "Bosch", 50.5, true, 95);
        Sensor sensor2 = new Sensor("Motion", "Samsung", 30.0, false, 85);
        Sensor sensor3 = new Sensor("Temperature", "Bosch", 60.0, true, 98);
        boolean isSame = sensor1.equals(sensor2);
        System.out.println("Sensor is same: " + isSame);
        boolean same = sensor1.equals(sensor3);
        System.out.println("Sensor is same: " + same);
    }
}