import java.util.Arrays;
import java.util.Comparator;

public class questions {
    public static void main(String[] args) {
        String s = "I am Learning Streams API in Java";
        String s1 = Arrays.stream(s.split(" ")).max(Comparator.comparing(String::length)).get();
        System.out.println(s1);
        String s2 = "dabcadefg";
//        s2.chars().distinct().mapToObj(Character::toString).forEach(System.out::println);
        Arrays.stream(s2.split(" ")).distinct().forEach(System.out::println);


    }
}

