public class IceCreamRunner
{
    public static void main(String[] args)
    {
        IceCream iceCream1 = new IceCream("Chocolate", "Arun", 120.0, "Large", false);
        IceCream iceCream2 = new IceCream("Vanilla", "Amul", 90.0, "Medium", true);
        IceCream iceCream3 = new IceCream("Chocolate", "Arun", 150.0, "Small", false);
        boolean isSame = iceCream1.equals(iceCream2);
        System.out.println("IceCream is same: " + isSame);
        boolean same = iceCream1.equals(iceCream3);
        System.out.println("IceCream is same: " + same);
    }
}