import java.io.*;
import java.util.List;

public class FileManager {

    private static final String FILE_NAME = "bookings.txt";


    public static void saveBooking(Booking booking) {

        try (BufferedWriter writer =
                     new BufferedWriter(new FileWriter(FILE_NAME, true))) {


            writer.write(
                    booking.getStudent().getName() + "," +
                            booking.getStudent().getId() + "," +
                            booking.getStudyRoom().getRoomCode() + "," +
                            booking.getTimeSlot()
            );

            writer.newLine();

        } catch (IOException e) {
            System.out.println("Error saving booking to file.");
        }
    }


    public static void readBookings() {

        try (BufferedReader reader =
                     new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            System.out.println("\n===== PREVIOUS BOOKINGS =====");

            while ((line = reader.readLine()) != null) {

                String[] data = line.split(",");

                System.out.println(
                        "Student: " + data[0] +
                                " | Room: " + data[2] +
                                " | Time: " + data[3]
                );
            }

        } catch (FileNotFoundException e) {
            System.out.println("No previous bookings found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}