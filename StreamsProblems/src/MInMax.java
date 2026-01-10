import java.util.ArrayList;
import java.util.Arrays;

public class MInMax {
    public ArrayList<Integer> getMaxMin(int [] arr){
        ArrayList<Integer> list = new ArrayList<>();


        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        list.add(min);
        list.add(max);
        return list;

    }

    public static void main(String[] args) {
        MInMax obj = new MInMax();
        int [] arr = {1,2,3,4,5};
//        System.out.println(obj.getMaxMin(arr));
        ArrayList<Integer> list = new ArrayList<>();
        list.add(Arrays.stream(arr).min().getAsInt());
        list.add(Arrays.stream(arr).max().getAsInt());
        System.out.println(list);
    }
}
