package OOP_KeThua.ViDuOverriding;

public class Dog extends Animal {
    public Dog() {
        super("Dog");
    }

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Con chó đang ăn xương");
    }

    @Override
    public void makeSound() {
        System.out.println("Con chó đang sủa gâu gâu");
    }
}
