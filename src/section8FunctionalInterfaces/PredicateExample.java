package section8FunctionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> predicateExample1 = (i) -> {
        return i%2 == 0;
    };
    // simple lambda expression
    static Predicate<Integer> predicateExample2 = (i) -> i%2 == 0;
    static Predicate<Integer> predicateExample3 = (i) -> i%5 == 0;

    public static void predicateAnd() {
        System.out.println(predicateExample2.and(predicateExample3).test(20));
    }
    public static void predicateOr() {
        System.out.println(predicateExample2.or(predicateExample3).test(15));
    }
    public static void predicateNegate() {
        System.out.println(predicateExample2.negate().test(15));
    }

    public static void main(String[] args) {

        System.out.println(predicateExample1.test(32));
        System.out.println(predicateExample2.test(3));

        predicateAnd();
        predicateOr();
        predicateNegate();

    }
}
