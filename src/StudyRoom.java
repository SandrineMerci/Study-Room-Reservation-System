import java.util.ArrayList;
import java.util.List;

public class StudyRoom {

    private String roomCode;
    private int capacity;

    private List<Student> students;
    private List<Booking> bookings;

    // time slots for each room
    private List<String> timeSlots;

    public StudyRoom(String roomCode, int capacity) {
        this.roomCode = roomCode;
        this.capacity = capacity;

        this.students = new ArrayList<>();
        this.bookings = new ArrayList<>();

        this.timeSlots = new ArrayList<>();
        timeSlots.add("08AM - 10AM");
        timeSlots.add("10AM - 12PM");
        timeSlots.add("02PM - 04PM");
        timeSlots.add("04PM - 06PM");
    }

    public String getRoomCode() {
        return roomCode;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getCurrentStudents() {
        return students.size();
    }

    public List<String> getTimeSlots() {
        return timeSlots;
    }

    public void addStudent(Student student) {

        if (students.size() >= capacity) {
            throw new RoomFullException("Room " + roomCode + " is full!");
        }

        students.add(student);
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
}