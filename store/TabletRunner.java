class TabletRunner {

    public static void main(String[] args) {

        Tablet tablet = new Tablet();

        tablet.insertTablet("Paracetamol");
        tablet.insertTablet("Aspirin");
        tablet.insertTablet("Dolo");
        tablet.insertTablet("Crocin");
        tablet.insertTablet("Ibuprofen");

        tablet.checkTablet("Dolo");     
        tablet.checkTablet("VitaminC"); 
    }
}