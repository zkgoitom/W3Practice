// methods are declared within a class and are used to perform certain action
// public vs static
// static is a non-access modifier that allows that make data members belong to class rather than an object
// public is an access modifier that makes a class/data members accessible everywhere, outside the class and outside a package
//?? what if the method is both static and public??

public class ClassMethods {
    public static void main (String [] args) {
        myMethod(); // here the method is called . notice it is called without the need of an object. that is bc it is a static method
                    // static methods belong to the class. You don't need an object to access them

        myStaticMethod(); // static methods Does not need an object to be accessed (invoked)
        ClassMethods.myStaticMethod(); // can also use this syntax to invoke static methods

        ClassMethods classMethods = new ClassMethods(); // object creation
        classMethods.myPublicMethod();  // public method needs an object to be accessed (invoked)
    }

    public static void myMethod () {
        System.out.println("The name is Method... Public Static Method"); // this is the action of this method. it will print out this line when it is called
    }

    static void myStaticMethod() {
        System.out.println("the name is Method... Static Method");
    }

    public void myPublicMethod() {
        System.out.println("The name is Method... Public Method");
    }
}
