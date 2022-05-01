package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bai22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String t = sc.nextLine().toLowerCase();
        String[] a = s.split("\\s+");
        String[] b = t.split("\\s+");
        Set<String> se1 = new TreeSet<>();
        Set<String> se2 = new TreeSet<>();
        for(String x : a){
            se1.add(x);
        }
        for(String x : b){
            se2.add(x);
        }
        for(String x : se1){
            if(!se2.contains(x)){
                System.out.print(x + " ");
            }
        }
    }
}
