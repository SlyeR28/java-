package StudentProblems;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class StudentSummaryDto{
    private String fullName;
    private String enrollmentDuration;
    private String major;

}
