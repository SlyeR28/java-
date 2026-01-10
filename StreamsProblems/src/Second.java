import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Second {
    public static void main(String[] args) {
        // join the strings with  [ as prefix]  and suffix as "," as delimiter
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        String collect = words.stream().map(word -> "[" + word + "]")
                .collect(Collectors.joining(","));
        System.out.println(collect);

        // sum of first two elements in list
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> reduce = list.stream().limit(2).reduce(Integer::sum);
        int sum = list
                .stream().limit(2)
                .mapToInt(i -> i).sum();
        System.out.println(sum);
        System.out.println(reduce.get());

        // find the sum of unique numbers in given list
        List<Integer> list1 = Arrays.asList(1, 3, 2, 4, 3, 2, 5, 6, 6, 7, 7, 8, 9, 9, 20, 30, 110, 20, 30, 40, 50);
        int sum1 = list1.stream().distinct().mapToInt(i -> i).sum();
        Optional<Integer> reduce1 = list1.stream().distinct().reduce((a, b) -> a + b);
        System.out.println(reduce1.get());

        System.out.println(sum1);

        // find the word with k vowels in a given sentence
        String sentence = "I have an apple and orange on the table";
        int k = 3;

        List<String> collect1 = Arrays.stream(sentence.split(" "))
                .filter(word -> countVowles(word) == k)
                .collect(Collectors.toList());
        System.out.println(collect1);

        // given string s find the first non repeating character using stream function
        String input = "swiss";
        String string = Arrays.stream(input.split(""))
                .filter(ch -> input.indexOf(ch) == input.lastIndexOf(ch))
                .findFirst()
                .orElse("No non-repeating charcter");
        System.out.println(string);




    }

    public static long countVowles(String words){
        return words.chars()
                .mapToObj(ch -> (char) ch)
                .filter(ch -> "aeiouAEIOU".indexOf(ch) != -1)
                .count();
    }

}
