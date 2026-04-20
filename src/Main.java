public class Main {

    public static void main(String[] args) {

        Student s1 = new Student("Sando", "S001");
        Student s2= new Student("Alice","S002");
        StudyRoom room1 = new StudyRoom("SR101", 4);
        StudyRoom room2=new StudyRoom("SR102",5);

        Booking booking = s1.requestBooking(room1, "10AM - 12PM");
        Booking booking1 = s2.requestBooking(room2,"14PM - 16PM");

        booking.confirmBooking();
        booking1.confirmBooking();
    }
}