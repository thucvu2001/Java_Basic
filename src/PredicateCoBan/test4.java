package PredicateCoBan;

import java.util.Arrays;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class test4 {
    public static void main(String[] args) {
        // Sử dụng Predicate với các lớp cho kiểu dữ liệu nguyên thủy (primitive type)

        System.out.print("IntPredicate: ");
        int[] intNumbers = { 3, 5, 6, 2, 1 };
        IntPredicate intPredicate = i -> i > 5;
        Arrays.stream(intNumbers).filter(intPredicate).forEach(System.out::println);

        System.out.print("\nLongPredicate: ");
        long[] longNumbers = { 3, 5, 6, 2, 1 };
        LongPredicate longPredicate = l -> l > 5;
        Arrays.stream(longNumbers).filter(longPredicate).forEach(System.out::println);

        System.out.print("\nDoublePredicate: ");
        double[] dbNumbers = { 3.2, 5.0, 6.3, 2.5, 1.0 };
        DoublePredicate dbPredicate = d -> d > 5;
        Arrays.stream(dbNumbers).filter(dbPredicate).forEach(System.out::println);
    }
}
