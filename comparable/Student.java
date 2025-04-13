package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double gpa;

    public Student(String name, int age ,double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }



    // @Override
    // public int compareTo(Student other) {
    //     return this.name.compareTo(other.name);
    // }

    // @Override
    // public int compareTo(Student other) {
    //     return Integer.compare(this.age, other.age);
    // }

    @Override
    public int compareTo(Student other) {
        return Double.compare(this.gpa, other.gpa);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gpa=" + gpa +
                '}';

    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return age == student.age && Double.compare(student.gpa, gpa) == 0 && name.equals(student.name);
    }
    

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 3.5));
        students.add(new Student("Bob", 22, 3.8));
        students.add(new Student("Charlie", 21, 3.2));
        students.add(new Student("David", 23, 3.9));
        students.add(new Student("Eve", 19, 3.6));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }
        // Check for equality
        Student student1 = new Student("Alice", 20, 3.5);
        Student student2 = new Student("Alice", 20, 3.5);

        System.out.println("Are student1 and student2 equal? " + student1.equals(student2)); // true
        System.out.println("Are student1 and student2 the same object? " + (student1 == student2)); // false
    }
}
