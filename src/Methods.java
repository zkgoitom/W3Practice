// a block of code which only runs when it is called. methods contain parameters, which are like variables and
// you can pass them values known as arguments
// methods used to perform certain functions are known as functions
// Why use methods? to reuse code: by defining the code and using it multiple times
public class Methods {
    public static void main (String [] args) {
        // to call a method write method's name followed by 2 parentheses and a semicolon
        myMethod(); // because this method is static you don't need to use an object to call it
                    // had it not been static you'd have to use dot notation (after creating and instance of the class) like this method.myMethod()

        myMethod(); // methods can be invoked multiple times
    }
    // a method must be declared inside a class. defined by the name of the method followed by parentheses
    // java provides pre-defined methods such as Sout.println, but you can also create your own methods
    // static means the method belongs to the class rather than an object of the class
    // void means the method does not have a return value
    static void myMethod () {
        System.out.println("I just got executed");
    }
}

