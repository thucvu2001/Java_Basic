package OOP_KeThua;

public class Student extends Person {
    private String className;
    private double GPA;

    public Student() {
        System.out.println("Default constructor of Student class");
    }

    public Student(String name, String birth, String address, String className, double GPA) {
        //super(); // goi constructor default cua lop Person
        super(name, birth, address); // goi constructor day du tham so cua lop Person
        this.className = className;
        this.GPA = GPA;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return super.toString() + " " + this.className + " " + this.GPA;
    }
}
