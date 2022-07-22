package PredicateCoBan;

import java.util.function.Predicate;

public class test2 {
    public static void main(String[] args) {
        // Kết hợp nhiều Predicate
        // Creating predicate
        Predicate<Integer> greaterThanTen = (i) -> i > 10;
        Predicate<Integer> lessThanTwenty = (i) -> i < 20;

        // Calling Predicate Chaining
        boolean result = greaterThanTen.and(lessThanTwenty).test(15);
        System.out.println(result); // true

        // Calling Predicate method
        boolean result2 = greaterThanTen.and(lessThanTwenty).negate().test(15);
        System.out.println(result2); // false
    }
}
