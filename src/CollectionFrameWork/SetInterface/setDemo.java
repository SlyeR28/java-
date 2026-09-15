package CollectionFrameWork.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class setDemo {
    public static void main(String[] args) {
        Set<String> st = new HashSet<>();
        st.add("Rishabh");
        st.add("Rishabh1");
        st.add("Rishabh");

        System.out.println(st.contains("Rishabh"));
        // so there is not concept of getting elements in set interface
        // its only checking the element contains or not
        // why not get method in Set interface -> b/c set is meant to be a collection of unique elements
        // with no defined positional index  since set doest not maintain insertion order so there no get operation

        String name = "Rishabh Kumar";
        String name1 = "Rishabh Kumar";
        int code = name.hashCode();
        int code1 = name.hashCode();
        Integer a = 12345678;
        System.out.println(a.hashCode()%10);
        System.out.println(code1%10);
        System.out.println(code%10);

    }
}
/*
Some important points of Set Interface in java
Capacity is the number of arrays bucket in HashTable , the default capacity of hashset is 16 and
load factor in hashtable is the growth of table size or number of buckets increasing upon
default capacity filled full

Collision in HashSet -> like two object have same hashcode so theres a feature every bucket consists linked list
object gets added in that list

 */
