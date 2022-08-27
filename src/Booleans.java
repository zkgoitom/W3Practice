// boolean is a data type that can only take 1 of 2 values: true or false, yes or no, on or off
public class Booleans {
    public static void main (String [] args) {
        boolean isJavaFun = true; // boolean type is cleared with the boolean keyword
        boolean isPythonASnake = false; // only takes true or false values
        System.out.println(isJavaFun);
        System.out.println(isPythonASnake);

        // more common to use boolean values in conditional testing with boolean expressions
            // a java expression that returns a Boolean value (ture, or false)
        // you can use comparator operators like > to find out if an expression (or a variable) is true
        double rNumb = Math.random() * 30;
        int rNumb1 = (int) (Math.random() * 30);
        System.out.println(rNumb > rNumb1);

        System.out.println(rNumb);
        System.out.println(rNumb1);

        System.out.println(rNumb == rNumb1);


    }
}
