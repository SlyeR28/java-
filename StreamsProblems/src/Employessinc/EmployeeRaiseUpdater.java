package Employessinc;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class EmployeeRaiseUpdater {
    public static void main(String[] args) {
        List<Employees> employeeList = Arrays.asList(
                new Employees("Rishabh", 50000, LocalDate.of(2023, 5, 10)),
                new Employees("Ankit", 42000, LocalDate.of(2022, 8, 15)),
                new Employees("Neha", 60000, LocalDate.of(2024, 1, 5)),
                new Employees("Priya", 55000, LocalDate.of(2023, 11, 20)),
                new Employees("Arjun", 47000, LocalDate.of(2021, 3, 12))
        );

        LocalDate oneYearOld = LocalDate.now().minusYears(1);
        employeeList.stream()
                .filter(emp -> emp.getLastRaisedDate() == null||emp.getLastRaisedDate().isBefore(oneYearOld))
                .map(emp -> {
                    emp.setSalary(emp.getSalary()+ 1500);
                    return emp;
                })
                .forEach(System.out::println);

        int asInt = employeeList.stream()
                .mapToInt(Employees::getSalary)
                .max().getAsInt();
        System.out.println(asInt);

        List<Employees> list = employeeList.stream()
                .filter(emp -> emp.getSalary() == asInt)
                .map(emp -> {
                    emp.setSalary(emp.getSalary() + 2000);
                    return emp;
                }).toList();
        System.out.println(list);
    }
}
