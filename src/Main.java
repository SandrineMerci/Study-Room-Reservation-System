public class Main {
    public static void main(String[] args) {

        StudyRoom room = new StudyRoom("SR101", 2);

        Student s1 = new Student("Sando", "S001");
        Student s2 = new Student("Alice", "S002");
        Student s3 = new Student("John", "S003");

        Admin admin = new Admin("Manager", "A001");

        admin.manageBooking(new Booking(s1, room, "10AM - 12PM"));
        admin.manageBooking(new Booking(s2, room, "10AM - 12PM"));
        admin.manageBooking(new Booking(s3, room, "10AM - 12PM"));
    }
}