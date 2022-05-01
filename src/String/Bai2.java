// Cho một xâu kí tự, hãy viết hoa và viết thường các kí tự là chữ cái trong xâu, các kí tự không phải là chữ cái thì không thay đổi.
package String;

import java.util.Locale;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = s.toLowerCase(Locale.forLanguageTag(s));
        String f = s.toUpperCase(Locale.forLanguageTag(s));
        System.out.println(f);
        System.out.println(t);
    }
}
