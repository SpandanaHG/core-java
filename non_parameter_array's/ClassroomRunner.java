class ClassroomRunner {
	
    public static void main(String... args) 
	{

        Duster duster1 = new Duster("Cotton", 10, DustType.DRY);
        duster1.color = "White";
        duster1.washable = true;

        Duster duster2 = new Duster("Foam", 12, DustType.WET);
        duster2.color = "Blue";
        duster2.washable = true;

        Duster duster3 = new Duster("Fiber", 15, DustType.MIXED);
        duster3.color = "Grey";
        duster3.washable = false;

        Duster[] dusters = {duster1, duster2, duster3};

        Classroom classroom = new Classroom(101, 2, dusters);
        classroom.block = "A";
        classroom.hasProjector = true;

        classroom.display();
    }
}