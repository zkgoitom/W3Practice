import java.util.Scanner; // imports the Scanner class

// the scanner class is used to get user input, it is found in the java.util package
// to use the Scanner class, create an object of the class and use any of the available methods found in Scanner class
// nextLine() is used to read Strings
public class UserInput {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in); // creates a scanner object. notice System.in is passed to the constructor

        // prints to stdout (to the cmdline)
        System.out.println("Enter username: ");
        System.out.println("enter age: ");
        System.out.println("enter salary: ");

        //prints to stdin (from the cmdline)
        String username = input.nextLine(); // reads user input

        System.out.println("username: " + username); // outputs user



        // for numerical input
        int age = input.nextInt();

        System.out.println("age: " + age);

        double salary = input.nextDouble();

        System.out.println("salary: " + salary);

    }
}

/* Input Types:
-> nextLine() - reads a String value from the user
-> nextBoolean() - reads a boolean value from the user
-> nextDouble() - reads a double value from the user
-> nextFloat() - reads a float value
-> nextInt() - reads an int
-> nextLong() - reads a long
-> nextShort() - reads a short
 */