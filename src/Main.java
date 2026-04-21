public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Sando", "S001");
        Student s2 = new Student("Alice", "S002");
        Student s3 = new Student("John", "S003");
        Student s4 = new Student("Emma", "S004");
        Student s5 = new Student("Mike", "S005");

        StudyRoom room1 = new StudyRoom("SR101", 4);

        Admin admin = new Admin("Manager", "A001");

        admin.manageBooking(new Booking(s1, room1, "10AM - 12PM"));
        admin.manageBooking(new Booking(s2, room1, "10AM - 12PM"));
        admin.manageBooking(new Booking(s3, room1, "10AM - 12PM"));
        admin.manageBooking(new Booking(s4, room1, "10AM - 12PM"));
        admin.manageBooking(new Booking(s5, room1, "10AM - 12PM")); // should fail
    }
}