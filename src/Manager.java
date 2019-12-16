import java.util.ArrayList;

public class Manager {
    /*
    Manager should know lowest detail information about Teacher, Students and Courses
     */
    private ArrayList<Teacher> teachers;
    private ArrayList<Course> courses;

    public Manager() {
        this.teachers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        this.teachers.add(teacher);
    }

    public void removeTeacher(Teacher teacher) {
        this.teachers.remove(teacher);
    }


    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        this.courses.remove(course);
    }

    public double averageTeacherGrades(Teacher teacher) {
        /*
        TODO 4: return average grades that this teacher has given
         */
        double scores = 0.0;
        int num_students = 0;
        
        for (Course course: teacher.getInstructingCourses()) {
            ArrayList<StudentGrade> studentGrades = course.getStudentGrades();
            scores += averageCourseGrades(course) * studentGrades.size();
            num_students += studentGrades.size();
        }
        return scores / num_students;
    }

    public double averageCourseGrades(Course course) {
        /*
        TODO 5: average students' grade in this course
         */
        Arraylist<StudentGrade> studentGrades = course.getStudentGrades();
        if (studentGrades.size() == 0) {
            return 0;
        }
        else {
            double sum = 0;
            for (StudentGrade grade: studentGrades) {
                sum += grade.getGrade();
            }
            return sum / studentGrades.size();
        }
    }

}
