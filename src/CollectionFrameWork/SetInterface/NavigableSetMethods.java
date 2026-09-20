package CollectionFrameWork.SetInterface;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMethods {
    public static void main(String[] args) {
        NavigableSet<Integer>set = new TreeSet<>();

        set.add(102);
        set.add(192);
        set.add(191);
        set.add(182);
        set.add(162);
        set.add(129);
        set.add(124);
        set.add(123);
        set.add(122);
        set.add(121);

        Iterator<Integer>st = set.iterator();

//        System.out.println("iterator Result :   ");
//        while (st.hasNext()){
//            System.out.println(st.next());
//        }

//        System.out.println("set lower reslt or floor");
//        System.out.println(set.lower(200));
//        System.out.println(set.floor(231));
//
//        System.out.println("Set poll first result");
//
//        System.out.println(set.pollFirst());
//        System.out.println(set.pollFirst());
//        System.out.println(set.pollFirst());
//        System.out.println("Poll last result");
//        System.out.println(set.pollLast());
//        System.out.println(set.pollLast());
//        System.out.println(set.pollLast());



//        System.out.println("After pool result ");
//        for (Integer integer : set){
//            System.out.println(integer);
//        }

        NavigableSet<Integer> integers = set.headSet(121, true);
        NavigableSet<Integer> integers1 = set.tailSet(170, true);
        for (Integer integer : integers1){
            System.out.println(integer);
        }

    }
}
