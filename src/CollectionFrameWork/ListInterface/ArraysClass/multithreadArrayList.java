package CollectionFrameWork.ListInterface.ArraysClass;

import java.util.ArrayList;
import java.util.List;

public class multithreadArrayList implements Runnable {

    private int count;
    List<Integer> list = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            list.add(i);
            count++;
        }
    }

    public int getCount() {
        return count;
    }
}
