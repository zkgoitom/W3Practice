// java Math class has many methods for performing mathematical tasks on numbers
public class JavaMath {
    public static void main (String [] args) {
        // finds the highest value of x and y
        System.out.println(Math.max(5, 10));
        // finds the lowest value of x and y
        System.out.println(Math.min(5, -10));
        // returns the square root of x
        System.out.println(Math.sqrt(64));
        // absolute means positive. returns the positive value of x
        System.out.println(Math.abs(-4.6));
        // passing abs method to the parameter of min method
        System.out.println(Math.min(5, Math.abs(-10)));
        // returns a random number between 0.0 (inclusive) and 1.0 (exclusive)
        System.out.println(Math.random());
        // to gain more control between the inclusive and exclusive values multiply by the outer range you wish the range to be in between
        System.out.println(Math.random() * 101); // increases range to 0 through 100
        // the (int) here is similar to the syntax of narrowing (manual) casting. is a conversion taking place here ?
        // when assigning the value of the random number returned, to a variable, is this always the syntax to adhere to?
        int randomNum = (int)(Math.random() * 20);
        System.out.println(randomNum);
        // ahh so narrowing casting was taking place above. random() returns a double and that number was converted to an int when assigned to randomNum
        // below no conversion is taking place so rNum is of type double which is a floating type (fractional) number (primitive)
        double rNum = Math.random() *10;
        System.out.println(rNum);
    }
}
