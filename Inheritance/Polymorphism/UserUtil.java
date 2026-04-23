class UserUtil {

    public static void main(String... args) {

        System.out.println("instanceof and Casting");

        User user = new Admin(); 

        if (user instanceof Admin) {
            System.out.println("user is instance of Admin");
            Admin admin = (Admin) user;
            admin.manage();
        }
    }
}