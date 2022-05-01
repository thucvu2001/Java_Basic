// Cho một xâu là tên người chỉ bao gồm các kí tự là chữ cái và dấu cách, giữa các từ trong câu có thể tồn tại nhiều dấu cách hãy chuẩn hóa tên người bằng cách viết hoa chữ cái đầu tiên của từng từ và viết thường các chữ cái còn lại. Xâu tiếp theo là ngày sinh của người này, bao gồm ngày tháng năm phân cách nhau bằng dấu '/', hãy chuẩn hóa ngày sinh của người này về đúng dạng dd/mm/yyyy.
package String;

import java.util.*;

public class Bai16 {
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
        String t = sc.nextLine();
        s = s.toLowerCase();
        String[] a = s.split("\\s+");
        for (int i = 0; i < a.length; i++) {
            System.out.print(chuanHoa(a[i]) + " ");
        }
        System.out.println();
        if(t.charAt(2) != '/'){
            t = "0" + t;
        }
        StringBuilder sb = new StringBuilder(t);
        if(sb.charAt(5) != '/'){
            sb.insert(3, '0');
        }
        System.out.println(sb.toString());
    }
}
