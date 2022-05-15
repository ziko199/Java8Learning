package firstExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeExample2 {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,1,2,2,3,3,4,5,5,6,7,7,8,9,9,10);

        // Imperative style
        System.out.println("-----Imperative style------");
        List<Integer> uniqueList = new ArrayList<>();
        for (Integer integer: integerList) {
            if (!uniqueList.contains(integer)) {
                uniqueList.add(integer);
            }
        }
        System.out.println("Sum using Approach : " + uniqueList);

        // Declarative style
        System.out.println("-----Declarative style------");
        List<Integer> uniqueList1 = integerList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Sum using Approach : " + uniqueList1);


    }
}
