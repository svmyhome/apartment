package black;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Black2 {
    public static void main(String[] args) {

        Worker work1 = new Worker("Ivan", "Sidpr", 12345);
        Worker work2 = new Worker("Ivan", "Bsth", 120345);
        Worker work3 = new Worker("Fedor", "Petrov", 1234);
        List<Worker> workerList = new ArrayList<>(Arrays.asList(work1, work2, work3));

        System.out.println("Before sorting");
        workerList.forEach(System.out::println);
        Collections.sort(workerList);
        System.out.println("Before sorting");
        workerList.forEach(System.out::println);
    }
}

class Worker implements Comparable<Worker> {
    private String name;
    private String lastName;
    private int salary;

    public Worker(String name, String lastName, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
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
        return "Worker{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Worker anotherWorker) {
     //   return this.salary - anotherWorker.salary;
        int compareResult = this.name.compareTo(anotherWorker.name);
        if (compareResult==0) {
            compareResult = this.lastName.compareTo(anotherWorker.lastName);
        }
        return compareResult;
    }
}