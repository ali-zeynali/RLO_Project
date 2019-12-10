import java.util.ArrayList;
import java.util.HashMap;

public class Course {
    private String title;
    private Teacher teacher;
    private ArrayList<Student> students;
    private ArrayList<StudentGrade> studentGrades;

    public Course(String title) {
        this.title = title;
        this.teacher = null;
        this.students = new ArrayList<>();
        this.studentGrades = new ArrayList<>();
    }

    public Course(String title, Teacher teacher) {
        this.title = title;
        this.teacher = teacher;
        this.students = new ArrayList<>();
        this.studentGrades = new ArrayList<>();

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
        StudentGrade studentGrade = new StudentGrade(newStudent, 0);
        this.studentGrades.add(studentGrade);
    }

    public Student findStudent(int studentID) {
        for (Student student : this.students) {
            if (student.getID() == studentID) {
                return student;
            }
        }
        return null;
    }

    public int getStudentGradeByObject(Student student) {
        // TODO 1: return grade of student object enrolled in this course,
        // If no such student in this course, return -1

        for (StudentGrade studentGrade : this.studentGrades) {
            if (studentGrade.getStudent() == student) {
                return studentGrade.getGrade();
            }
        }

        return -1;
    }

    public int getStudentGradeByID(int studentID) {
        /*
        TODO 2: give grade of student having studentID, you can use findStudent method
        If there is no such student, return -1
         */
        Student student = this.findStudent(studentID);
        return this.getStudentGradeByObject(student);
    }

    public void updateGrade(int studentID, int newGrade) {
        /*
        TODO 3: update grade of student having studentID to the newGrade
         */
    }

}
