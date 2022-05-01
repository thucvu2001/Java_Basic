// Cho một xâu là tên người chỉ bao gồm các kí tự là chữ cái và dấu cách, giữa các từ trong câu có thể tồn tại nhiều dấu cách hãy chuẩn hóa tên người theo 2 mẫu được yêu cầu trước. Xem output để rõ hơn về cách chuẩn hóa.
package String;

import java.util.*;
import java.math.*;
import java.io.*;
import java.lang.*;

public class Bai17 {
    public static String chuanHoa(String s) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if (i == 0) {
                sb.append(Character.toUpperCase(s.charAt(i)));
            } else {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] a = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            if (i == a.length - 1) {
                System.out.print(a[i].toUpperCase());
            } else {
                System.out.print(chuanHoa(a[i]));
                if (i == a.length - 2) {
                    System.out.print(", ");
                } else {
                    System.out.print(" ");
                }
            }
        }
        System.out.println();
        System.out.print(a[a.length - 1].toUpperCase() + ", ");
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(chuanHoa(a[i]));
            if(i != a.length - 2){
                System.out.print(" ");
            }
        }
    }
}
