
// information can be passed to methods as arguments to their parameters. arguments are like values and parameters like variables
// you pass the argument to the method when the method is invoked
// parameters are specified after the method name, inside the parentheses
// you can add as many parameters just separate them with commas
public class MethodParameters {
    static void myMethod(String fName) { // the parameter fName of type String is declared inside the parentheses of the method
        System.out.println(fName + " Schlong");

    }
    static void myMethod1(String lName, int age){ // you can have multiple parameters
        System.out.println(lName + " is " + age);
    }
    // the void keyword is used to indicate that a method should not return a value
    // however if you ant the method to return a value specify it according to its data type (primitive or reference type) and the return keyword inside the method
    public static int myMethod2(int x) {  // int (before the method name) replaces void and is a (primitive) integer data type
        return (5 + x); // return is like a place-holder for the method
    }
    // returns the sum of 2 parameters
    public static int myMethod3(int x, int y) {
       return x - y;
    }
    // using if..else statements inside methods is common
    public static void checkAge(int age) {
        // block inside if executes, if condition is true. if the argument passed to the age parameter is 17 or less
        if (age < 18) {
            System.out.println("access denied you are only: " + age + " must be 18 or older");
        } else {
            System.out.println("access granted");
        }
    }

    public static void main (String [] args) {

        myMethod("Brandon"); // String argument Brandon is passed to myMethod's parameter
        myMethod("Jared");

        System.out.println("\n");
        myMethod1("Pinkerton", 32); // there must be an argument for each according parameter
        myMethod1("Williams", 26);

        System.out.println("\n");
        System.out.println(myMethod2(2));

        System.out.println("\n");  // must put parentheses around Math.random() like this: (Math.random() * 5) or it will spit up a 0 instead of procuring a random number
        int z = myMethod3((int) (Math.random() * 5), 1); // use a variable to store the result for easier reading and maintenance
        System.out.println(z);

        System.out.println("\n");
        checkAge(17); // 17 is less than 18 so if condition test passes and results to true, executing if block
        checkAge(18); // 18 is equal to 18 so if condition test fails and results to false, executing else block
        checkAge(19); // 19 is greater than 18 so if condition test fails and results to false, executing else block

    }
}
