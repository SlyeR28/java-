import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Partition {
    public static void main(String[] args) {
        Map<Boolean, List<Integer>> collect = Stream
                .iterate(1, x -> x + 1)
                .limit(20)
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));

        System.out.println(collect);

        List<Student> students = Arrays.asList(
                new Student(20, "Ravi"),
                new Student(22, "Amit"),
                new Student(21, "Neha"),
                new Student(23, "Priya"),
                new Student(20, "Sumit"),
                new Student(24, "Ankit"),
                new Student(21, "Reena"),
                new Student(23, "Vikas"),
                new Student(22, "Pooja"),
                new Student(25, "Suresh")
        );

        OptionalDouble average = students.stream()
                .mapToInt(Student::getAge)
                .average();
        System.out.println(average.getAsDouble());

        Double collect1 = students.stream().collect(Collectors.averagingDouble(Student::getAge));
        System.out.println(collect1);


        // sort by multiple fields


    }
}
class Student{
    private final int age;
    private final String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
