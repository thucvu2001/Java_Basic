package StringCoBan;

public class ViDuStringBuilder {
    public static void main(String[] args) {
        // StringBuilder thường được sử dụng để xử lí xâu kí tự (String)
        StringBuilder sb = new StringBuilder();
        sb.append(5);
        sb.append("5");
        sb.append('t');
        sb.append("abcdef");
        System.out.println(sb.toString());
        sb.reverse(); // lật ngược
        System.out.println(sb.toString());
        sb.insert(3, "0"); // chèn kí tự hoặc xâu vào chỉ số
        sb.deleteCharAt(4); // xoá kí tự tại chỉ số
        sb.toString(); // chuyển StringBuilder thành String
    }
}
