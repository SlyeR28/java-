import lombok.Lombok;

import java.util.*;
import java.util.stream.Collectors;

public class BasicQuestion11 {
    public static void main(String[] args) {
        //Sum of Even Numbers
        List<Integer> list = Arrays.asList(10, 15, 20, 25, 30, 35);
        Integer reduce = list.stream()
                .filter(x -> x % 2 == 0).
                reduce(0, Integer::sum);
        System.out.println(reduce);

        //Maximum Element
        List<Integer> list1 = Arrays.asList(5, 12, 3, 19, 1);
        Optional<Integer> max = list1.stream().max(Integer::compareTo);
        System.out.println(max.get());

        //Count Strings Starting With Vowel
        List<String> list2 = Arrays.asList("Apple", "Banana", "Orange", "Grapes", "Umbrella");
        long count = list2.stream()
                .filter(s -> {
                    char ch =  Character.toLowerCase(s.charAt(0));
                    return  ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
                } )
                .count();
        System.out.println(count);

        // to upper case
        List<String> list4 = Arrays.asList("java", "spring", "sql");
        List<String> collect = list4.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(collect);

        //First Number Greater Than 50
        List<Integer> list5 = Arrays.asList(10, 20, 60, 40, 80);
        Integer i = list5.stream()
                .filter(x -> x > 50)
                .findFirst()
                .orElseThrow();
        System.out.println(i);

        // remove duplicates
        List<Integer> list6 = Arrays.asList(1, 2, 2, 3, 4, 4, 5);
        List<Integer> collect1 = list6.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(collect1);

        //sort in desecnding order
        List<Integer> list7 = Arrays.asList(9, 2, 7, 4, 1);
        List<Integer> collect2 = list7.stream()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
        System.out.println(collect2);

        // average
        List<Integer> list8 = Arrays.asList(10, 20, 30, 40);
        double avg = list8.stream()
                .reduce(0, Integer::sum)/(double)list8.size();

        double v = list8.stream()
                .mapToInt(Integer::intValue).average().orElse(0);
        System.out.println(v);
        System.out.println(avg);

        //Longest String
        List<String> list9 = Arrays.asList("Java", "SpringBoot", "SQL", "Microservices");
        String aNull = list9.stream()
                .sorted((a, b) -> b.length() - a.length())
                .findFirst()
                .orElse("null");
        System.out.println(aNull);

        String empty = list9.stream()
                .max(Comparator.comparing(String::length))
                .orElse("empty");
        System.out.println(empty);

        //Partion odd and even
        List<Integer> list10 = Arrays.asList(1, 2, 3, 4, 5, 6);
        Map<Boolean, List<Integer>> collect3 = list10.stream()
                .collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()));
        Map<Boolean, List<Integer>> collect4 = list10.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect4);
        System.out.println(collect3);

        // Group String by Length
        List<String> list11 = Arrays.asList("one", "two", "three", "four", "six");
        Map<Integer, List<String>> collect5 = list11.stream()
                .collect(
                        Collectors.groupingBy(String::length, Collectors.toList())
                );
        System.out.println(collect5);

        //Numbers Greater Than Average
        List<Integer> list12 = Arrays.asList(5, 10, 15, 20, 25);
        double v1 = list12.stream()
                .mapToInt(Integer::intValue).average()
                .orElse(0);
        List<Integer> collect6 = list12.stream()
                .filter(x -> x > v1).collect(Collectors.toList());
        System.out.println(collect6);




    }
}
