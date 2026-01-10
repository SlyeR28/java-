import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProblemsPart1 {
    public static void main(String[] args) {

        // filter out numbers divisible by 5
        List<Integer> list = Arrays.asList(10, 25, 20, 15, 17, 12, 35, 11, 5, 50);
        List<Integer> collect = list.stream()
                .filter(x -> x % 5 == 0)
                .collect(Collectors.toList());
        System.out.println(collect);

        // reverse each word in given strinng
        String sentence = "Java Streams are awesome";

        String reverse = Arrays.stream(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reverse);

        // sum of natural numbers 1 -10
        Optional<Integer> reduce = Stream.iterate(1, x -> x + 1).limit(10).reduce(Integer::sum);
        System.out.println(reduce.get());

        // print first 10 even numbers
        List<Integer> collect1 = Stream.iterate(2, x -> x + 2).limit(10).collect(Collectors.toList());
        System.out.println(collect1);

        // Anagram check
        String str1 = "abc";
        String str2 = "bac";

        boolean b = Arrays.equals(str1.chars().sorted().toArray(), str2.chars().sorted().toArray());
        System.out.println(b);

        // sum of digits of given numbers
        int number = 12345;

        int sum = 0;
        sum += String.valueOf(number)
                .chars()
                .map(c -> c - '0')
                .sum();
        System.out.println(sum);

        while (number > 0){
            sum += number%10;
            number = number/10;
        }
        System.out.println(sum);

        // most repeating element in lsit
        List<Integer> list1 = Arrays.asList(1, 2, 3, 2, 3, 2, 4, 5, 3, 3, 6);
        Integer key = list1.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow()
                .getKey();
        System.out.println(key);

        // convert a list of String into a map where each String is the key and value is a boolean indicating
        // if the the String is palindrome
        List<String> list2 = Arrays.asList("level", "apple", "banana", "madam");
        Map<String, Boolean> collect2 = list2.stream()
                .collect(Collectors.toMap(
                        words -> words, ProblemsPart1::isPalindrome
                ));
        System.out.println(collect2);

        // minimum char frequency
        String input = "banana appllee";
        String processed = input.replaceAll(" " , "");

        Character collect3 = processed.chars().
                mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .min(Map.Entry.comparingByValue())
                .orElseThrow()
                .getKey();
        System.out.println(collect3);

        // find all the numbers which end with one and print it into asscending order
        List<Integer> list3 = Arrays.asList(150, 145, 102, 11, 21, 31, 41, 51, 21, 61, 12, 22, 31, 71, 81);
        List<Integer> list4 = list3.stream()
                .filter(x -> x % 10 == 1)
                .distinct()
                .sorted()
                .toList();
        System.out.println(list4);

        // find the number which contains 1 anywhere then
        List<Integer> list5 = list3.stream()
                .filter(x -> String.valueOf(x).contains("1") && !String.valueOf(x).startsWith("1"))
                .distinct()
                .sorted()
                .toList();
        System.out.println(list5);


    }

    private static boolean isPalindrome(String word){
        return word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());
    }
}
