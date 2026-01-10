package StudentProblems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Builder
public class Student1 {

    private long id;
    private String firstName;
    private String lastName;
    private LocalDate enrollmentDate;
    private String major;
    private double gpa;
}


