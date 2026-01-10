import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic12 {
    public static void main(String[] args) {
        //Second highest salary
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> collect = list.stream()
                .sorted((a, b) -> b - a)
                .skip(1)
                .limit(1).collect(Collectors.toList());
        System.out.println(collect);
    }
}
