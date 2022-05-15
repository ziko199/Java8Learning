package firstExamples;

import java.util.stream.IntStream;

public class imperativeVsDeclarativeExample1 {

    public static void main(String[] args) {
        // Imperative style
        System.out.println("-----Imperative style------");
        int sum = 0;
        for(int i=0; i<= 100; i++) {
            sum+=i;
        }
        System.out.println("Sum using Approach : " + sum);

        // Declarative style
        System.out.println("-----Declarative style------");
        int sum1 = IntStream.rangeClosed(0,100)
                .sum();
        System.out.println("Sum using Approach : " + sum1);
    }
}
