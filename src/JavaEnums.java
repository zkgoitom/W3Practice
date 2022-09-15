import java.util.logging.Level;

// an enum is a special class that represents a group of constants (unchangeable variables, like final variables)
// to create an enum, use the enum keyword (instead of class or interface) and separate the constants with a comma
// enums is short for enumerations which means "specifically listed"
public enum JavaEnums {
    ENUMS,
    CLASSES,
    INTERFACES
}

class Access {
   // you can also have enums inside a class
    enum Level {
        LOW, // values of an enum are known as constants. they are capital letters and separated by commas
                // They are also fixed (finalized). unlike values of an array which are mutable and which are wrapped with double quotes (except for numbers)
        MEDIUM,
        HIGH
    }
    public static void main(String[] args) {
        // to access enums use dot notation
        // JavaEnums is a type. javaEnums is a reference variable (similar to objects and classes) that points to the element "ENUMS" inside of JavaEnums
        JavaEnums javaEnums = JavaEnums.ENUMS;
        System.out.println(javaEnums);

        // you can only access an enum within that class. So if levels had been in another class, I would get an error
        Level levels = Level.MEDIUM;
        System.out.println(levels);

        // enums are often used in switch statements to check for corresponding values
        switch (levels) {
            case LOW:
                System.out.println("Low Level");
                break;// break keyword inside the block of the case statement stops the loop at the end of the block
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High Level");
                break; // if default is used as the last statement (instead of case) a break is not needed to stop the cycle
        }
        // javaEnums is a placeholder for JavaEnums.ENUMS
        switch (javaEnums) {
            case CLASSES:
                System.out.println("classes");
                break;
            case ENUMS:
                System.out.println("enums");
                break;
            case INTERFACES:
                System.out.println("interfaces");
                break;
            default:
                System.out.println("n/a");
        }

        // the enum type has a values() method, which returns an array of all constants
        for (Level myVar : Level.values()) {
            System.out.println((myVar));
        }
        // syntax-> type of enum, followed by placeholder : Dot notation to access the values() method of enums
        // verses syntax for an array -> type, followed by placeholder : name of array
        for (JavaEnums myvar2 : JavaEnums.values()) {
            System.out.println(myvar2);
        }
    }
}

/* Difference Between Enums and Classes:
-> an enum can (like a class) have attributes and methods
    - the difference is that enum constants are public, static and final (unchangeable, can't be overridden)
-> an enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces)

-> use enums when you have values that you know aren't going to change, like days, colors, deck of cards, etc.
 */