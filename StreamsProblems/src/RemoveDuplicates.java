import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// remove duplicates and preserve the order using java streams
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "orange", "banana");
        // first way as we know that list maintains the order of insertion
        List<String> collect = list.stream().distinct().collect(Collectors.toList());
//       // directly printing
       list.stream().distinct().forEach(System.out::println);
        System.out.println(collect);

        // second way via hashmap and MapTo
        List<String> collect1 = list.stream().collect(
                        Collectors.toMap(
                                s -> s,
                                s -> s,
                                (a, b) -> a,
                                LinkedHashMap::new
                        ))
                .values()
                .stream().collect(Collectors.toList());
        System.out.println(collect1);

         new LinkedHashSet<>(list).forEach(System.out::println);

        // order is not mandatory
        new HashSet<>(list).forEach(System.out::println);
       list.stream().collect(Collectors.toSet()).forEach(System.out::println);

       // find all numbers starting with one
        List<Integer> list1 = Arrays.asList(10, 21, 13, 41, 15, 2, 1, 100, 23);
        // approach is that parse it to string then  use String method start with then collect it to list
        List<Integer> collect2 = list1.stream().filter(num -> String.valueOf(num).startsWith("1")).collect(Collectors.toList());
        System.out.println(collect2);
        // approach 2
         list1.stream().filter(num -> Integer.toString(num).charAt(0)=='1').collect(Collectors.toList()).forEach(System.out::println);
          // merging two list in one list
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list3 = Arrays.asList(5, 6, 7, 8);

        List<Integer> collect3 = Stream.concat(list2.stream(), list3.stream()).collect(Collectors.toList());
        System.out.println(collect3);

        // merge two sorted list into sorted list
        List<Integer> list4 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> list5 = Arrays.asList(2, 4, 6, 8, 10);
        List<Integer> collect4 = Stream.concat(list4.stream(), list5.stream()).sorted().collect(Collectors.toList());
        System.out.println(collect4);

        // check numbers are prime numbers are not
        List<Integer> list6 = Arrays.asList(4, 6, 8, 9, 11, 15,17,19);
        List<Integer> collect5 = list6.stream().filter(RemoveDuplicates::isPrime).collect(Collectors.toList());
        System.out.println(collect5);

       // peek for debugging what is happening

        // given a list of string find the strings which starts with numbers
        List<String> list7 = Arrays.asList("1apple" , "banana" , "3cheery" , "date" , "5elephant");
        System.out.println(
                list7.stream()
                .filter(s -> !s.isEmpty() && Character.isDigit(s.charAt(0)))
                .toList()
        );

        // sort the given list of decimals in reverse order
        List<Double> decimals = Arrays.asList(3.14 , 1.59 , 2.65 , 4.89 , 0.77);
        System.out.println(decimals.stream().sorted(Comparator.reverseOrder()).toList());


    }


    public static boolean isPrime(int num){
        if(num <= 1)return false;

        for(int i =2; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
