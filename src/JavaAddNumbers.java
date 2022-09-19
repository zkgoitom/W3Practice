import java.util.Scanner;

public class JavaAddNumbers {
    static int x = 5;
    static int y = 10;
    static int z = y + x;

    public static void main(String [] args) {
        // variables had to be static to access/use/execute in main()
        // "non-static variable cannot be referenced from static context
        System.out.println(z);

        // add 2 numbers with user input

        // declare 3 variables of type int
        int a, b, c;

        // create scanner object
        Scanner myScanner = new Scanner(System.in); //

        // print input prompt to stdout requesting user to type a number for input
        System.out.println("Type a number: ");

        // read user input. scanner object uses nextInt() to collect user input
        // 1st number input given by user is stored in this variable
        a = myScanner.nextInt();

        System.out.println("Type another number");

        // 2nd number input typed in by the user is stored in this variable
        // stdin becomes available on the terminal for user to provide input
        b = myScanner.nextInt();

        // numbers stored in variables are added and sum is stored in this variable
        c = a + b;

        // prints to stdout the variable holding the value of the sum of the numbers input by the user
        System.out.println("sum of numbers: " + c);
    }
}
