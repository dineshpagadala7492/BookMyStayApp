import java.util.*;

public class BookingManager {

    Map<Integer, Room> rooms = new HashMap<>();
    Queue<Booking> bookingQueue = new LinkedList<>();

    // Add room to system
    public void addRoom(int roomNumber) {
        rooms.put(roomNumber, new Room(roomNumber));
    }

    // User requests booking
    public void requestBooking(String userName, int roomNumber) {
        Booking booking = new Booking(userName, roomNumber);
        bookingQueue.add(booking);
        System.out.println("Booking request added for " + userName);
    }

    // Process booking requests (FIFO)
    public void processBooking() {

        if (bookingQueue.isEmpty()) {
            System.out.println("No booking requests.");
            return;
        }

        Booking booking = bookingQueue.poll();
        Room room = rooms.get(booking.roomNumber);

        if (room != null && !room.isBooked) {
            room.isBooked = true;
            System.out.println("Room " + booking.roomNumber + " booked for " + booking.userName);
        } else {
            System.out.println("Room not available for " + booking.userName);
        }
    }
}