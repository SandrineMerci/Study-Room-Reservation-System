public class Booking {
    private StudyRoom studyRoom;
    private Student student;
    private String timeSlot;

    public Booking(Student student, StudyRoom studyRoom, String timeSlot) {
        this.student = student;
        this.studyRoom = studyRoom;
        this.timeSlot = timeSlot;
    }

    public void confirmBooking() {

        try {
            studyRoom.addStudent(student);

            System.out.println("Booking successful for " + student.name);
            System.out.println("Room: " + studyRoom.getRoomCode());
            System.out.println("Time: " + timeSlot);
            System.out.println("Students: " +
                    studyRoom.getCurrentStudents() + "/" + studyRoom.getCapacity());

        } catch (RoomFullException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input: " + e.getMessage());
        }
    }
}