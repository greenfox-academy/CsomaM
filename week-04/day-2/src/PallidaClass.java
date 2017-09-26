import java.util.ArrayList;

public class PallidaClass {

    protected String className;
    protected ArrayList<Student> students;
    protected ArrayList<Mentor> mentors;

    public PallidaClass (String className) {
        this.className = className;
    }

    public void addStudent (Student student) {
        students.add(student);
    }

    public void addMentort (Mentor mentor) {
        mentors.add(mentor);
    }

    public void info() {
        System.out.println("Pallida " + className + " class has " + students.size() + " students and " + mentors.size() + " mentors.");
    }
}
