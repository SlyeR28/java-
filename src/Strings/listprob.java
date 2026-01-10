package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listprob {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("a", "b", "c"));
        List<String> list = Arrays.asList("a", "b", "c");
        for (String s: strings){
            strings.remove(s);
        }
        // throw concurrent modification  exception
         strings.remove("a");
        System.out.println(strings);
        list.remove(1);
        System.out.println(list);
    }
}
