package InterfaceCoBan.ViDu3InterfaceLongNhau;

interface animal {
    interface dog {
        void drink();
    }
}

class BabyDog implements animal.dog {
    @Override
    public void drink() {
        System.out.println("Drinking");
    }
}

public class Main {
    public static void main(String[] args) {
        BabyDog dog = new BabyDog();
        dog.drink();
    }
}
