/**
 * Book My Stay App - Use Case 4
 * Room search and availability check without state mutation.
 * Version: 4.0
 */

import java.util.Arrays;
import java.util.List;

public class UseCase4RoomSearch {

    public static void main(String[] args) {
        System.out.println("===== Book My Stay App (Version 4.0) =====");

        // Initialize inventory and room objects (reuse from previous use cases)
        RoomInventory inventory = new RoomInventory();
        inventory.addRoomType("Single Room", 5);
        inventory.addRoomType("Double Room", 0);  // Simulating no availability
        inventory.addRoomType("Suite Room", 2);

        List<Room> rooms = Arrays.asList(
                new SingleRoom(),
                new DoubleRoom(),
                new SuiteRoom()
        );

        // Create search service
        SearchService searchService = new SearchService(inventory, rooms);

        // Perform search
        List<Room> availableRooms = searchService.searchAvailableRooms();

        // Display available rooms only
        System.out.println("\nAvailable Rooms:");
        for (Room room : availableRooms) {
            room.displayRoomDetails();
            System.out.println("----------------------");
        }
    }
}