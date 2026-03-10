/**
 * Book My Stay App - Use Case 2
 * Demonstrates room initialization using inheritance and abstraction.
 *
 * Version: 2.1
 */
public class UseCase2RoomInitialization {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App (Version 2.1) =====");

        // Create room objects
        Room single = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suite = new SuiteRoom();

        // Static availability variables
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        System.out.println("\nSingle Room Details:");
        single.displayRoomDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println("\nDouble Room Details:");
        doubleRoom.displayRoomDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println("\nSuite Room Details:");
        suite.displayRoomDetails();
        System.out.println("Available: " + suiteAvailable);
    }
}