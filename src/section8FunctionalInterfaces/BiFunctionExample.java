package section8FunctionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> multiply = (x, y) -> x * y;

        Function<Integer, Integer> addFive = (value) -> value + 1;

        System.out.println(multiply.apply(4, 5));
        System.out.println(multiply.andThen(addFive).apply(4,5));

        BiFunction<String, String, String> fullName = (name, familyName) -> name + " " + familyName;
        Function<String, String> upperCase = (name) -> name.toUpperCase();

        System.out.println(fullName.apply("zakaria", "jouahri"));
        System.out.println(fullName.andThen(upperCase).apply("zakaria", "jouahri"));

    }
}
