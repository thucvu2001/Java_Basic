// Có n vé xem hòa nhạc có sẵn, mỗi vé có một mức giá nhất định. Sau đó, m khách hàng lần lượt đến. Mỗi khách hàng thông báo mức giá tối đa mà họ sẵn sàng trả cho một vé và sau đó, họ sẽ nhận được một vé với mức giá gần nhất có thể sao cho không vượt quá mức giá tối đa.
package SapXepTimKiem;

import java.util.*;

public class Bai36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            list1.add(x);
        }
        for (int j = 0; j < m; j++) {
            int x = sc.nextInt();
            list2.add(x);
        }
        list1.sort(Collections.reverseOrder());
        for (Integer integer : list2) {
            int l = 0;
            boolean check = false;
            while (l < list1.size()) {
                if (list1.get(l) <= integer) {
                    check = true;
                    break;
                }
                ++l;
            }
            if (check) {
                System.out.println(list1.get(l));
                list1.remove(l);
            } else {
                System.out.println(-1);
            }
        }
    }
}
