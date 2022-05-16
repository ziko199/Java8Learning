package section7Lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {
        //--------------------------- Java without Lambda --------------------------
        System.out.println("-------------- Java without Lambda ---------------");

        Comparator <Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0  -> o1 == o2
                                         // 1  -> o1 >  o2
                                         // -1 -> o1 <  o2
            }
        };
        System.out.println("Result of the comparator is : "
                + comparator.compare(3, 2));

        //--------------------------- Java 8 with Lambda --------------------------
        System.out.println("-------------- Java 8 with Lambda ---------------");

        Comparator<Integer> comparatorLambda = (Integer o1, Integer o2) -> {
            return o1.compareTo(o2);
        };

        System.out.println("Result of the comparator using lambda is : "
                + comparatorLambda.compare(3, 5));

        Comparator<Integer> comparatorLambda2 = (o1, o2) -> o1.compareTo(o2);

        System.out.println("Result of the comparator using lambda is : "
                + comparatorLambda2.compare(5, 5));
    }
}
