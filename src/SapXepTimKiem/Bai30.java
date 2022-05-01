//Vanya đi bộ vào ban đêm dọc theo một con đường thẳng dài có độ dài l, được thắp sáng bởi n chiếc đèn lồng. Xét hệ trục tọa độ với điểm đầu của đường phố tương ứng với điểm 0 và điểm cuối của nó tương ứng với điểm l. Khi đó đèn lồng thứ i ở điểm ai. Đèn lồng chiếu sáng tất cả các điểm trên đường phố cách nó nhiều nhất là d, trong đó d là một số dương, chung cho tất cả các đèn lồng. Vanya tự hỏi: bán kính ánh sáng tối thiểu d mà những chiếc đèn lồng phải có để thắp sáng cả con phố?
package SapXepTimKiem;

import java.util.Arrays;
import java.util.Scanner;

public class Bai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        double ans = (double) Math.max(a[0], l - a[n - 1]);
        for (int i = 1; i < n; i++) {
            ans = Math.max((double) (a[i] - a[i - 1]) / 2, ans);
        }
        System.out.printf("%.10f", ans);
    }
}
