// a lambda expression is a short block of code which takes in parameters and returns a value
// similar to methods, but they do not need a name and can be implemented right into the body
//Syntax:
        // 1.) parameter -> expression  2.) (parameter 1, parameter 2) -> expression  3.) (parameter 1, parameter 2) -> {code block}
// expressions are limited they have to return a value and canNOT contain variables, assignments or statements such as if or for
// in order to do more complex operations, a code block can be used with curly braces
// if the lambda expression need to return a value then the code block should have a return statement

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExpressions {
    public static void main (String [] args) {
        ArrayList<Integer> num = new ArrayList<Integer>();

        num.add(5);
        num.add(9);
        num.add(8);
        num.add(1);


        // forEach() is a method of JavaArrayLists. the lambda expression is used in the forEach method to print every element in the list
        num.forEach( (n) -> { System.out.println(n); } ); // lambda expressions are usually passed as parameters to a function.
                                                            // as seen in this example, the lambda expression passed to the ForEach() method's parameter by going into forEach()'s parentheses

        System.out.println("\n");
        Collections.sort(num); // sorting the elements of the JavaArrayLists in ascending order. before sorting, JavaArrayLists elements retain the order, that they were inserted (added) into the list
        num.forEach( (n) -> {
            System.out.print(n); } );

        System.out.println("\n");
        Collections.sort(num, Collections.reverseOrder()); // reverse sorting the order of the elements in the JavaArrayLists
        num.forEach( (n) -> {   // using a lambda expression in the ArrayLists's forEach() to print every element in the list
            System.out.print(n);
        });

        System.out.println("\n");
        // lambda expressions can be stored in variables, if the variable's type is an interface which has only one method
        // the lambda expression should have the same number of parameters and the same return type as that method
        // Consumer is on of many of java interfaces (used by Lists), which has only one method. ???also known as functional interfaces???
        Consumer<Integer> method = (n) -> { // method is a variable of type Consumer<Integer> interface. the lambda expression is assigned as a value to method
            System.out.print(n) ;};
        num.forEach(method); // method (which holds the lambda expression, with a parameter of n that prints out n) is passed to forEach() parameter
                                // forEach() will use the operations in method to print out every element in the list


        System.out.println("\n");
        // lambda expression is assigned to exclaim variable of type StringFunction interface
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("hello", exclaim); // printFormatted() is passed exclaim to its parameter. exclaim is of type SingleFunction interface (aka a functional interface) which posses a single-method named run()
        printFormatted("hello", ask);


    }
    // to use a lambda expression in a method, the method should have a parameter with a single-method interface as its type
    // calling the interface's method will call run the lambda expression

    interface StringFunction { // this is actually an interface declaration. it has 1 method (making it a functional interface
                                // angle brackets are not needed for declaration of functional interfaces???
        String run (String str); // this is the method declaration of the functional interface StringFunction. Brackets are not needed for methods?
    }

    // is this the method which takes the lambda expression as a parameter? i think it is cuz when invoked in main(), it takes exclaim, a variable
    // which holds a lambda expression operation as a value
    public static void printFormatted (String str, StringFunction format) { // StringFunction interface is passed to this method's parameter named format. now format possess StringFunction interface as a value
        String result = format.run(str); // here format is a reference variable which points to StringFunction Interface, hence why we can use dot notation to access the run method declared in its body
                                            // str variable of type String as declared in the parameter of printFormatted() is passed to run()'s parameter
                                            // format.run(str) is assigned to result
        System.out.println(result);// result is printed to standard output
    }

}
