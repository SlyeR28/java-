import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stringsss {
    public static void main(String[] args) {
        String input = "hello world";

//        for (String ch : s){
//            System.out.println(ch);
//        }
        Map<String, Long> collect = Arrays.stream(input.split(""))
                .filter(st -> !st.isBlank())
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(collect);

        List<Integer> list = Arrays.asList(2, 4, 6, 8, 7, 10, 12);
        Optional<Integer> first = list.stream().filter(x -> x % 2 != 0).findFirst();
        System.out.println(first.get());

        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8, 9 );

        List<Integer> collect1 = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(collect1);
    }
}
