package JavaBasic;

public class ViDuLopCharacter {
    public static void main(String[] args) {
        String s = "12345";
        String t = "abcde";
        String u = "ABCDE";

        Character.isDigit(s.charAt(0));
        Character.isLowerCase(t.charAt(0));
        Character.isUpperCase(u.charAt(0));
        Character.isAlphabetic(t.charAt(0)); // kiem tra co phai chữ
        Character.isAlphabetic(u.charAt(0));
        Character.toLowerCase(u.charAt(0)); // chuyển về in thường
        Character.toUpperCase(t.charAt(0)); // chuyển về in hoa

    }
}
