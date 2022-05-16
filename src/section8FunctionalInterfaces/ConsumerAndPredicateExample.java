package section8FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerAndPredicateExample {

    static Predicate<Student> studentPredicate = (student)
            -> student.getGradeLevel() >= 3;

    static Predicate<Student> studentPredicate2 = (student)
            -> student.getGpa() >= 3.9;

    static BiConsumer<String, List<String>> biConsumer = (name, activities) -> {
        System.out.println(name + " : " + activities);
    };

    static Consumer<Student> studentConsumer = (student) -> {
        if (studentPredicate.and(studentPredicate2).test(student)) {
            biConsumer.accept(student.getName(), student.getActivities());
        }
    };

    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void printNameAndActivities() {
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        printNameAndActivities();
    }
}
