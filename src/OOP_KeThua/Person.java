package OOP_KeThua;

public class Person {
    private String name;
    private String birth;
    private String address;

    public Person() {
        System.out.println("Default constructor of Person class");
    }

    public Person(String name, String birth, String address) {
        this.name = name;
        this.birth = birth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return this.name + " " + this.birth + " " + this.address;
    }
}
