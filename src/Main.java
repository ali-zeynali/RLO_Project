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

    }
}
