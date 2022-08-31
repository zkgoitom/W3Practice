// in OOP, objects are instance of classes. classes are templates. objects inherit attributes and behaviors of classes
public class ClassesAndObjects {
    int x = 5; // instance variable

    public static void main (String [] args) {
        // can create multiple objects of the same class
        ClassesAndObjects myObject = new ClassesAndObjects();
        ClassesAndObjects myObject1 = new ClassesAndObjects();

        System.out.println(myObject.x);
        System.out.println(myObject1.x);
    }
} // you can also create an object of a class and access it in another class
    // often used for organization of classes (1 class has all the attributes and methods, while the other class holds main() (to execute code)
            // this class is known as the driver
