package InterfaceCoBan;

public class MainTest {
    public static void main(String[] args) {
        System.out.println("Test 1:");
        MayTinhCasioFX500Interface mfx500 = new MayTinhCasioFX500Interface();
        MayTinhVinaCal500Interface mvn500 = new MayTinhVinaCal500Interface();

        System.out.println("5 + 3 = " + mfx500.cong(5, 3));
        System.out.println("7 + 9 =  " + mvn500.cong(7, 9));
        System.out.println("5 : 0 =  " + mfx500.chia(5, 0));

        System.out.println("Test 2:");
        double[] arr = {5, 1, 4, 2, 6, 8, 7, 9};
        SapXepChen sapXepChen = new SapXepChen();
        SapXepChon sapXepChon = new SapXepChon();
        sapXepChen.sapXepGiam(arr);
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
        sapXepChon.sapXepTang(arr);
        for (double x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();

        System.out.println("Test 3:");
        double[] arr3 = {5, 1, 4, 2, 6, 8, 7, 9, 3, 10};
        PhanMemMayTinh pmmt = new PhanMemMayTinh();
        System.out.println("3 + 5 = " + pmmt.cong(3, 5));
        System.out.println("9 - 4 = " + pmmt.tru(9, 4));
        pmmt.sapXepTang(arr3);
        for (double x : arr3) {
            System.out.print(x + " ");
        }
        System.out.println();
        pmmt.sapXepGiam(arr3);
        for (double x : arr3) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
