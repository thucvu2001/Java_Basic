package OOP_KeThua.ViDuVeAbstractClass.ViDu1;

public class HinhChuNhat extends Hinh {
    private int chieuDai;
    private int chieuRong;

    public HinhChuNhat() {
        super();
    }

    public HinhChuNhat(int x, int y, int chieuDai, int chieuRong) {
        super(x, y);
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    public double tinhDienTich() {
        return this.chieuRong * this.chieuDai;
    }

    public int getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public int getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
}
