import java.util.ArrayList;

class Student {
    private String name;
    private String lastName;
    private int ID;
    private ArrayList<Course> takenCourses;

    public Student(String name, String lastName, int ID){
        this.name = name;
        this.lastName = lastName;
        this.ID = ID;
        this.takenCourses = new ArrayList<>();
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public ArrayList<Course> getTakenCourses() {
        return takenCourses;
    }

    public void addCourse(Course newCourse) {
        this.takenCourses.add(newCourse);
    }
    public void resetCourses(){
        this.takenCourses = new ArrayList<>();
    }
}
