import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

// an iterator is an object that can be used to loop through collections, like ArrayList and Hashset
// it is called an iterator bc iterating is the technical term for looping
// to use Iterator, you must import it from the java.util package
public class JavaIterators {
    public static void main(String [] args) {

        // make a LinkedList collection
        LinkedList<String> dcCom = new LinkedList<>(); //make LinkedList object
        dcCom.add("batman");
        dcCom.add("superman");
        dcCom.add("wonderwoman");
        dcCom.add("green lantern");
        dcCom.addFirst("Martian Man");

        // get the iterator
        // initialize a variable of type Iterator<String> defined as the list (to iterate) and the iterator() method
        Iterator<String> it = dcCom.iterator();
        // dcCom.addFirst("Martian Man"); // ConcurrentModificationException exception is generated

        // print the first item
        System.out.println(it.next()); // seems like next() iterates to the next element
        // in this case the next item is the first item in the LinkedList

        //dcCom.addFirst("Martian Man"); -> generates an error when here after iteration has taken place, but when executed before iterated or next(), no error is generated

        // loop through a collection using hasNext() and next() methods of Iterator
        while (it.hasNext()) { // I think this method checks if there is a next element available in the list
            // thus the condition is set as continue looping as long as there is a next element
            System.out.println(it.next()); // next() goes to the next element in the list
        }
        //dcCom.addLast("Martian Man Hunter");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(90);
        numbers.add((int)(Math.random() * 15));
        numbers.add((int)(Math.random() * 100));
        numbers.add(1);

        Iterator<Integer> iterate = numbers.iterator(); // create an object of Iterator named iterate which is posses the ArrayList with an iterator method
        while(iterate.hasNext()) { // while loop set to loop as long as there is an element at the next position of the index
           // i is basically the integer at the next position
            Integer i = iterate.next(); // defines i of type Integer with a list that moves to the next iteration in the list
            if(i < 5) { // if condition within the while loop block
                            // condition says if, i, the placeholder for each integer (element) at each position of the index is less
                            // than the integer 5, then execute the block of code
                iterate.remove(); // the block of code removes that integer (according to the if statement, less than 5)
            }


        }
        // prints the numbers ArrayList after the while loop has manipulated it based on a condition. the list will reflect any
        // actions that occurred within the while loop statement & block
        System.out.println(numbers);


    }
}
// NOTE: trying to remove items using a for-loop or a for-each loop would not work correctly bc the collection