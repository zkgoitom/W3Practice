// another way to achieve abstraction is through an interface
// an interface is a completely "abstract class" that is used to group r/t methods with empty bodies
public interface JavInterfaces {
    // interface method does not have a body
    public void abstractMethodOfInterface(); // curly brackets are not used on abstract methods
    public void abstractMethodOfInterface2(); // another abstract method. interfaces unlike abstract classes can only have abstract methods
}

interface JavaInterface2 {
    public void abstractMethodFromThe2ndInterface();
}

/* to access the interface methods, the interface must be implemented (kinda like inherited) by another class with the "implements"
keyword (instead of extends)

the body of the interface method is provided by the implement class
 */

// this class which implements the interface must either be declared abstract or it must inherit the abstract methods of the interface
class Implementor implements JavInterfaces, JavaInterface2 {
// you can add the body of the abstract method here
    @Override
    public void abstractMethodOfInterface() { // since it can have a body, the abstract method now must contain curly brackets
        System.out.println("this method was inherited from the interface. here it is given a body");
    }

    @Override
    public void abstractMethodOfInterface2() {
        System.out.println("this is another abstract method inherited from the interface. an interface can only have abstract methods." +
                "Interfaces are completely abstract"); // notice 2 indentations are used here
    }
//
    @Override
    public void abstractMethodFromThe2ndInterface() {
        System.out.println("this abstract method is in inherited from interface 2");
    }
}
// class with main()
class Resume {
    public static void main() {
        Implementor objectOfImplementor = new Implementor(); // object of the class that implemented the interface and inherited its absract methods
        objectOfImplementor.abstractMethodOfInterface(); // abstract methods that were given a body in the class that implemented interface is invoked
                                                    // by accessing it with the implementing class's object
        objectOfImplementor.abstractMethodOfInterface2();
        objectOfImplementor.abstractMethodFromThe2ndInterface();
    }
}

/* Notes on Interfacs:
-> like astract classes, interfaces cannot be used to create objects
-> interfaced methods do not have a body
    - the body is provided by the "implement" class
-> on implementation of an interface, you must override all of its methods
-> interface methods are by default abstract and public
-> interface attributes are by default public, static and final
-> an interface cannot contain a constructor (as it cannot be used to create objets)

When to use Interfaces?
-> to achieve security by hiding certain details and only showing the important details of an object (interface)
-> java does not support "multiple inheritance"
    - a class can only inherit from one superclass
    - however, it can be achieved with interfaces, bc the class can implement multiple interfaces
    - to implement multiple interfaces separate them with a comma
 */
/* no errors symbols visible, but can't find the run icon. Why??
-> ??something about the main class being in the same  as module as an interface??
 */