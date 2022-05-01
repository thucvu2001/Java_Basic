package HuongDoiTuongPhan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bai16 {
    private int ngayBatDau;
    private int ngayKetThuc;

    public Bai16() {
    }

    public Bai16(int ngayBatDau, int ngayKetThuc) {
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Bai16> arr = new ArrayList<>();
        for(int i = 0; i < n ; i++){
            int batDau = sc.nextInt();
            int ketThuc = sc.nextInt();
            arr.add(new Bai16(batDau, ketThuc));
        }
        Collections.sort(arr, new Comparator<Bai16>() {
            @Override
            public int compare(Bai16 o1, Bai16 o2) {
                return o1.ngayKetThuc - o2.ngayKetThuc;
            }
        });
        int ans = 1, endTime = arr.get(0).ngayKetThuc;
        for(int i = 1; i < arr.size(); i++){
            if(arr.get(i).ngayBatDau > endTime){
                ans++;
                endTime = arr.get(i).ngayKetThuc;
            }
        }
        System.out.println(ans);
    }
}
