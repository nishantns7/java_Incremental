package nishant.assignment6;

public class SListIterator<T> {
/*
* Manipulates an existing linked list
* addElement() method inserts elements into the list
* removeElement() method removes the specified element from the list
 */
    Link head;
    SList list;

    public SListIterator(SList list) {
        this.list = list;
        head = list.head;
    }

    public void addElement(T n) {
        Link element = new Link(n);
        if(head == null) {
            head = element;
        }
        else {
            for(Link i = list.head; i != null; i = i.next) {
                if(i.next == null) {
                    i.next = element;
                    break;
                }
            }
        }
    }

    public void removeElement(T n) throws EmptyListException {
        if(head == null) {
            throw new EmptyListException("The list is already empty.");
        }
        if(head.data == n && head.next == null) {
            head = null;
            list.head = null;
            return;
        }
        for(Link i = head; i.next != null; i = i.next) {
            if(head.data == n) {
                head = head.next;
                list.head = head.next;
                break;
            }
            if(i.next.data == n) {
                i.next = i.next.next;
                break;
            }
        }
    }
}
