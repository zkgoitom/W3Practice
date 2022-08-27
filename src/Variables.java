// variables are temporary placeholders for values
// in Java, there are different types of variables. the type of the variable must be declared before the variable name
// types include String, int, float, char, boolean, etc.
public class Variables {
    public static void main (String [] args) {
        String s = "String";
        System.out.println("this is a " + s + " variable. it helps store text that can be displayed \n");
        String s1;
        s1 = "declared first then later assigned a value \n";
        System.out.println("this variable was " + s1);
        int count = 1;
        System.out.println("count variable before reassignment is: " + count + "\n");
        count = 2;
        System.out.println("count variable after reassignment is: " + count + "\n");

        final int fin = 3;
        System.out.println("the final keyword was used during this variable's declaration which holds this number: " + fin + "\n");

        System.out.println("now that variable will be fixed with a value of " + fin + " forever");



    }
}
