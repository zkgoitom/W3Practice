// Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects
// Wrapper classes and their primitives:
// byte-> Byte, short -> Short, int -> Integer, long-> Long, float-> Float, double-> Double, boolean-> Boolean, char-> Character
// Sometimes you have to use Wrapper classes (i.e., with Collection objects, such as ArrayList, where primitive types cannot be used
public class WrapperClasses {
    public static void main(String [] args) {
        // to create a wrapper object, use the wrapper class instead of the primitive type
        Integer myInt = 12; //now that you're working with an object, you can use certain methods to get info about the specific object
        Double myDouble = 22.5;
        Character myChar = 'X';
        // to get the value, print the object
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // intValue() gets the value of the associated wrapper object
        System.out.println(myInt.intValue());

        // toString() is used to convert wrapper objects to strings
        String myString = myInt.toString(); // converts value assigned to object myInt to a String, so from 12 to "12" and assign it to variable myString
        System.out.println(myString);
        // length() prints the length of the String value of the String object
        System.out.println(myString.length()); // now that the type of object has been converted to a String we can use String methods like length()
    }
}
