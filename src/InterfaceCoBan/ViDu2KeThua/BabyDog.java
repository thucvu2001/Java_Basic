package InterfaceCoBan.ViDu2KeThua;

public class BabyDog implements DogInterface {
    @Override
    public void eat() {
        System.out.println("Con cho dang an");
    }

    @Override
    public void sleep() {
        System.out.println("Con cho dang ngu");
    }

    @Override
    public void makeSound() {
        System.out.println("Con cho sua gau gau");
    }
}
