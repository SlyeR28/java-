package CollectionFrameWork.SetInterface;

import java.util.*;

public class SetFundamentals {
    public static void main(String[] args) {

        /*
        Explain Set.of(...) (Java 9+). What are its restrictions (nulls, duplicates, mutability)?
         */
        Set<Integer> marks = Set.of(99, 98, 97,96,95,94,93,92,91 ,88, 87 , 78 ,67, 89,32);
        System.out.println("Set Content " +marks);
        System.out.println("Set Size " +marks.size());

//         marks.add(90); // UnsupportedOperationException
//         marks.remove(99);


        Set<String> fruits = new HashSet<>();
        System.out.println("add(\"apple\")  -> " + fruits.add("apple"));
        System.out.println("add(\"banana\") -> " + fruits.add("banana"));
        System.out.println("add(\"apple\")  -> " + fruits.add("apple"));   // duplicate
        System.out.println("add(\"banana\") -> " + fruits.add("banana")); // duplicate
        System.out.println("add(\"cherry\") -> " + fruits.add("cherry"));

        System.out.println("Set Content " +fruits);
        System.out.println("Set Size " +fruits.size());


        /*
        How do you convert a List to a Set and back to a List (to remove duplicates while preserving/not
         preserving order)?
         */

        List<Integer> numbers = Arrays.asList(5, 1, 3, 5, 2, 1, 4, 3, 2);
        System.out.println("Original: " + numbers);

        Set<Integer> set = new HashSet<>(numbers);
        System.out.println("HashSet -> List (no order guarantee): " + set);

        List<Integer> uniqueNumbers = new ArrayList<>(set);
        System.out.println("List with duplicates removed: " + uniqueNumbers);

        //Maintaining The Order Now
        Set<Integer> linkedSet = new LinkedHashSet<>(numbers);
        List<Integer> fromHashSet= new ArrayList<>(linkedSet);
        System.out.println("LinkedHashSet -> List (order preserved): " + fromHashSet);


        // sorted Order
        Set<Integer> treeSet = new TreeSet<>(numbers);
        List<Integer> fromTreeSet = new ArrayList<>(treeSet);
        System.out.println("TreeSet -> List (sorted order): " + fromTreeSet);

        /*
         Write code to perform union, intersection, and difference of two sets using addAll, retainAll, and
            removeAll
         */
        // Create two sets
        Set<Integer> a = new HashSet<>(Set.of(1, 2, 3, 4, 5));
        Set<Integer> b = new HashSet<>(Set.of(4, 5, 6, 7, 8));

        System.out.println("A = " + a);
        System.out.println("B = " + b);

        // =======UNION==========
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union (A ∪ B)        = " + union);


        //======INTERSECTION==========
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersection (A ∩ B) = " + intersection);
    }




    /*
     What is the Set interface, and which interface does it extend? Why does Set not have get(int index)
      like List?
      ans -> Set interface is part of the Collection Framework and extends the Collection interface ,
             Set does not allow elements duplicate elements and its does not maintain the insertion  order of elements
             , and stores elements in a buckets with the help hashing so there's no index to get the elements


      Explain why Set does not allow duplicate elements. How does it decide whether two elements are duplicates ?
       Set interface known for its storing unique elements , as we try to add any element in set , first it find the
       hashcode of the element and check if the element is already present in the set or not if present then it
       check .equals() method to confirm if the elements are duplicates or not
     */

}
