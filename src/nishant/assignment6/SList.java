package nishant.assignment6;

public class SList<T> {
/*
* Each instance of this class is an element in the linked list
 */
    T data;
    SList next;

    @Override
    public String toString() {
        return String.valueOf(data);
    }

    public SList(T n) {
        data = n;
        next = null;
    }

    public SListIterator iterator(SList list) {
        return new SListIterator(list);
    }
}
