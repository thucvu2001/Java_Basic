package OOP_KeThua.ViDuVeAbstractClass.ViDu1;

public abstract class Hinh {
    protected int x;
    protected int y;

    public Hinh() {

    }

    public Hinh(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double tinhDienTich();

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

