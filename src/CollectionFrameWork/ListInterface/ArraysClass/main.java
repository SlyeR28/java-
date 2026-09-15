package CollectionFrameWork.ListInterface.ArraysClass;

public class main {
    public static void main(String[] args) throws InterruptedException {
        multithreadArrayList ls = new multithreadArrayList();
        Thread t1 = new Thread(ls);
        Thread t2 = new Thread(ls);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(ls.getCount());
    }
}
