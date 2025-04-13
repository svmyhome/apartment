package black;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Black {
    public static void main(String[] args) {
        Employee emp1 = new Employee(12, "Petr", "Sidorov", 12345);
        Employee emp2 = new Employee(14, "Ivan", "Sokolov", 123425);
        Employee emp3 = new Employee(1, "Petr", "Petrov", 1245);
        List<Employee> employeeList = new ArrayList<>(Arrays.asList(emp1, emp2, emp3));
        System.out.println("Before sorting");
        System.out.println(employeeList);
        System.out.println("After sorting");
        Collections.sort(employeeList);
        System.out.println(employeeList);


    }
}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String lastName;
    private int salary;

    public Employee(int id, String name, String lastName, int salary) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compareTo(Employee anotherEmployee) {
//        if (this.id == anotherEmployee.id) {
//            return 0;
//        } else if (this.id < anotherEmployee.id) {
//            return -1;
//        } else {
//            return 1;
//        }

//        return this.id - anotherEmployee.id;

//        return this.name.compareTo(anotherEmployee.name);
        int res =this.name.compareTo(anotherEmployee.name);
        if (res == 0) {
            res = this.lastName.compareTo(anotherEmployee.lastName);
        }
        return res;

    }
}