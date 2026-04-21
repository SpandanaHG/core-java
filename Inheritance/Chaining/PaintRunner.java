class PaintRunner {

    public static void main(String... args) {

        Paint paint1 = new Paint("Asian Paints", "Blue", "Emulsion", 1200.0, 10);
		paint1.display();
		
        Paint paint2 = new Paint("Nerolac", "White", "Distemper", 800.0, 5);
        paint2.display();
    }
}