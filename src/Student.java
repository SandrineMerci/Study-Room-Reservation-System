public class Student extends Person {

    public Student(String name, String id) {
        super(name, id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Student: " + name + ", ID: " + id);
    }


    public Booking requestBooking(StudyRoom room, String timeSlot) {
        return new Booking(this, room, timeSlot);
    }
}