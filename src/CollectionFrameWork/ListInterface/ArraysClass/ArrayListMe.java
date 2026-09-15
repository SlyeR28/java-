package CollectionFrameWork.ListInterface.ArraysClass;

import java.util.*;

public class ArrayListMe {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 40, 10));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 10, 30, 20, 40, 10));
//        List<Integer>list = Arrays.asList(10, 20, 10, 30, 20, 40, 10);

        list.sort((a , b)-> a-b);
        System.out.println(list);

        list.remove(0);
        for(int i = 1; i<list.size(); i++){
            if(Objects.equals(list.get(i), list.get(i - 1))){
                list.remove(i);
                i--;
            }
        }
        // reverse it
//        list.sort((a , b)-> b-a);


       list.removeAll(list2);
        System.out.println(list2 + "Sec");

        ArrayList<String> names = new ArrayList<>(20);

        names.add("Rishabh Kumar");
        names.add("Ankit Kumar");
        names.add("Prince Kumar");
        names.add("Sachin Kumar");
        names.add("Rishi Kumar");
        names.add("Gaurav Kumar");

        System.out.println("Size Before trim : " +names.size());

        System.out.println(
                "Note: internal capacity > size before trim");
        names.trimToSize();
        System.out.println(
                "Capacity now matches size internally");

        ListIterator<String>itr = names.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }

        names.removeIf( nmae ->names.equals("Rishabh Kumar"));
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
/*
   List<Integer>list = Arrays.asList(10, 20, 10, 30, 20, 40, 10);
   this will give you immultable final array list where you can get and set the elements but cant add or
   remove

 */