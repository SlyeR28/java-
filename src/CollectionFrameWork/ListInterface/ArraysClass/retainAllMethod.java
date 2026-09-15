package CollectionFrameWork.ListInterface.ArraysClass;

import java.util.ArrayList;
import java.util.List;

public class retainAllMethod {
    public static void main(String[] args) {
        List<Integer>list1 = new ArrayList<>();
        List<Integer>list2 = new ArrayList<>();
        list1.add(1);
        list1.add(12);
        list1.add(5);
        list1.add(4);
        list1.add(3);

        list2.add(12);
        list2.add(52);
        list2.add(42);
        list2.add(2);
        list2.add(1);

        list2.retainAll(list1);

        System.out.println(list1);
    }
}
