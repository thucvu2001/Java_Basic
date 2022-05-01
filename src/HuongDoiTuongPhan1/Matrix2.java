package HuongDoiTuongPhan1;

import java.util.Scanner;

public class Matrix2 {
    private int n, m;
    private int[][] matran;

    public Matrix2(int n, int m) {
        this.n = n;
        this.m = m;
        this.matran = new int[n][m];
    }

    public void nextMatrix(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matran[i][j] = sc.nextInt();
            }
        }
    }

    public Matrix2 mul(Matrix2 b) {
        Matrix2 res = new Matrix2(this.n, b.m);
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

    public Matrix2 trans() {
        Matrix2 transpose = new Matrix2(this.m, this.n);
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
        Matrix2 a = new Matrix2(n, m);
        a.nextMatrix(sc);
        Matrix2 b = a.trans();
        System.out.println(a.mul(b));
    }
}
