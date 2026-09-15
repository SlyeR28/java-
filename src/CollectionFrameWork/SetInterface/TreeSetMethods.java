package CollectionFrameWork.SetInterface;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetMethods {
    public static void main(String[] args) {
        SortedSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(110);
        set.add(130);
        set.add(150);
        set.add(0);
        set.add(1);
        set.add(16);
        set.add(15);
        set.add(230);
        set.add(60);
        set.add(20);
        set.add(12);

//        for (int i = 0; i<20; i++){
//            set.add((i+1)*10);
//        }

        System.out.println(set.first());
        System.out.println(set.getFirst());

        System.out.println(set.removeFirst());


    }
}
