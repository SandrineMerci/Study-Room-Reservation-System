import java.util.ArrayList;

public class StudyRoom {
    private String roomCode;
    private int capacity;
    private ArrayList<Student> students;

    public StudyRoom(String roomCode, int capacity) {
        this.roomCode = roomCode;
        this.capacity = capacity;
        this.students = new ArrayList<>();
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

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null");
        }

        if (students.size() >= capacity) {
            throw new RoomFullException("Room " + roomCode + " is full!");
        }

        students.add(student);
    }
}