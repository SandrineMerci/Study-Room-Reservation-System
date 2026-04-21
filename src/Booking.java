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
        boolean added = studyRoom.addStudent(student);

        if (added) {
            System.out.println(student.name + " successfully booked room "
                    + studyRoom.getRoomCode() + " at " + timeSlot);

            System.out.println("Current students: "
                    + studyRoom.getCurrentStudents() + "/" + studyRoom.getCapacity());
        } else {
            System.out.println("Booking failed: Room is full!");
        }
    }
}