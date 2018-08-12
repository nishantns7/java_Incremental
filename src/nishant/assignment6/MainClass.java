package nishant.assignment6;

public class MainClass {
/*
* Demonstrates a singly-linked list without using any java libraries
* Demonstrates adding and removing of elements in the linked list
 */
    public static void main(String[] args) throws EmptyListException {

        SList list = new SList<Integer>(0);
        SListIterator iterator = list.iterator();           //Initialization of first node with value 0
        iterator.addElement(1);                             //Insertion of elements
        iterator.addElement(2);
        iterator.addElement(3);
        iterator.addElement(4);
        System.out.println("List after insertion of 5 elements");
        System.out.println(list);                          //Printing the elements of the list after insertion
        iterator.removeElement(1);                          //Removing a middle element
        iterator.removeElement(4);                          //Removing the tail element
        iterator.removeElement(0);                          //Removing the head element
        iterator.removeElement(2);
        iterator.removeElement(3);
        System.out.println("List after 5 deletions");
        System.out.println(list);
        iterator.removeElement(3);                      //Removing from an already empty list
    }
}
