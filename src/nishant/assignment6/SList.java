package nishant.assignment6;

public class SList<T> {
/*
* Each instance of this class is a linked list
 */
    Link head;

    @Override
    public String toString() {
        String list = "";
        for(Link i = head ; i != null; i = i.next)
            list += i + " ";
        return list;
    }

    public SList(T data) {
        head = new Link(data);
    }

    public SListIterator iterator() {
        return new SListIterator(this);
    }
}
