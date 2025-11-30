public class AssignmentTwo {

    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
        assignment.partSix();
        assignment.partSeven();
    }

    public void partThree() {
        System.out.println("\n--- Part 3: Waiting Line ---");
        Employee operator = new Employee("John Doe", 30, "Male", "E001", "Operator");
        Ride ride = new Ride("Roller Coaster", "Thrill", operator, 2);

        Visitor v1 = new Visitor("Alice", 25, "Female", "V001", "Regular");
        Visitor v2 = new Visitor("Bob", 22, "Male", "V002", "VIP");
        Visitor v3 = new Visitor("Charlie", 28, "Male", "V003", "Regular");
        Visitor v4 = new Visitor("Diana", 24, "Female", "V004", "VIP");
        Visitor v5 = new Visitor("Eve", 26, "Female", "V005", "Regular");

        ride.addVisitorToQueue(v1);
        ride.addVisitorToQueue(v2);
        ride.addVisitorToQueue(v3);
        ride.addVisitorToQueue(v4);
        ride.addVisitorToQueue(v5);

        ride.removeVisitorFromQueue(v3); // Remove Charlie

        ride.printQueue();
    }

    public void partFourA() {
        System.out.println("\n--- Part 4A: Ride History ---");
        Employee operator = new Employee("Jane Smith", 28, "Female", "E002", "Operator");
        Ride ride = new Ride("Ferris Wheel", "Family", operator, 4);

        Visitor v1 = new Visitor("Frank", 30, "Male", "V006", "Regular");
        Visitor v2 = new Visitor("Grace", 29, "Female", "V007", "VIP");
        Visitor v3 = new Visitor("Hank", 31, "Male", "V008", "Regular");
        Visitor v4 = new Visitor("Ivy", 27, "Female", "V009", "VIP");
        Visitor v5 = new Visitor("Jack", 32, "Male", "V010", "Regular");

        ride.addVisitorToHistory(v1);
        ride.addVisitorToHistory(v2);
        ride.addVisitorToHistory(v3);
        ride.addVisitorToHistory(v4);
        ride.addVisitorToHistory(v5);

        ride.checkVisitorFromHistory(v3); // Check Hank
        System.out.println("Number of visitors in history: " + ride.numberOfVisitors());
        ride.printRideHistory();
    }

    public void partFourB() {
        System.out.println("\n--- Part 4B: Sorting Ride History ---");
        Employee operator = new Employee("Mike Brown", 35, "Male", "E003", "Operator");
        Ride ride = new Ride("Bumper Cars", "Family", operator, 5);

        // Adding in unsorted order
        ride.addVisitorToHistory(new Visitor("Zara", 22, "Female", "V011", "Regular"));
        ride.addVisitorToHistory(new Visitor("Xander", 25, "Male", "V012", "VIP"));
        ride.addVisitorToHistory(new Visitor("Yara", 23, "Female", "V013", "Regular"));
        ride.addVisitorToHistory(new Visitor("Adam", 28, "Male", "V014", "VIP"));
        ride.addVisitorToHistory(new Visitor("Ben", 24, "Male", "V015", "Regular"));

        System.out.println("Before sorting:");
        ride.printRideHistory();

        ride.sortRideHistory();

        System.out.println("After sorting:");
        ride.printRideHistory();
    }

    public void partFive() {
        System.out.println("\n--- Part 5: Run a Ride Cycle ---");
        Employee operator = new Employee("Sarah Connor", 40, "Female", "E004", "Operator");
        Ride ride = new Ride("Space Mountain", "Thrill", operator, 3); // Max 3 riders per cycle

        for (int i = 1; i <= 10; i++) {
            ride.addVisitorToQueue(new Visitor("Visitor" + i, 20 + i, "Male", "V10" + i, "Regular"));
        }

        System.out.println("Queue before run:");
        ride.printQueue();

        ride.runOneCycle(); // Should take 3 visitors

        System.out.println("Queue after run:");
        ride.printQueue();

        System.out.println("History after run:");
        ride.printRideHistory();
    }

    public void partSix() {
        System.out.println("\n--- Part 6: Writing to File ---");
        Employee operator = new Employee("Tom Hanks", 50, "Male", "E005", "Operator");
        Ride ride = new Ride("Log Flume", "Water", operator, 4);

        ride.addVisitorToHistory(new Visitor("Leo", 20, "Male", "V020", "Regular"));
        ride.addVisitorToHistory(new Visitor("Mia", 21, "Female", "V021", "VIP"));
        ride.addVisitorToHistory(new Visitor("Noa", 22, "Male", "V022", "Regular"));
        ride.addVisitorToHistory(new Visitor("Olivia", 23, "Female", "V023", "VIP"));
        ride.addVisitorToHistory(new Visitor("Paul", 24, "Male", "V024", "Regular"));

        ride.exportRideHistory("ride_history.csv");
    }

    public void partSeven() {
        System.out.println("\n--- Part 7: Reading from File ---");
        Employee operator = new Employee("Jerry Seinfeld", 55, "Male", "E006", "Operator");
        Ride ride = new Ride("Ghost Train", "Horror", operator, 2);

        ride.importRideHistory("ride_history.csv");

        System.out.println("Number of visitors imported: " + ride.numberOfVisitors());
        ride.printRideHistory();
    }
}
