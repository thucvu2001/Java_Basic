package StringCoBan;

import java.util.StringTokenizer;

public class ViDuStringTokenizer {
    public static void main(String[] args) {
        String s = "nguyen van nam";
        String t = "nguyen nhat nam";
        String u = "nguyen/tat/thanh";
        StringTokenizer st = new StringTokenizer(s); // dung de tach cac tu trong xau
        StringTokenizer st1 = new StringTokenizer(t);
        StringTokenizer st2 = new StringTokenizer(u, "/"); // tach theo dau '/'
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
        while (st1.hasMoreElements()) {
            System.out.println(st1.nextElement());
        }
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }
    }
}
