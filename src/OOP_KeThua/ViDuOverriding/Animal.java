package OOP_KeThua.ViDuOverriding;

public class Animal {
    protected String name;

    public Animal() {

    }

    public Animal(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Đang ăn ...");
    }

    public void makeSound() {
        System.out.println("Đang .....");
    }

    public void sleep() {
        System.out.println("ZzzzzzZ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
