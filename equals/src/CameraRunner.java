public class CameraRunner
{
    public static void main(String[] args)
    {
        Camera camera1 = new Camera("Canon", 48, 10.5, "DSLR", 50000);
        Camera camera2 = new Camera("Sony", 64, 12.0, "Mirrorless", 70000);
        Camera camera3 = new Camera("Canon", 48, 8.0, "DSLR", 45000);
        boolean isSame = camera1.equals(camera2);
        System.out.println("Camera is same: " + isSame);
        boolean same = camera1.equals(camera3);
        System.out.println("Camera is same: " + same);
    }
}