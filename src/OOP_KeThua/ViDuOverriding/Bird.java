package OOP_KeThua.ViDuOverriding;

public class Bird extends Animal {
    public Bird() {
        super("Bird");
    }

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("Con chim đang ăn sâu");
    }

    @Override
    public void makeSound() {
        System.out.println("Con chim đang hot líu lo");
    }


}
