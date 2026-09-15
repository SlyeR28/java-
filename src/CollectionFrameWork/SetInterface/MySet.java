package CollectionFrameWork.SetInterface;

public interface MySet <T> extends Iterable<T>{

    boolean add(T item);
    boolean remove(T item);
    boolean contains(T item);
    int size();
    boolean isEmpty();

}
