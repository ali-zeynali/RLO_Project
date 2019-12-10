public class Main {
    public static void main(String[] args) {
        /*
        Our TODO 0: create some Courses, Students, and Teachers and one Manager
        enroll students in some courses

         */

        Manager manager = new Manager();

        Student student1 = new Student("S1Name", "S1LName", 1);
        Student student2 = new Student("S2Name", "S2LName", 2);
        Student student3 = new Student("S3Name", "S3LName", 3);
        Student student4 = new Student("S4Name", "S4LName", 4);
        Student student5 = new Student("S5Name", "S5LName", 5);

        Teacher teacher1 = new Teacher("T1Name", "T1LName");
        Teacher teacher2 = new Teacher("T2Name", "T3LName");

        Course course1 = new Course("Course1");
        Course course2 = new Course("Course2", teacher2);

        manager.addCourse(course1);
        manager.addCourse(course2);
        manager.addTeacher(teacher1);
        manager.addTeacher(teacher2);

        course1.setTeacher(teacher1);

        student1.addCourse(course1);
        student2.addCourse(course1);
        student3.addCourse(course1);
        student4.addCourse(course1);

        student2.addCourse(course2);
        student4.addCourse(course2);
        student5.addCourse(course2);

        teacher1.grade(course1, 1, 10);
        teacher1.grade(course1, 2, 6);
        teacher1.grade(course1, 3, 8);
        teacher1.grade(course1, 4, 0);

        teacher2.grade(course2,2,10);
        teacher2.grade(course2,4, 9);
        teacher2.grade(course2,5,8);

        System.out.println("Student1 grade in course1, using its object:\t" + course1.getStudentGradeByObject(student1));
        System.out.println("Student5 grade in course2, using its ID:\t" + course2.getStudentGradebyID(5));

        System.out.println("Average grade given by Teacher1:\t" + manager.averageTeacherGrades(teacher1));
        System.out.println("Average grade given by Teacher2:\t" + manager.averageTeacherGrades(teacher2));

        System.out.println("Average grade in Course1:\t" + manager.averageCourseGrades(course1));
        System.out.println("Average grade in Course2:\t" + manager.averageCourseGrades(course2));





    }
}
