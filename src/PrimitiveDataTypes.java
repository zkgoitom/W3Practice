// data types are divided into 2 groups: primitive and non-primitive
    // primitive data types: byte, short, int, long, float, double, boolean, char
    // non-primitive data types: String, Array, Classes

// primitive data type specifies the size and type of variable values and has no additional methods
// non-primitive data types are also known as reference types. They are based of a class and hold operations
// in the form of methods and variables that you can use to manipulate the defined data

// Primitive Data types have integer types and floating point types
    // integer types are for storing whole numbers. The order of these types according to size are byte, short, int, long
    // floating types are for storing fractional (decimal) numbers. the order of these types according to size are float and double
public class PrimitiveDataTypes {
    public static void main (String [] args) {
        // often used to save memory bc it's only 1 byte
        byte byter = 127;
        System.out.println("bytes can store whole numbers from -127 to " + byter);
        // large numbers Are not separated by commas. using commas will invoke an error
        short shorter = 32767;
        System.out.println("\n Shorts can store whole numbers from -32,767 to " + shorter);
        // the most preferred for whole numbers
        int integer = 2147483647;
        System.out.println("\n hi I am an int. I can store whole numbers from -2,147,483,648 to " + integer);
        // used when int is not long enough. value must end with and L
        long longer = 922337203685477580L;
        System.out.print("\n longs can store whole number from -9,223,372,036,854,775,808 to " + longer);

        System.out.println("\n");
        // value ends with f. for fractional numbers
        float floater = 6.1234567f;
        System.out.println("\n floats can store fractional numbers up to 7 decimal digits like this: " + floater);
        // value ends with d. more precise than a float bc it can contain more decimal points. so it is safer for calculations
        double doubler = 6.12345678912345d;
        System.out.println("\n doubles can store fractional numbers up to 15 decimal digits like this: " + doubler);
        boolean booleans = true;
        System.out.println("\n booleans store false or " + booleans + " values");
        char character = 'c';
        System.out.println("\n char stores a single character like this: " + character);


        // the order according to size ov all primitive data types: boolean(1 bit), byte (1 byte), short or char (2bytes),
        // int or float (4 bytes), long or double (8 bytes)

        // the most commonly used numbers data types are int and double
        // floats and doubles can use power of
        float powerOfFloat = 35e3f;
        System.out.println("\n float's can use exponents in their values by using \'e\' before the exponent." +
                " This value was made by using to the power of 4: " + powerOfFloat);
        double powerOfDouble = 12E4d;
        System.out.println("\n doubles can use exponents in their values to by using \'E\' before the exponent." +
                " This value was made by using to the power of 3: " + powerOfDouble);





    }
}
