/**
 * Book My Stay App - Use Case 3
 * Demonstrates centralized inventory management using HashMap.
 * Version: 3.1
 */
public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App (Version 3.1) =====");

        RoomInventory inventory = new RoomInventory();

        // Register rooms with initial availability
        inventory.addRoomType("Single Room", 5);
        inventory.addRoomType("Double Room", 3);
        inventory.addRoomType("Suite Room", 2);

        // Display current inventory
        inventory.displayInventory();

        // Update availability example
        inventory.updateAvailability("Single Room", 4);

        System.out.println("\nAfter booking one Single Room:");
        inventory.displayInventory();
    }
}