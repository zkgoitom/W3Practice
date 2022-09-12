// Inner Classes are classes nested within Classes. the purpose is to group classes that belong together as well as maintain readability
// to access the inner class make an object of the outer class and then make an object of the inner class
public class OuterAndInnerClasses {
    int x = 10;
    class InnerClass {
        int y = 5;
    }
    // unlike a regular class, an inner class can be private or protected. Remember these modifiers are usually for data members
    // inside the class, while public and default are for classes
    private class InnerTwo { // if you don't want outside object to access the inner class declare the class as private
    // will generate an error if you try to access it using outer class (via dot notation)
        // "error: OuterAndInnerClasses.InnerTwo has private access in OuterAndInnerClasses
    }
    // an inner class can also be static, meaning you can access it without creating an object of the outer class
    // static is usually a data member level non-access modifier, while abstract and final are class/data member level
    static class StaticInner {
        int z = 22;
    }
    // one advantage of an inner class, is that you can access attributes and methods of the outer class
    class InnerThree {
        public int innerThreeMethod() {
            return x;
        }

    }
}
 // If I made this class public I would get an error telling me to put it in its own file Go.java
class Go {
    public static void main(String [] args) {
        OuterAndInnerClasses myOuter = new OuterAndInnerClasses(); // object of the outer class
        // object of the inner class. notice the novel syntax arrangement
        OuterAndInnerClasses.InnerClass myInner = myOuter.new InnerClass(); // dot notation similar to a method to declare the type where Inner class is like the method
                                                                                // dot notation for new is strange. object of outer (myOuter) dot then new?? don't know what that's about??
                                                                                // finish with InnerClass() constructor which is regular

        // no need to create an object of the outer class to access the Inner class, unlike above for the non-static inner
        // unlike the above, this time we use dot notation on the type and the constructor. The outer class name is used before the dot
        // where the object is usually at followed by the name of the inner class
        // just like static attributes and methods, a static inner class does not have access to members of the outer class
        OuterAndInnerClasses.StaticInner myStaticInner = new OuterAndInnerClasses.StaticInner(); // object creation of inner class

        System.out.println(myStaticInner.z); // prints z attribute from Static inner class

        System.out.println(myInner.y + myOuter.x); // use dot notation to access y attribute of inner class and x attribute of outer class

        OuterAndInnerClasses.InnerThree myInner3 = myOuter.new InnerThree();// object creation of InnerThree class
        System.out.println(myInner3.innerThreeMethod());

    }
}
