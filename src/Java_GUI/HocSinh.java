package Java_GUI;

public class HocSinh {
    private String maSinhVien;
    private String hoTen;
    private String lop;
    private double gpa;

    public HocSinh(String maSinhVien, String hoTen, String lop, double gpa) {
        this.maSinhVien = maSinhVien;
        this.hoTen = hoTen;
        this.lop = lop;
        this.gpa = gpa;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getLop() {
        return lop;
    }

    public double getGpa() {
        return gpa;
    }
}
