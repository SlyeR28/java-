import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProblemsT32 {
    public static void main(String[] args) {

        // Find the word that has the second highest length
        String str = "I am Learning Streams API in Java Java";
        String s = Arrays.stream(str.split(" "))
                .sorted((a, b) -> b.length() - a.length())
                .skip(1)
                .findFirst().orElse(null);
        System.out.println(s);


        //  Find the 2nd highest length word in the given sentence
        assert s != null;
        System.out.println(s.length());

        Map<String, Long> collect = Arrays
                .stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect);

        //Given a sentence, find the words with a specified number of vowels
        Arrays.stream(str.split(" "))
                .filter(x -> x.replaceAll("[^aeiouAEIOU]", "").length() == 2)
                .forEach(System.out::println);
        // Divide given integer list into lists of even and odd numbers
        int [] arr  = {1,2,3,4,5,6,7,8,9,10};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Map<Boolean, List<Integer>> collect1 = list.stream().collect(Collectors.groupingBy(x -> x % 2 == 0, Collectors.toList()));
        System.out.println(collect1);

        //Given a word, find the occurrence of each character
        String str1 = "Mississippi";
        Map<String, Long> collect2 = Arrays.stream(str1.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect2);

        int []  arr1 = {1,2,3,4,5};
        Arrays.stream(arr1).mapToObj(x -> x).sorted().forEach(System.out::print);

        System.out.println("");
        //  Given an array, find the sum of unique elements
        int [] arr2 = {1,6,7,8,1,1,8,8,7};
        int i = Arrays.stream(arr2).distinct().reduce(Integer::sum).orElse(0);
        System.out.println(i);

        //  Given a string, find the first non-repeated character
        String str2 = "Hello World";
        String s2 = Arrays.stream(str2.split("")).filter(s1 -> str2.indexOf(s1) == str2.lastIndexOf(s1)).findFirst().get();
        System.out.println(s2);
        String s3 = Arrays.stream(str2.split("")).filter(s1 -> str2.indexOf(s1) != str2.lastIndexOf(s1)).findFirst().get();
        System.out.println(s3);

        //Given an array of integers, group the numbers by the range
        int [] arr4 = {1,2,3,10, 14,20,24,30,34,40,44,50 , 54};
        List<Integer> collect3 = Arrays.stream(arr4).boxed().collect(Collectors.toList());
        Map<Integer, List<Integer>> collect4 = collect3.stream().collect(Collectors.groupingBy(x -> x / 10*10, Collectors.toList()));
        System.out.println(collect4);

        // Given a list of strings, create a list that contains only integers
        String [] s1 = {"abc" , "123" , "456" , "xyz"};
        List<Integer> collect5 = Arrays.stream(s1).filter(x -> x.matches("[0-9]+")).map(Integer::valueOf)
                .collect(Collectors.toList());
        System.out.println(collect5);

        // Find the products of the first two elements in an array
        int [] arr3 = {12 ,5 ,6,9,2,4};
        List<Integer> collect6 = Arrays.stream(arr3).boxed().collect(Collectors.toList());
        Integer i1 = collect6.stream().limit(2).reduce( 1, (a, b) -> a * b);
        System.out.println(i1);

        // stream program to multiply alternative numbers in an array
        int [] arr5 = {4,5,1,7,2,9,2};
        int reduce = IntStream.range(0, arr5.length)
                .filter(j -> j % 2 == 0)
                .map(j -> arr5[j])
                .reduce(1, (a, b) -> a * b);
        System.out.println(reduce);

        //


    }

}
