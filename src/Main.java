import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FileManager.readBookings();
        Scanner sc = new Scanner(System.in);

        Admin admin = new Admin("Manager", "A001");

        List<StudyRoom> rooms = new ArrayList<>();
        rooms.add(new StudyRoom("SR101", 2));
        rooms.add(new StudyRoom("SR102", 3));

        while (true) {

            System.out.println("\n===== STUDY ROOM RESERVATION SYSTEM =====");
            System.out.println("1. View Rooms & Book");
            System.out.println("2. Exit");

            System.out.print("Choose option: ");
            int option = sc.nextInt();
            sc.nextLine();

            if (option == 2) {
                System.out.println("Goodbye!");
                break;
            }

            System.out.println("\n===== AVAILABLE ROOMS =====");

            for (StudyRoom room : rooms) {
                System.out.println("Room: " + room.getRoomCode() +
                        " | Capacity: " + room.getCapacity() +
                        " | Current: " + room.getCurrentStudents());
            }

            System.out.print("\nEnter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter ID: ");
            String id = sc.nextLine();

            Student student = new Student(name, id);

            System.out.print("Enter Room Code: ");
            String roomCode = sc.nextLine();

            StudyRoom selectedRoom = null;

            for (StudyRoom room : rooms) {
                if (room.getRoomCode().equals(roomCode)) {
                    selectedRoom = room;
                    break;
                }
            }

            if (selectedRoom == null) {
                System.out.println("Room not found!");
                continue;
            }

            System.out.println("\n===== TIME SLOTS =====");

            List<String> slots = selectedRoom.getTimeSlots();

            for (int i = 0; i < slots.size(); i++) {
                System.out.println((i + 1) + ". " + slots.get(i));
            }

            System.out.println((slots.size() + 1) + ". Cancel");

            System.out.print("Choose time slot: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == slots.size() + 1) {
                System.out.println("Booking cancelled.");
                continue;
            }

            if (choice < 1 || choice > slots.size()) {
                System.out.println("Invalid choice!");
                continue;
            }

            String selectedTime = slots.get(choice - 1);

            if (selectedRoom.getBookingByTime(selectedTime).size() >= selectedRoom.getCapacity()) {
                System.out.println(" This time slot is full!");
                continue;
            }

            Booking booking = student.requestBooking(selectedRoom, selectedTime);

            admin.manageBooking(booking);
        }
    }
}