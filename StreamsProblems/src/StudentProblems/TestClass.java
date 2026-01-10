package StudentProblems;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class TestClass {
    public static void main(String[] args) {
        List<Student1> students = Arrays.asList(
                new Student1(1, "Rishabh", "Kumar",
                        LocalDate.of(2022, 6, 10),
                        "Computer Science", 8.5),

                new Student1(2, "Ankit", "Sharma",
                        LocalDate.of(2021, 7, 15),
                        "Mechanical", 7.8),

                new Student1(3, "Priya", "Singh",
                        LocalDate.of(2023, 1, 5),
                        "Electronics", 9.1),

                new Student1(4, "Arjun", "Verma",
                        LocalDate.of(2020, 9, 20),
                        "Civil", 6.9),

                new Student1(5, "Neha", "Joshi",
                        LocalDate.of(2022, 2, 12),
                        "IT", 8.9)
        );

        List<StudentSummaryDto> transform = StudentMapper.transform(students);
        transform.forEach(System.out::println);

    }
}
