// encapsulation is the process of hiding sensitive data from users
    //HOW?
//1) declaring class variables/attributes as private
//2) provide public get and set methods to access and update the value of a private variable

// private variables can only be accessed within the same class (an outside class has no access to it)
// However it is possible to access them if we provide public get and set methods

// the get method returns the variable value and the set method sets the value
// syntax for both is that they start with either get or set followed by the name of the variable, with the first letter in upper case

class Encapsulation {
    private String name; // private = restricted access is within the class

    // the get method returns the value of the variable name
    public String getName(){ // notice unlike the setter the getter has a return (and thus a return type)
        return name;            // the return keyword is like a place-holder

    }
    // the set method takes a parameter newName and assigns it to the name variable
    public void setName(String newName) { // unlike a getter, the setter passes a parameter which is tied to a variable's value contained in its block
        this.name = newName;                // the setter also uses the 'this' keyword. it refers to the current object in a method
                                        // commonly used to eliminate the confusion between class attributes and parameters with the same name
    }


}
class Absolute {
    public static void main(String[] args) {
        Encapsulation person = new Encapsulation();

        // person.name = "Madness"; ->  generates an error
        // System.out.println(person.name); -> generates an error

        // instead, use the getName() and setName() methods to access and update the variable
        person.setName("Madness"); // sets the value of the name variable to "Madness"
        System.out.println(person.getName()); // outputs Madness
    }

    /* Why Encapsulation:
    1) better control of class attributes and methods
    2) class attributes can be made read-only (if you only use the get method), or write-only (if you only use the set method)
    3) flexible: the programmer can change one part of the code without affecting other parts
    4) increased security of data
     */
}

