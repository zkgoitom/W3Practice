/* when executing java code, different errors can occur:
    > coding errors made by the programmer, errors due to wrong input, or other unforeseeable things
-> when an error occurs, java will normally stop and generate an error message
    > the technical term for this is "java will throw an exception" ("throw an error")

Try and Catch Statements:
-> keywords that come in pairs
-> if an error occurs, we can try...catch to catch the error and execute some code to handle it
    > try - allows you to define a block of code to be tested for errors while it is being executed
    > catch - allows you to define a block of code to be executed, if an error occurs in the try block
 */
public class JavaExceptions {
    public static void main(String [] args) {
        try { // try block possesses code to try (tested for errors, while it is being executed)
            int [] myNumb = {1, 2, 3};
            System.out.println(myNumb[10]); // without catch try and catch statement, java wd generate an IndextOutOfBoundsException
        } catch (Exception e) { // what is Exception e? e is variable? placeholder? Exception is the type of  variable?
            System.out.println("normally wd generate an IndexOutOfBounds error, but try statement tested a block of code and " +
                    "catch clause handled error with this message instead");
        } finally {
            System.out.println("Finally statement lets you execute code, after try...catch, regardless of result" +
                    "catch will only execute if an exception is thrown after testing try block ");
        }

        checkAge(15); // since this meets the condition of the if statement, the block of code which holds the throw new
                        // statement will execute
    }
    // the throw statement allows you to create a custom error
    // the throw statement is used together with an exception type:
    // ArithmethicException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc.
    static void checkAge(int age) { // void (no return), checkAge method with integer (type) parameter
        if (age < 18) { // value of age variable will be given to the parameter, as an argument, when method is invoked
            // throw statement is used together with ArithmethicException exception type to create a custom error
            throw new ArithmeticException("Access denied - you must be at least 18 years old"); // custom error message is inserted into ArithmethicException parentheses
        } else { // if condition above is not met, then the custom exception (created using throw new keyword) will not be thrown (bc it is in the if block and if block is not executed
            System.out.println("Access granted - you are old enough!"); // the else statement block will execute if, if-block condition is not true
        }
    }

}
