public class AssignmentTwo {

    public static void main(String[] args) {
        partThree();
        partFourA();
        partFourB();
        partFive();
        partSix();
        partSeven();
    }

    private static Ride createRideWithVisitors(String rideName, int numVisitors) {
        Ride ride = new Ride(rideName);
        for (int i = 1; i <= numVisitors; i++) {
            ride.addVisitorToQueue(new Visitor("visitor" + i));
        }
        return ride;
    }

    public static void partThree() {
        Ride rollerCoaster = createRideWithVisitors("roller coaster", 5);
        rollerCoaster.removeVisitorFromQueue();
        rollerCoaster.printQueue();
    }

    public static void partFourA() {
        Ride merryGoRound = createRideWithVisitors("merry-go-round", 5);
        Visitor visitorToCheck = new Visitor("visitor3");
        boolean exists = merryGoRound.checkVisitorFromHistory(visitorToCheck);
        System.out.println("Is visitor3 in the history records? " + exists);
        int numVisitors = merryGoRound.numberOfVisitors();
        System.out.println("Number of visitors in the history records: " + numVisitors);
        merryGoRound.printRideHistory();
    }

    public static void partFourB() {
        Ride ferrisWheel = createRideWithVisitors("ferris wheel", 5);
        System.out.println("Before sorting:");
        ferrisWheel.printRideHistory();
        ferrisWheel.sortRideHistory();
        System.out.println("After sorting:");
        ferrisWheel.printRideHistory();
    }

    public static void partFive() {
        Ride pirateShip = createRideWithVisitors("Pirate Ship", 10);
        System.out.println("before run:");
        pirateShip.printQueue();
        pirateShip.runOneCycle();
        System.out.println("after run:");
        pirateShip.printQueue();
        pirateShip.printRideHistory();
    }

    public static void partSix() {
        Ride riverRapidsRide = createRideWithVisitors("River Rapids Ride", 5);
        riverRapidsRide.exportRideHistory("export.csv");
    }

    public static void partSeven() {
        Ride teacupRide = new Ride("teacup ride");
        teacupRide.importRideHistory("export.csv");
        int numVisitors = teacupRide.numberOfVisitors();
        System.out.println("Number of visitors in the history records: " + numVisitors);
        teacupRide.printRideHistory();
    }
}
