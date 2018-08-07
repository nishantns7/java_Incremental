package nishant.assignment6;

public class MainClass {
/*
* Demonstrates a singly-linked list without using any java libraries
* Demonstrates adding and removing of elements in the linked list
 */
    public static void main(String[] args) {

        SList list = new SList(0);
        SListIterator iterator = list.iterator(list);           //Initialization of first node with value 0
        iterator.addElement(1);                             //Insertion of elements
        iterator.addElement(2);
        iterator.addElement(3);
        iterator.addElement(4);
        iterator.addElement('c');
        System.out.println("List after insertion of 6 elements");
        for(SList i = iterator.head ; i != null; i = i.next)
            System.out.print(i + " ");                          //Printing the elements of the list after insertion
        System.out.println();
        iterator.removeElement(1);                          //Removing a middle element
        iterator.removeElement(4);                          //Removing the tail element
        iterator.removeElement(0);                          //Removing the head element
        iterator.removeElement(2);
        iterator.removeElement(3);
        iterator.removeElement('c');
        iterator.addElement("Hello World!");                             //Inserting an element after deleting all elements
        System.out.println("List after 6 deletions and 1 insertion");
        for(SList i = iterator.head ; i != null; i = i.next)
            System.out.print(i + " ");                          //Printing the final list
        System.out.println();
    }
}
