import java.util.Arrays;

class Student implements Comparable<Student> {
    private int iDNumber;

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    @Override
    public int compareTo(Student otherStudent) {
        return Integer.compare(this.iDNumber, otherStudent.iDNumber);
    }

    @Override
    public String toString() {
        return "Student[ID: " + iDNumber + "]";
    }
}

public class TestSortingStudents {
    public static void main(String[] args) {
        Student[] students = { new Student(5), new Student(1), new Student(3), new Student(2), new Student(4) };

        System.out.println("Before sorting:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Сортировка методом вставки
        Arrays.sort(students);

        System.out.println("\nAfter sorting:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
