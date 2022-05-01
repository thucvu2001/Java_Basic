package OOP_Basic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person nguoi1 = new Person("vu van thuc", "31052001", 3.6);
        Person nguoi2 = new Person("VU VAN THUC", "31052001", 2.5);
        System.out.println(nguoi1.soSanh(nguoi2));
    }
}
