package StudentProblems;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

public class StudentMapper {

    public static List<StudentSummaryDto> transform(List<Student1>students){
  return    students.stream()
                .map(StudentMapper::mapToSummaryDto)
                .toList();
    }

    private static StudentSummaryDto mapToSummaryDto(Student1 student){
        String fullName = Optional.ofNullable(student.getFirstName()).orElse("")
                + " " + Optional.ofNullable(student.getLastName()).orElse(" ");

        String enrollmentDuration = computeDuration(student.getEnrollmentDate());

        return new StudentSummaryDto(
                fullName.trim(),
                enrollmentDuration,
                Optional.ofNullable(student.getMajor()).orElse("Unknown")
        );
    }

    private static String computeDuration(LocalDate enrollDate){
         if(enrollDate == null){
             return "Duration is Not specified";
         }
        Period period = Period.between(enrollDate , LocalDate.now());
         return period.getYears() + "years" + period.getMonths() + "Months" ;
    }
}
