package Employessinc;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Employees {

    private String name;
    private int salary;
    private LocalDate lastRaisedDate;

    public Employees(String name, int salary, LocalDate lastRaisedDate) {
        this.name = name;
        this.salary = salary;
        this.lastRaisedDate = lastRaisedDate;
    }

    @Override
    public String toString() {
        return "Employees{" + "lastRaisedDate=" + lastRaisedDate + ", name='" + name  + ", salary=" + salary + '}';
    }
}
