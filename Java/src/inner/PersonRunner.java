package inner;

import outer.Name;

public class PersonRunner {
    public static void main(String... values){
        Student student = new Student();
        student.display();
        Name name = new Name();
        name.display();

    }
}
