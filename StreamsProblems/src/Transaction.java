import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public record Transaction(String date, double amount) { }

 class TransactionSum{
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("2025-04-20" , 100.50),
                new Transaction("2025-04-20" , 200.75),
                new Transaction("2025-04-21" , 150.00),
                new Transaction("2025-04-21" , 50.25),
                new Transaction("2025-04-21" , 300.00)
        );

        Map<String, Double> collect = transactions.stream()
                .collect(Collectors.groupingBy(
                        Transaction::date,
                        Collectors.summingDouble(Transaction::amount)
                ));

        System.out.println(collect);

        int [] nums = {1, 2,3,4,5,6,4};
        HashSet<Integer> objects = new HashSet<>();

        boolean anyMatch = Arrays.stream(nums).anyMatch(ele -> !objects.add(ele));
        System.out.println(anyMatch);

        // second way
        boolean b = Arrays.stream(nums).distinct().count() != nums.length;
        System.out.println(b);


    }
}
