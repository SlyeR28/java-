package CollectionFrameWork.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInter {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        List<String> list = new ArrayList<>();
        List<String>list1 = Arrays.asList("DSA" , "Cloud" , "Rishabh Kumar");
        List<String>list2 = Arrays.asList("DSA1" , "Cloud1" , "Rishabh Kumar1");

        list.add("Java"); // adds the element at the end of list and return T/F
        list.add(1, "Python"); // adds the element at the specific index its a void function
        list.addAll(list1);
        list.addAll(3 , list2);

//        ListIterator<String> iterator = list.listIterator();
//        System.out.println(iterator.toString());


        for (String str : list){
            System.out.println(str);
        }

        for(int i = 0; i<list.size(); i++){
            System.out.println(i + " " + list.get(i));
        }


    }

}
