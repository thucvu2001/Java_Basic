package OOP_KeThua.ViDuVeAbstractClass.ViDu1;

public class HinhTron extends Hinh {
    private int banKinh;

    public HinhTron() {

    }

    public HinhTron(int x, int y, int banKinh) {
        super(x, y);
        this.banKinh = banKinh;
    }

    @Override
    public double tinhDienTich() {
        return Math.PI * this.banKinh * this.banKinh;
    }

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }
}
