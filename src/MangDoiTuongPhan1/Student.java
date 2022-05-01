package MangDoiTuongPhan1;

public class Student {
    private String maSinhVien;
    private String hoTen;
    private String ngaySinh;
    private String lop;
    private double gpa;

    // Ham khoi tao khong co tham so
    public Student() {
        maSinhVien = hoTen = ngaySinh = lop = "";
        gpa = 0;
    }
    public Student(int soThuTu, String hoTen, String ngaySinh, String lop, double gpa) {
        String ma = "";
        if (soThuTu < 10) {
            ma = "SV00" + soThuTu;
        } else {
            ma = "SV0" + soThuTu;
        }
        this.maSinhVien = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        String diem = String.format("%.02f", this.gpa);
        return this.maSinhVien + " " + this.hoTen + " " + this.lop + " " + this.ngaySinh + " " + diem;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
