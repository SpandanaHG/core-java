class LiftRunner {

    public static void main(String[] args) {

        Lift lift = new Lift();

        lift.storeLift("Passenger Lift");
        lift.storeLift("Goods Lift");
        lift.storeLift("Hydraulic Lift");
        lift.storeLift("Capsule Lift");
        lift.storeLift("Hospital Lift");

        lift.findLift("Goods Lift");
        lift.findLift("Car Lift");
    }
}