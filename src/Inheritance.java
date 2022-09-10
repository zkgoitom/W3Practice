// an OOP principle where a subclass (child) inherits attributes and methods from a superclass (parent)
// subclass -> the class that inherits from another class
// superclass -> the class being inherited from
// extends -> a keyword that helps carry out inheritance
// In java, you can only inherit from one class
class Inheritance {
    // attribute of class Inheritance. an instance variable . ?? aka field ??
    protected String relation = "Parent"; // protected is an access modifier keyword that restricts access of data members to be able
                                    // to be accessed by other classes only if they are in the same package, unless it's through a subclass (then it can be accessed outside the package)
    // method of class Inheritance
    public String provides() {
        System.out.println("gives food");
        return "to";
    }

}

class Inheritor extends Inheritance {
    // attribute of class Inheritor. an instance variable ?? field ??
    private String relation1 = "Son"; // private is an access modifier keyword that insinuates that access to this attribute is restricted to only objects within the class

    public static void main(String [] args) {

        Inheritor childObj = new Inheritor(); // object initialized of class type Inheritor

        //childObj.provides(); // call the provides() method (from the Inheritance class) on the childObj object

        // Random experimentation Notes (return vs method block)
        //Order of  output:
            // gives food -> from within block of provide() in superclass
            // ParenttoSon -> from superclass attribute relation, from superclass method provides() return statement, from subclass attribute relation1
            // ? why does provides() method sys.out statement print before and on a different line compared provides() return statement
        System.out.println(childObj.relation + "" + childObj.provides() + "" + childObj.relation1);
    }
}
/*
Utility of Inheritance:
- useful for code reusability: reuse attributes and methods of an existing class when you create a new class
        -> ?? do you have to use inheritance to access those data members though? Couldn't it still be accomplished with object creation alone??

- if you don't other classes to inherit from a class, use the final keyword
    -> when you try to access a final class, java will generate an error: "cannot inherit from final < final class name>
 */