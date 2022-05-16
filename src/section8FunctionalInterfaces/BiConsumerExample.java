package section8FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void printNameAndActivities() {
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
            System.out.println(name + " : " + activities);
        };
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            biConsumer.accept(student.getName(), student.getActivities());
        });
    }

    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println("value of a is: " + a);
            System.out.println("value of b is: " + b);
        };

        BiConsumer<Integer, Integer> multiply = (x, y) -> {
            System.out.println("multiply: x * y = " + x * y);
        };

        BiConsumer<Integer, Integer> division = (x, y) -> {
            System.out.println("division: x * y = " + x / y);
        };

        biConsumer.accept("Java8", "JavaScript");
        multiply.andThen(division).accept(7, 3);

        printNameAndActivities();
    }
}
