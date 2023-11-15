import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public double getGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{Name: " + name + ", GPA: " + gpa + "}";
    }
}

class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getGPA(), student1.getGPA());
    }
}

public class TestSortingStudentsByGPA {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 4.0));
        students.add(new Student("David", 3.2));
        students.add(new Student("Eve", 3.9));

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортировка по убыванию GPA с использованием быстрой сортировки
        Collections.sort(students, new SortingStudentsByGPA());

        System.out.println("\nAfter sorting by GPA (descending order):");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
