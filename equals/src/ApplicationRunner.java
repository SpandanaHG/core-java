public class ApplicationRunner {
    public static void main(String[] args)
    {
        Application app1 = new Application("WhatsApp", "Meta", 2.5, 5000000, "Communication");
        Application app2 = new Application("Instagram", "Meta", 3.0, 8000000, "Social Media");
        Application app3 = new Application("WhatsApp", "Meta", 2.8, 9000000, "Chatting");
        boolean isSame = app1.equals(app2);
        System.out.println("Application is same: " + isSame);
        boolean same = app1.equals(app3);
        System.out.println("Application is same: " + same);
    }
}
