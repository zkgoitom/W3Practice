// variables are only accessible inside the region they are created. This is called scope
public class JavaScope {
    // method scope: variables declared directly inside a method are available anywhere in the method following the line of code in which they were declared
    // same rule of scope applies for block scope. a block of code refers tall of the code between curly braces {}
    // a block of code may exist on its own or it can belong to an if, while, or for statement
            // in the case of for statements, variables declared in the statement itself are also available inside the block's scope (like the commonly used i variable)
    public static void main (String [] args) {
        System.out.println(" code above the variable declaration cannot access variable \n");
        String var = "I am a variable";
        System.out.println(var);
        System.out.println("\n code following the variable declaration can access the variable");
        int a = (var.indexOf("a"));
        System.out.println("\n used indexOf String method to find the index of a int string literal stored in the variable var and it is: " + a);


    }
}
