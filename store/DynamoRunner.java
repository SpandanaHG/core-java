class DynamoRunner {

    public static void main(String[] args) {

        Dynamo d = new Dynamo();

        d.saveDynamo("AC Dynamo");
        d.saveDynamo("DC Dynamo");
        d.saveDynamo("Mini Dynamo");
        d.saveDynamo("Bike Dynamo");
        d.saveDynamo("Generator");

        d.searchDynamo("Bike Dynamo");
        d.searchDynamo("Solar");
    }
}