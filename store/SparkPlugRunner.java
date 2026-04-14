class SparkPlugRunner {

    public static void main(String[] args) {

        SparkPlug sparkPlug = new SparkPlug();

        sparkPlug.addPlug("Copper");
        sparkPlug.addPlug("Platinum");
        sparkPlug.addPlug("Iridium");
        sparkPlug.addPlug("Double Platinum");
        sparkPlug.addPlug("Racing Plug");

        sparkPlug.searchPlug("Iridium");
        sparkPlug.searchPlug("Normal Plug");
    }
}