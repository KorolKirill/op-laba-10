import java.util.ArrayList;

public class Faculty {
    private final String name;
    private ArrayList<Student> students = new ArrayList<>();

    public Faculty(String name) {
        this.name = name;
    }

    public Faculty(String name, ArrayList<Student> students) {
        this.name = name;
        this.students = students;
    }
    public void add(Student student) {
        students.add(student);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }
    public int countStudents() {
        int quantity = 0;
        for (Student student: students) {
            quantity++;
        }
        return quantity;
    }


}
