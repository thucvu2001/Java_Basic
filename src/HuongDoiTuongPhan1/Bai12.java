package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Bai12 {
    private String maThiSinh;
    private String ten;
    private double diemToan;
    private double diemLy;
    private double diemHoa;

    public Bai12(String maThiSinh, String ten, double diemToan, double diemLy, double diemHoa) {
        this.maThiSinh = maThiSinh;
        this.ten = ten;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    @Override
    public String toString() {
        String ketQua;
        double tongDiem = diemToan + diemLy + diemHoa;
        if (maThiSinh.charAt(2) == '1') {
            tongDiem += 0.5;
        } else if (maThiSinh.charAt(2) == '2') {
            tongDiem += 1.0;
        } else {
            tongDiem += 2.5;
        }
        if (tongDiem < 24) {
            ketQua = "TRUOT";
        } else {
            ketQua = "TRUNG TUYEN";
        }
        String diemTong = String.format("%.1f", tongDiem);
        StringBuilder sb = new StringBuilder(diemTong);
        if(sb.charAt(3) == '0'){
            sb.deleteCharAt(3);
            sb.deleteCharAt(2);
        }
        sb.toString();
        String tmp = maThiSinh + " " + ten + " " + this.maThiSinh.charAt(2) + " " + sb + " " + ketQua;
        return tmp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ma = sc.nextLine();
        String ten = sc.nextLine();
        double diemToan = sc.nextDouble();
        double diemLy = sc.nextDouble();
        double diemHoa = sc.nextDouble();
        Bai12 tuyenSinh = new Bai12(ma, ten, diemToan, diemLy, diemHoa);
        System.out.println(tuyenSinh);
    }
}
