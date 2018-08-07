package nishant.assignment6;

public class SListIterator<T> {
/*
* Manipulates an existing linked list
* addElement() method inserts elements into the list
* removeElement() method removes the specified element from the list
 */
    SList tail;
    SList head;
    SList list;

    public SListIterator(SList list) {
        this.list = list;
        head = list;
        tail = list;
    }

    public void addElement(T n) {
        SList element = new SList(n);
        if(head == null) {
            head = element;
            tail = element;
        }
        else {
            tail.next = element;
            tail = element;
        }
    }

    public void removeElement(T n) {
        if(head.toString().equalsIgnoreCase(tail.toString())) {
            head = null;
            tail = null;
            return;
        }
        for(SList i = head; i.next != null; i = i.next) {
            if(head.toString().equalsIgnoreCase(String.valueOf(n))) {
                head = head.next;
                break;
            }
            if(i.next.toString().equalsIgnoreCase(String.valueOf(n))) {
                if(i.next == tail) {
                    tail = i;
                    tail.next = null;
                    break;
                }
                else {
                    i.next = i.next.next;
                    break;
                }
            }
        }
    }
}
