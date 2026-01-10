import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    String name;
    int age;


    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
class groupByAge{
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("Rohit", 25),
                new Employee("Amit", 30),
                new Employee("Neha", 28),
                new Employee("Priya", 25),
                new Employee("Sumit", 32),
                new Employee("Ankit", 30),
                new Employee("Reena", 27),
                new Employee("Vikas", 32),
                new Employee("Pooja", 26),
                new Employee("Suresh", 28)
        );

        Map<Integer, List<Employee>> collect = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getAge));
        System.out.println(collect);

        // sort by multiple fields
        List<Employee> employees = employeeList
                .stream()
                .sorted(Comparator.comparingInt(Employee::getAge)
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());
        employees.forEach(e ->
                System.out.println(e.getName() + " - " + e.getAge())
        );

        System.out.println(employees);

    }
}
