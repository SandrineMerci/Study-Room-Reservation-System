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
        if (studyRoom.isAvailable()) {
            studyRoom.reserveRoom();
            System.out.println("Booking confirmed for " + student.name +
                    " in room " + studyRoom.getRoomCode() +
                    " at " + timeSlot);
        } else {
            System.out.println("Booking failed: Room not available.");
        }
    }
}