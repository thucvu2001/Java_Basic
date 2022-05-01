package OOP_KeThua;

public class Teacher extends Employee{
    private String faculty;

    public Teacher() {
        System.out.println("Default constructor of Teacher class");
    }

    public Teacher(String name, String birth, String address, double salary, String faculty) {
        super(name, birth, address, salary);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.faculty;
    }
}
