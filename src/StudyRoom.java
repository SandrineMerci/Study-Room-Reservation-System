import java.util.ArrayList;

    public class StudyRoom {
        private String roomCode;
        private int capacity;
        private ArrayList<Student> students;

        public StudyRoom(String roomCode, int capacity) {
            this.roomCode = roomCode;
            this.capacity = capacity;
            this.students = new ArrayList<>();
        }

        public String getRoomCode() {
            return roomCode;
        }

        public int getCapacity() {
            return capacity;
        }

        public int getCurrentStudents() {
            return students.size();
        }

        public boolean addStudent(Student student) {
            if (students.size() < capacity) {
                students.add(student);
                return true;
            } else {
                return false;
            }
        }
    }