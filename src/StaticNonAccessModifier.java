// a static method means that it can be accessed without creating an object of the class, unlike public
public class StaticNonAccessModifier {
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }
    public static void main (String [] args) {
        myStaticMethod(); // call the static method without an object
        StaticNonAccessModifier myObj = new StaticNonAccessModifier(); // create an object
        myObj.myPublicMethod(); // call the public method via the object
    }
}
