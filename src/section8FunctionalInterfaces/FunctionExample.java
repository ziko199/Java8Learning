package section8FunctionalInterfaces;

import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        Function<Integer, Integer> multiplyBy10 = (value) -> value * 10;
        Function<Integer, Integer> addFive = (value) -> value + 1;

        System.out.println(multiplyBy10.apply(4)); // 4 * 10 = 40
        System.out.println(multiplyBy10.andThen(addFive).apply(4)); // 4 * 10 = 40 + 1 = 41
        System.out.println(multiplyBy10.compose(addFive).apply(4)); // 4 + 1 = 5 * 10 = 50

        Function<String, String> upperCase = (name) -> name.toUpperCase();
        Function<String, String> addString = (name) -> name + " test";

        System.out.println(upperCase.apply("Java 8"));
        System.out.println(upperCase.andThen(addString).apply("Java 8"));
        System.out.println(upperCase.compose(addString).apply("Java 8"));
    }
}
