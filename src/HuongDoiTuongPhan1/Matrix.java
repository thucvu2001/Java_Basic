package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Matrix {
    private int n, m;
    private int[][] matran;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        matran = new int[n][m]; // khong khoi tao => nullPointerExeption
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matran[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix mul(Matrix b) { // nhan 2 ma tran
        Matrix res = new Matrix(this.n, b.m); // ma tran ket qua co n hang m cot
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < b.m; j++) {
                res.matran[i][j] = 0;
                for (int k = 0; k < this.m; k++) {
                    res.matran[i][j] += this.matran[i][k] * b.matran[k][j];
                }
            }
        }
        return res;
    }

    public Matrix trans() { // ma tran chuyen vi
        Matrix transpose = new Matrix(this.m, this.n);
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                transpose.matran[j][i] = this.matran[i][j];
            }
        }
        return transpose;
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0; i < this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                res += this.matran[i][j] + " ";
            }
            res += "\n";
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int p = sc.nextInt();
        Matrix a = new Matrix(n, m);
        a.nextMatrix(sc);
        Matrix b = new Matrix(m, p);
        b.nextMatrix(sc);
        System.out.println(a.mul(b));
    }
}
