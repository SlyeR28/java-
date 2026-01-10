import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfFirstNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        int sum  = list.stream().limit(2).reduce(0 ,Integer::sum);
        System.out.println(sum);

        List<String> string = Arrays.asList("java", "streams", "api");

        List<Integer> collect = string.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(collect);

        List<List<Integer>> list1 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> list2 = list1.stream().flatMap(List::stream)
                .toList();
        System.out.println(list2);
    }
}
