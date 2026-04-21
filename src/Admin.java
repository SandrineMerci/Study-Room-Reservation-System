public class Admin extends Person {

    public Admin(String name, String id) {
        super(name, id);
    }

    @Override
    public void displayInfo() {
        System.out.println("Admin: " + name);
    }

    public void manageBooking(Booking booking) {
        booking.confirmBooking();
    }
}