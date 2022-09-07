public class FinalNonAccessModifier {
    final int x = 10;
    final double PI = 3.14;

    public static void main (String [] args) {
        FinalNonAccessModifier myObj = new FinalNonAccessModifier();
        // myObj.x = 15; // will generate an error bc final attributes and methods cannot be overridden/modified
        System.out.println(myObj.x); // error says-> java: cannot assign a value to a final variable
    }
}
