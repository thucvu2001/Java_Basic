package MangDoiTuongPhan1;

import java.util.Scanner;

public class Bai3 {
    public static String chuanHoa(String ngaySinh) {
        StringBuilder sb = new StringBuilder(ngaySinh);
        if (sb.charAt(1) == '/') {
            sb.insert(0, "0");
        }
        if (sb.charAt(4) == '/') {
            sb.insert(3, "0");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] arr = new Student[n];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String ngaySinh = sc.nextLine();
            double gpa = sc.nextDouble();
            arr[i] = new Student(i + 1, ten, chuanHoa(ngaySinh), lop, gpa);
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
