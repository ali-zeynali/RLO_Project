import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String title;
    private Teacher teacher;
    private ArrayList<Student> students;
    private HashMap<Student, Integer> grades;

    public Course(String title){
        this.title = title;
        this.teacher = null;
        this.students = new ArrayList<>();
        this.grades= new HashMap<>();
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
        this.grades.put(newStudent, null);
    }
    public int getStudentGrade(Student student){
        // TODO: give grade of student object

        return 0;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
