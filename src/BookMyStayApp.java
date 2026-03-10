import java.util.Scanner;

public class BookMyStayApp {

    public static void main(String[] args) {

        BookingManager manager = new BookingManager();
        Scanner scanner = new Scanner(System.in);

        // Add rooms
        manager.addRoom(101);
        manager.addRoom(102);
        manager.addRoom(103);

        while (true) {

            System.out.println("\n--- Book My Stay ---");
            System.out.println("1. Request Booking");
            System.out.println("2. Process Booking");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {

                System.out.print("Enter user name: ");
                String name = scanner.nextLine();

                System.out.print("Enter room number: ");
                int room = scanner.nextInt();

                manager.requestBooking(name, room);

            }
            else if (choice == 2) {

                manager.processBooking();

            }
            else if (choice == 3) {

                System.out.println("Exiting system...");
                break;

            }
            else {

                System.out.println("Invalid choice");

            }
        }

        scanner.close();
    }
}