package section8FunctionalInterfaces;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static  Predicate<Student> studentPredicate = (student)
            -> student.getGradeLevel() >= 3;

    static  Predicate<Student> studentPredicate2 = (student)
            -> student.getGpa() >= 3.9;

    static List<Student> studentList = StudentDataBase.getAllStudents();

    public static void filterStudentByGradeLevel() {
        studentList.forEach(student -> {
            if (studentPredicate.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGpa() {
        studentList.forEach(student -> {
            if (studentPredicate2.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudent() {
        studentList.forEach(student -> {
            if (studentPredicate.and(studentPredicate2).test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("Filter Student by Grade level");
        filterStudentByGradeLevel();
        System.out.println("Filter Student by GPA");
        filterStudentByGpa();
        System.out.println("Filter Student by GPA and Grade level");
        filterStudent();
    }
}
