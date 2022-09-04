// constructors are special methods that are used to initialize objects
// constructors can also be used to set initial values for object attributes
public class Constructors {
    int value; // class attribute is declared
    String value1;

    // notice the Constructor has the exact same name as the class and follows the same naming convention
    // unlike other methods, the first letter is also capitalized just like a class

    //public Constructors() {
        //int value = 5; // initial (first) value of object attribute is set here
                        // had this been an ordinary method, could you still set the initial value like this or
                        // would you have to use dot notation and object creation (i.e., myObj.value = 5) to access and  set (or should I say) modify the value
    //}

    public Constructors(int param, String param2) { // constructors can also have parameters which are used to initialize attributes
                                            // initialize an attribute, means to set an initial value
                                            // you can have as many parameters as you want
        value = param;  // notice variable type does not need to be defined for either of the constructor variables (int, String)
        value1 = param2;  // the type is declared in the class above however
    }

// if you don't set up a constructor, the jvm or the compiler will appoint you one. That's why I didn't need to set a constructor in previous classes
    public static void main(String [] args) {
        //Constructors myObj = new Constructors(); // object creation. constructor is invoked following new keyword
        //System.out.println(myObj.value); // use the object to access the attribute
        Constructors myObj1 = new Constructors(2002, "Lexus"); // passed a value of 5 to the invoked constructor which will set the value of the attribute to what was passed (5)
        System.out.println(myObj1.value + " " + myObj1.value1);

    }

}
/*
NOTE
Constructor name must match class name
Constructor does not have a return type (i.e. void)
Constructor is called when the object is created
all classes have constructors by default
If you do not make a constructor, Java will create one for you
        however, if you don't create a constructor yourself, you will not be able to set initial values for object attributes

 */