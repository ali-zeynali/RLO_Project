import java.util.ArrayList;

public class Manager {
    /*
    Manager should know lowest detail information about Teacher, Students and Courses
     */
    private ArrayList<Teacher> teachers;

    public Manager() {
        this.teachers = new ArrayList<>();
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    /* TODO: we need a method to calculate average of grades in a specific course,

     */

    /* TODO: we need a method to calculate average of grades that a specific teacher has given,

     */

}
