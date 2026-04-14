class AeroplaneRunner {

    public static void main(String[] args) {

        Aeroplane a = new Aeroplane();

        a.addPlane("Boeing");
        a.addPlane("Airbus");
        a.addPlane("Cessna");
        a.addPlane("Embraer");
        a.addPlane("Concorde");

        a.searchPlane("Airbus");
        a.searchPlane("Jet");
    }
}