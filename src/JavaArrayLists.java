import java.util.ArrayList; // imports ArrayList class from java.util package
import java.util.Collections;

// the JavaArrayLists class is a resizable array, which can be found in the java.util package
// the difference between an array and an JavaArrayLists, is that the size of an array cannot be modified
        // to add/remove elements to/from and array, you have to create a new one
        // elements can be added and removed from an JavaArrayLists whenever you want and syntax is slightly different
public class JavaArrayLists {
    // syntax of an array wd bd String [] arr = {""};
   public static void main(String [] args) {
       ArrayList<String> aL = new ArrayList<String>(); // creates an ArrayList object of type String

       aL.add("String");
       aL.add("Array");
       aL.add("ArrayList");
       aL.add("Math");
       // why do println and print output the same way for ArrayLists
       // although print does not seem to affect how items of an ArrayList print out, it does affect the next line.
       // the next output will print on the same line as the print statement (immediately after with no spacing)
       System.out.println("ArrayList printlined: " + aL);
       System.out.print("ArrayList print: " +  aL);

       // get() is used to access an element. pass the index number of item in the list to its parameter
       System.out.println("\n item gotten from index of ArrayList: " + aL.get(0));

       System.out.println("\n");
       // set() is used to modify  an element. pass the indext number of the item in the list to the 1st param
       // pass the change (according to the type) to the 2nd param
       //NOTE: printing it out like this will print out the item before the modification
       System.out.println("printed during set(): " + aL.set(2, "other"));
       System.out.println("after set(): " + aL.get(2));

       System.out.println("\n");
       // prints out item that will be removed
       System.out.println("printed during remove(): " + aL.remove(2));
       System.out.println("printed after remove(): " + aL.get(2));

       System.out.println("\nsize of ArrayList (aka amount of elements): " + aL.size());

       // loop through elements using a for loop using size() to determine how many times the loop should run

       // i defines index. sets it to 0; sets the condition for looping. continue looping as long as i, the index position
       // is less than the size of the array list (the size is 3, so looping will cease once index position reaches 3;
       // i++ means increment the index position as long as the condition is true
       for (int i = 0; i < aL.size(); i++) {

           System.out.println(aL.get(i)); // as long as the condition defined in for-loop statement is true,
                                            // get each item of list according to i (variable set for index)
       }

       System.out.println("\nlooping ArrayList using for-each loop");
       // use for-each (enhanced for loop) which reduces syntax and makes looping via arrays simpler

       // no need to provide a condition. i is for index position : al is the name of the ArrayList
       for (String i : aL) { // notice i is of type String, whereas in a regular for loop, it would be of type int
           System.out.println(i); // no need for get(). wouldn't work with get bc i is of type String this time
                                    // so i is most likely not the index position as in with a regular for-loop, but the actual element at each index position
       }
    // sorts ArrayList in ascending alphabetical order
       Collections.sort(aL);
       for (String i : aL) {
           System.out.println(i);
       }
   }
}
