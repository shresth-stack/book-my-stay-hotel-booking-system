/**
 * Book My Stay App - Use Case 5
 * Demonstrates fair booking request handling using a queue.
 * Version: 5.0
 */
public class UseCase5BookingRequestQueue {

    public static void main(String[] args) {

        System.out.println("===== Book My Stay App (Version 5.0) =====");

        BookingRequestQueue requestQueue = new BookingRequestQueue();

        // Guests submit booking requests
        requestQueue.addRequest(new Reservation("Alice", "Single Room"));
        requestQueue.addRequest(new Reservation("Bob", "Suite Room"));
        requestQueue.addRequest(new Reservation("Charlie", "Double Room"));

        System.out.println("\nProcessing booking requests in arrival order:");

        // Process requests in FIFO order (no allocation here, just demonstration)
        while (requestQueue.hasPendingRequests()) {
            Reservation next = requestQueue.getNextRequest();
            System.out.println("Processing booking for: " + next.getGuestName() +
                    " requesting " + next.getRoomType());
        }
    }
}
