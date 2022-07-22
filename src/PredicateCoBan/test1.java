package PredicateCoBan;

import java.util.function.Predicate;

public class test1 {
    public static void main(String[] args) {
        // Trong Java 8, Predicate<T> là một functional interface và do đó nó có thể được sử dụng
        // với lambda expression hoặc method reference cho một mục đích cụ thể nào đó.
        // Predicate<T> sẽ trả về giá trị true/false của một tham số kiểu T mà bạn đưa vào có
        // thỏa với điều kiện của Predicate đó hay không, cụ thể là điều kiện được viết trong phương thức test().

        // phương thức mặc định (default method) trong lớp Interface Predicate:
        // and()
        // or()
        // negate(): tuong duong voi not (phu dinh)

        // Vi du ve phuong thuc test
        // Predicate String
        Predicate<String> stringPredicate = s -> s.equals("gpcoder");
        System.out.println(stringPredicate.test("gpcoder")); //true
        System.out.println(stringPredicate.test("GP Coder")); // false
        // Predicar Integer
        Predicate<Integer> integerPredicate = i -> i > 0;
        System.out.println(integerPredicate.test(1));
        System.out.println(integerPredicate.test(-1));

        // Vi du ve and, or, negate
        // AND
        Predicate<String> predicateAnd = stringPredicate.and(s -> s.length() == 7);
        System.out.println(predicateAnd.test("gpcoder"));
        // OR
        Predicate<String> predicateOr = stringPredicate.or(s -> s.length() == 11);
        System.out.println(predicateOr.test("gpcoder"));
        // NEGATE
        Predicate<String> predicateNegate = stringPredicate.negate();
        System.out.println(predicateNegate.test("gpcoder"));
    }
}
