package InterfaceCoBan.ViDu1;

public class Dog  implements  Animal{

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping");
    }
}
