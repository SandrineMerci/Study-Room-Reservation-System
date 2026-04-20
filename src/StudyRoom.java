public class StudyRoom {
    private String roomCode;
    private int capacity;
    private boolean isAvailable;

    public StudyRoom(String roomCode, int capacity) {
        this.roomCode = roomCode;
        this.capacity = capacity;
        this.isAvailable = true;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void reserveRoom() {
        if (isAvailable) {
            isAvailable = false;
        } else {
            System.out.println("Room already reserved!");
        }
    }
}