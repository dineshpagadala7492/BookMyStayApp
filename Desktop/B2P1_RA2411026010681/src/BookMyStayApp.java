public class BookMyStayApp {

    public static void main(String[] args) {

        BookingManager manager = new BookingManager();

        manager.addRoom(101);
        manager.addRoom(102);

        manager.requestBooking("Dinesh", 101);
        manager.requestBooking("Rahul", 101);

        manager.processBooking();
        manager.processBooking();
    }
}