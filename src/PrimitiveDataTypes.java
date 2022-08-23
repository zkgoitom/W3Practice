// data types are divided into 2 groups: primitive and non-primitive
    // primitive data types: byte, short, int, long, float, double, boolean, char
    // non-primitive data types: String, Array, Classes

// primitive data type specifies the size and type of variable values and has no additional methods
// non-primitive data types are also known as reference types. They are based of a class and hold operations
// in the form of methods and variables that you can use to manipulate the defined data
public class PrimitiveDataTypes {
    public static void main (String [] args) {
        byte byter = 127;
        System.out.println("bytes can store whole numbers from -127 to " + byter);
        short shorter = 32767;
        System.out.println("\n Shorts can store whole numbers from -32,767 to " + shorter);
        int integer = 2147483647;
        System.out.println("\n hi I am an int. I can store whole numbers from -2,147,483,648 to " + integer);
        // for some reason, I can't store the amount of a true long which is much larger than this number. This is more like an int
        // I don't know if this is because of intelliJ or something else
        long longer = 922337203;
        System.out.print("\n longs can store whole number from -9,223,372,036,854,775,808 to " + longer);
        // notice the f at the end of the value declaration. same concept applies with doubles
        float floater = 6.1234567f;
        System.out.println("\n floats can store fractional numbers up to 7 decimal digits like this: " + floater);
        double doubler = 6.12345678912345d;
        System.out.println("\n doubles can store fractional numbers up to 15 decimal digits like this: " + doubler);
        boolean booleans = true;
        System.out.println("\n booleans store false or " + booleans + " values");
        char character = 'c';
        System.out.println("\n char stores a single character like this: " + character);






    }
}
