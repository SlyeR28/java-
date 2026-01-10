package ImportantStream;

import java.util.*;
import java.util.stream.Collectors;

public class Solutions {
    public static void main(String[] args) {
          List<Employee> employees = Arrays.asList(
                new Employee(1, "Abraham", 29, "IT", "Mumbai", 20000, "Male"),
                new Employee(2, "Mary", 27, "Sales", "Chennai", 25000, "Female"),
                new Employee(3, "Joe", 28, "IT", "Chennai", 22000, "Male"),
                new Employee(4, "John", 29, "Sales", "Gurgaon", 29000, "Male"),
                new Employee(5, "Liza", 25, "Sales", "Bangalore", 32000, "Female"),
                new Employee(6, "Peter", 27, "Admin", "Mumbai", 31500, "Male"),
                new Employee(7, "Harry", 30, "Research", "Kochi", 21000, "Male")
        );

          //Find list of employees whose name starts with alphabet A
        List<Employee> a = employees.stream().filter(
                emp -> emp.getName().toLowerCase().startsWith("a")
        ).collect(Collectors.toList());

        System.out.println(a);

        //Group The employees By Department Names
        Map<String, List<Employee>> collect = employees.stream().collect(
                Collectors.groupingBy(
                        emp -> emp.getDepartNames()
                )
        );

        System.out.println(collect);

        //ind the total count of employees using stream
        long count = employees.size();
        System.out.println(count);

        //Find the max age of employees
        int asInt = employees.stream().mapToInt(Employee::getAge).max().getAsInt();
        System.out.println(asInt);

        //Find all department names
        List<String> collect1 = employees.stream()
                .map(Employee::getDepartNames)
                .collect(Collectors.toList());
        System.out.println(collect1);

        // Find the count of employee in each department
        Map<String, Long> collect2 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartNames,
                        Collectors.counting()
                ));
        System.out.println(collect2);

        // Find the list of employees whose age is less than 30
        List<Employee> collect3 = employees.stream()
                .filter(emp -> emp.getAge() < 30).collect(Collectors.toList());
        System.out.println(collect3);

        //Find the list of employees whose age is in between 26 and 31
        List<Employee> collect4 = employees.stream()
                .filter(emp -> emp.getAge() < 30 && emp.getAge() > 26).collect(Collectors.toList());
        System.out.println(collect4);

        //Find the average age of male and female employee
        Map<String, Double> collect5 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(collect5);

        // Find the department who is having maximum number of employee
        Map.Entry<String, Long> stringLongEntry = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartNames, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(stringLongEntry);

        // Find the Employee who stays in Delhi and sort them by their names
        List<Employee> delhi = employees.stream()
                .filter(emp -> emp.getAddress().equalsIgnoreCase("delhi"))
                .sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
        System.out.println(delhi);

        //Find the average salary in all departments
        Map<String, Double> collect6 = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartNames, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect6);

        // Find the highest salary in each department
        Map<String, Optional<Employee>> collect7 = employees.stream().
                collect(Collectors.groupingBy(Employee::getDepartNames, Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
        System.out.println(collect7);

        // Find the list of employee and sort them by their salary
        List<Employee> collect8 = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println(collect8);

        // Find the employee who has second lowest salary
        Employee employee = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).distinct().skip(1).findFirst().get();
        System.out.println(employee);

    }
}
