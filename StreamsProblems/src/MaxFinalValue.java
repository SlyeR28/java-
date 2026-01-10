import java.util.Arrays;
import java.util.List;

public class MaxFinalValue {

    public static int getMaxValue(List<Integer> arr) {

        arr.sort(Integer::compareTo);

        int current = 1; // first element must be 1

        for (int i = 1; i < arr.size(); i++) {

            current = Math.min(arr.get(i), current + 1);
        }

        return current;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 1, 3, 4);
        System.out.println(getMaxValue(arr));
    }
}
