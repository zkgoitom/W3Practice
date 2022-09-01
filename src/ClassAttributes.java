// class attributes aka fields are variables within a class.
// if class attributes are fields. ??what is the difference between fields and instance variables??
        // my guess it has something with belonging to the class or instances of the class
public class ClassAttributes {
    // class attributes x and y
    int x; // use final before int x to make the variable unalterable. final is a non-access modifier along with static, and abstract. final and abstract can be used for classes and data members
    int y = 5;
    String fName = "Michael";
    String lName = "Jordan";


    public static void main (String [] args) {
        // you can access an attribute by creating an object of the class and using dot notation
        ClassAttributes myObj = new ClassAttributes(); // creating an instance of the class
        System.out.println(myObj.x); // dot notation
        // you can modify attribute values as well
        myObj.x = 10; // changed value to 10 or rather set the value to 10. use final keyword if you want the value to never be modified
        System.out.println(myObj.x); // had I put x alone inside the parentheses, output wd be an error
        ClassAttributes myObj1 = new ClassAttributes();
        // you can make multiple objects and modify the attribute with one while leaving it the same with another.
        // However, if you try to change the same attribute more than once it will display the address of the attribute
        ClassAttributes myObj2 = new ClassAttributes();
        System.out.println(myObj1.y);
        myObj2.y = 8;
        System.out.println(myObj2.y);
        // you can specify as many attributes as you want
        System.out.println("My favorite player is " + myObj.fName + " " + myObj.lName);

    }
}
