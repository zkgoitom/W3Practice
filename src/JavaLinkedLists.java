import java.util.LinkedList;

/* LinkedList class is a collection which can contain many objects of the same type, just like ArrayList
-> LinkedList class has all the same methods as the ArrayList class because they both implement the List interface
    - you can add, change, remove, and clear the list in the same way
-> However, while the ArrayList class and the LinkedList class can be used in the same way, they are built differently
    - ArrayList:
        > the ArrayList class has a regular array inside it
        > when an element is added, it is placed in an array
        > if the array is not big enough, a new, larger array is created to replace the one and the old one is removed
    - LinkedList:
        > the LinkedList stores its items in "containers"
        > the list has a link to the 1st container and each container has a link to the next container in the list
        > to add an element to the list, the element is placed into a new container and that container is linked to one
            of the other containers in the list
-> use an ArrayList for storing and accessing data and LinkedList to manipulate data

-> for many cases, the ArrayList is more efficient as it is common to need access to random items in the list, but the
LinkedList provides several methods to do certain operations more efficiently:
    > addFirst() - adds an item to the beginning of the list
    > addLast() - adds an item to the end of the list
    > removeFirst() - removes an item from the beginning of the list
    > removeLast() - removes an item from the end of the list
    > getFirst() - get the item at the beginning of the list
    > getLast() - get the item at the end of the list

 */
public class JavaLinkedLists {
    public static void main(String [] args) {
        LinkedList<Integer> num = new LinkedList<Integer>();
        num.add(1);
        num.add(23);
        num.add(22);
        num.add(12);

        System.out.println(num);
    }
}
