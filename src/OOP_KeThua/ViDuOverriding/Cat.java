package OOP_KeThua.ViDuOverriding;

public class Cat extends Animal {
    public Cat() {
        super("Cat");
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Con mèo đang ăn cá");
    }

    @Override
    public void makeSound() {
        System.out.println("Con mèo kêu meo meo.");
    }
}
