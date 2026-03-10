/**
 * SearchService provides read-only access to available rooms.
 */
import java.util.ArrayList;
import java.util.List;

public class SearchService {

    private RoomInventory inventory;
    private List<Room> roomTypes;

    public SearchService(RoomInventory inventory, List<Room> roomTypes) {
        this.inventory = inventory;
        this.roomTypes = roomTypes;
    }

    // Returns list of available rooms (availability > 0)
    public List<Room> searchAvailableRooms() {
        List<Room> availableRooms = new ArrayList<>();

        for (Room room : roomTypes) {
            int availableCount = inventory.getAvailability(room.roomType);
            if (availableCount > 0) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }
}