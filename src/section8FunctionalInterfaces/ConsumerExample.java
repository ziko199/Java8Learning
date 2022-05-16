package section8FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> studentConsumer = (student) -> System.out.println(student);

    static Consumer<Student> studentNamesConsumer = (student) -> {
        System.out.println(student.getName());
    };

    static Consumer<Student> studentActivitiesConsumer = (student) -> {
        System.out.println(student.getActivities());
    };

    static List<Student> studentList = StudentDataBase.getAllStudents();


    // print the list of student using consumer
    public static void printStudents() {
        studentList.forEach(studentConsumer);
    }

    // print the students name and activities by using Consumer chaining
    public static void printNameAndActivities() {
        studentList.forEach(studentNamesConsumer.andThen(studentActivitiesConsumer));
    }

    public static void printNameAndActivitiesUsingCondition() {
        studentList.forEach(student -> {
            if (student.getGradeLevel() >= 3) {
                studentNamesConsumer.andThen(studentActivitiesConsumer).accept(student);
            }
        });
    }

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");

        printStudents();
        printNameAndActivities();
        System.out.println("printing students with grad level higher or equal to 3");
        printNameAndActivitiesUsingCondition();
    }
}
