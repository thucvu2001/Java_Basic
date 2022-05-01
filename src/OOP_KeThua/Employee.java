package OOP_KeThua;

public class Employee extends Person{
    private double salary;

    public Employee() {
        System.out.println("Default constructor of Employee class");
    }

    public Employee(String name, String birth, String address, double salary) {
        super(name, birth, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + " " + String.format("%.1f", salary);
    }
}
