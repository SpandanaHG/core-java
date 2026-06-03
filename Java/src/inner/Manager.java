package inner;

public class Manager extends Employee {

    @Override
    public void display() {
        super.display();
        System.out.println("Display method in Manager");
    }

}
