import java.util.*;

public class BookingManager {

    Queue<Booking> bookingQueue = new LinkedList<>();
    Map<Integer, Room> rooms = new HashMap<>();

    // Add room
    public void addRoom(int roomNumber) {
        rooms.put(roomNumber, new Room(roomNumber));
    }

    // Request booking
    public void requestBooking(String customerName, int roomNumber) {
        bookingQueue.add(new Booking(customerName, roomNumber));
    }

    // Process booking
    public void processBooking() {

        if (bookingQueue.isEmpty()) {
            System.out.println("No booking requests.");
            return;
        }

        Booking booking = bookingQueue.poll();
        Room room = rooms.get(booking.roomNumber);

        if (room != null && !room.isBooked) {
            room.isBooked = true;
            System.out.println("Booking confirmed for " + booking.customerName);
        } else {
            System.out.println("Room already booked.");
        }
    }
}