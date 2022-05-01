package String;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "python";
        int cnt = 0;
        boolean check = false;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == t.charAt(cnt)) {
                cnt ++;
            }
            if(cnt == 6){
                check = true;
                break;
            }
        }
        if(check){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
