// data abstraction is the process of hiding certain details and showing only essential information to the user
// can be achieved with either abstract classes or interfaces
// the abstract keyword is a non-access modifier used for classes and methods
// Abstract class is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class)
// abstract method can only be used in an abstract class, and it does not have a body. the body is provided by the subclass (inherited from)
// an abstract class can have both abstract and regular methods
abstract class Abstraction {
    // an abstract method in an abstract class. an abstract class must have an abstract method
    public abstract void abstractMethod(); // abstract methods don't have a body, so you don't use {} curly braces when assembling an abstract method
    // a regular method in an abstract class. an abstract class can also have regular methods
    public void regularMethod () {
        System.out.println("an abstract class with an abstract method and a regular method. no body on the abstract method. this is the regular method");
    }
}

/*it is not possible to create an object form an abstract class
to access the abstract class, it must be inherited from another class
 */

// subclass inherits from abstract class
class InheritsFromAbstractClass extends Abstraction {
    // override the abstract method inherited from the abstract class. Give the method a body
    @Override
    public void abstractMethod() {
        System.out.println("This method was inherited from an abstract class. It is given a body here");
    }
}

class Compete {
    public static void main(String [] args) {
        InheritsFromAbstractClass objOfInheritorOfAbstract = new InheritsFromAbstractClass(); // object of the class that inherited from abstract class
        objOfInheritorOfAbstract.abstractMethod(); // the inherited abstract method invoked
        objOfInheritorOfAbstract.regularMethod(); // the regular method from the abstract class. it was not inherited
                                                // ??so we are able to access a method from the class the abstract parent class with an object of a method from the child class
    }
}

/* Use abstract classes to hide certain details and only show ihe important details of an object.

abstract can also be achieved with interfaces
 */