import java.util.LinkedList;
import java.util.Queue;

/**
 * Manages booking requests in FIFO order.
 */
public class BookingRequestQueue {

    private Queue<Reservation> bookingQueue;

    public BookingRequestQueue() {
        bookingQueue = new LinkedList<>();
    }

    // Add a new booking request
    public void addRequest(Reservation reservation) {
        bookingQueue.offer(reservation);
        System.out.println("Added booking request: " + reservation);
    }

    // Get and remove the next booking request
    public Reservation getNextRequest() {
        return bookingQueue.poll();
    }

    // Check if there are pending requests
    public boolean hasPendingRequests() {
        return !bookingQueue.isEmpty();
    }

    // Get number of pending requests
    public int getPendingRequestCount() {
        return bookingQueue.size();
    }
}
