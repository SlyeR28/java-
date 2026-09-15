package CollectionFrameWork.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();


        for (int i = 0; i<20; i++){
            set.add(i *10);
        }

        for (Integer integer : set) {
            System.out.println(integer);
        }

        System.out.println(set.contains(39));

//        for (Integer integer : set){
//            set.remove(integer);
//        }
        set.clear();
        System.out.println(set.contains(39));



    }
}
