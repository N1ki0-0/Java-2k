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

public class MergeSortStudents {
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i).getGPA() >= list2.get(j).getGPA()) {
                mergedList.add(list1.get(i));
                i++;
            } else {
                mergedList.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> students1 = new ArrayList<>();
        students1.add(new Student("Alice", 3.8));
        students1.add(new Student("Bob", 3.5));
        students1.add(new Student("Eve", 3.9));

        List<Student> students2 = new ArrayList<>();
        students2.add(new Student("Charlie", 4.0));
        students2.add(new Student("David", 3.2));

        System.out.println("List 1:");
        for (Student student : students1) {
            System.out.println(student);
        }

        System.out.println("\nList 2:");
        for (Student student : students2) {
            System.out.println(student);
        }

        // Сортировка списков по убыванию GPA
        Collections.sort(students1, new SortingStudentsByGPA());
        Collections.sort(students2, new SortingStudentsByGPA());

        System.out.println("\nList 1 after sorting by GPA (descending order):");
        for (Student student : students1) {
            System.out.println(student);
        }

        System.out.println("\nList 2 after sorting by GPA (descending order):");
        for (Student student : students2) {
            System.out.println(student);
        }

        // Объединение и сортировка слиянием
        List<Student> mergedAndSorted = mergeSort(students1, students2);

        System.out.println("\nMerged and sorted list:");
        for (Student student : mergedAndSorted) {
            System.out.println(student);
        }
    }
}
