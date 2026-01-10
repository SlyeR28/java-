import java.util.Arrays;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;

public class AllSummaryStatistical {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 9, 1, 7);
        IntSummaryStatistics statistics = list.stream()
                .mapToInt(x -> x)
                .summaryStatistics();
        System.out.println(statistics.getMin());
        System.out.println(statistics.getMax());
        System.out.println(statistics.getAverage());
        System.out.println(statistics.getSum());
        System.out.println(statistics.getCount());

        // find the word with third highest length
        List<String> list1 = Arrays.asList("apple", "bannana", "ankit", "aa", "nnnnn", "prince");
        String string = list1.stream()
                .sorted(Comparator.comparing(String::length))
                .skip(2)
                .findFirst().orElse(" no word found");
        System.out.println(string);

    }
}
