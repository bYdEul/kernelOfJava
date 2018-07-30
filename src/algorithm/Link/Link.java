package algorithm.Link;

public interface Link {
    void add(Object obj);
    boolean remove(int index);
    boolean contains(Object obj);
    int indexOf(Object obj);
    boolean set(int index, Object obj);
    Object get(int index);
    int Length();
    void clear();
    Object[] toArray();
    void printLink();
}
