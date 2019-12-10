import java.util.ArrayList;

public class Teacher {
    private String name;
    private String lastName;
    private ArrayList<Course> instructingCourses;

    public Teacher(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
        this.instructingCourses = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Course> getInstructingCourses() {
        return instructingCourses;
    }

    public void instructNewCourse(Course newCourse) {
        this.instructingCourses.add(newCourse);
    }

    public void resetCourses() {
        this.instructingCourses = new ArrayList<>();
    }

    public void grade(Course course, int studentID, int grade) {
        for (Course targetCourse : this.instructingCourses) {
            if (course == targetCourse) {
                course.updateGrade(studentID, grade);
            }
        }
    }

}
