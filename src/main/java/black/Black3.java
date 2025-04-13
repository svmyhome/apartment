package black;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Black3 {
    public static void main(String[] args) {
        Student st1 = new Student(3, "Iavan", "Sidorov", 13323);
        Student st2 = new Student(1, "Petr", "Sidorov", 1223);
        Student st3 = new Student(2, "Petr", "Zina", 123);

        List<Student> studentList = new ArrayList<>(Arrays.asList(st1, st2, st3));

        System.out.println("Before sorting");
        studentList.forEach(System.out::println);
        System.out.println("After sorting");
        Collections.sort(studentList, new NameAndLastNameComparator());
        studentList.forEach(System.out::println);

    }
}


class Student implements Comparable<Student> {
    private int id;
    private String name;
    private String lastName;
    private int salary;


    public Student(int id, String name, String lastName, int salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Student anotherStudent) {
        if (this.id == anotherStudent.id) {
            return 0;
        } else if (this.id < anotherStudent.id) {
            return -1;
        } else {
            return 1;
        }
    }
}
class NameAndLastNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        int resultCompare = st1.getName().compareTo(st2.getName());
        if (resultCompare == 0) {
            resultCompare = st1.getLastName().compareTo(st2.getLastName());
        }
        return resultCompare;
    }
}

class SalaryComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        return st1.getSalary() - st2.getSalary();
    }
}