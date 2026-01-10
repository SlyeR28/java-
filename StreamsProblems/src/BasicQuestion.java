import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class BasicQuestion {
    public static void main(String[] args) {
    /*   "Remove duplicates while maintaining insertion order",

     */
        List<Integer> list = List.of(1,2,3,2,1,4);
        Set<Integer> collect = list.stream().collect(Collectors.toCollection(LinkedHashSet::new));
        LinkedHashSet<Integer> integers = new LinkedHashSet<>(list);
        System.out.println(integers);
        System.out.println(collect);

        List<Integer> collect1 = list
                .stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect1);

        //   "Count frequency of each element",
        List<String> list1 = List.of("java","spring","java","sql");
        Map<String, Long> collect2 = list1.stream().collect(Collectors.groupingBy(
                s -> s, Collectors.counting()
        ));
        Map<String, Long> collect3 = list1.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
        System.out.println(collect3);
        System.out.println(collect2);

        //"Sort Map by values (descending)",
        Map<String, Integer> map = Map.of("A",10,"B",5,"C",20);
        LinkedHashMap<String, Integer> collect4 = map.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(collect4);

        //"Find first non-repeating character in a string"



    }

}
