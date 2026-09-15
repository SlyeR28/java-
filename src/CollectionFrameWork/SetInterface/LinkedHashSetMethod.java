package CollectionFrameWork.SetInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetMethod {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();


        for (int i = 0; i < 20; i++) {
            set.add(i*10);
        }


        Iterator<Integer> lit = set.iterator();
        while (lit.hasNext()){
            System.out.println(lit.next());
        }
//        System.out.println(new LinkedHashSet<>() instanceof HashSet); // true

    }
    /*
    hashSet -> clearly does not maintain interstion order
    0
160
130
100
70
40
10
170
140
110
80
50
20
180
150
120
90
60
30
190

linkedHashSet
0
10
20
30
40
50
60
70
80
90
100
110
120
130
140
150
160
170
180
190
     */
}
