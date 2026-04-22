public class Booking {

    private Student student;
    private StudyRoom studyRoom;
    private String timeSlot;

    public Booking(Student student, StudyRoom studyRoom, String timeSlot) {
        this.student = student;
        this.studyRoom = studyRoom;
        this.timeSlot = timeSlot;
    }

    public void confirmBooking() {

        try {
            studyRoom.addStudent(student);

            studyRoom.addBooking(this);              // list
            studyRoom.addBooking(timeSlot, this);    // map

            System.out.println("\n BOOKING CONFIRMED");
            System.out.println("Student: " + student.name);
            System.out.println("Room: " + studyRoom.getRoomCode());
            System.out.println("Time: " + timeSlot);
            System.out.println("Capacity: " +
                    studyRoom.getCurrentStudents() + "/" + studyRoom.getCapacity());

        } catch (RoomFullException e) {
            System.out.println("\n BOOKING FAILED");
            System.out.println(e.getMessage());
        }
    }
}