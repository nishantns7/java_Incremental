package nishant.assignment6;

public class SList {
/*
* Each instance of this class is an element in the linked list
 */
    int number;
    SList next;

    @Override
    public String toString() {
        return Integer.toString(number);
    }

    public SList(int n) {
        number = n;
        next = null;
    }

    public SList() {
        number = 0;
        next = null;
    }

    public SListIterator iterator(SList list) {
        return new SListIterator(list);
    }
}
