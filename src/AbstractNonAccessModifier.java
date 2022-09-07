// an abstract method belongs to an abstract class, and it does not have a body. the body is provided by the subclass
abstract class AbstractNonAccessModifier {
    public String fName = "Madness";
    public int age = 32;
    public abstract void study() ; // abstract method syntax. it does not hava a body, so it does not need a curly brackets. ends with a semicolon instead

}

// subclass (inherits from abstract class)
class Student extends AbstractNonAccessModifier {

    public int graduationYear = 2016;

    @Override // overrides method from parent class. override is a polymorphism proponent where a subclass inherits a super classes' methods and uses the same name and parameters
    public void study() { // the body of the method is provided here in the subclass
        System.out.println("Studying all day long");
    }
}

// main method goes in this class
class Main {
    public static void main(String [] args) {
        Student student = new Student(); // create an object of student class (which inherited attributes and methods from the abstract class)

        System.out.println("Name: " + student.fName);
        System.out.println("Age: " + student.age);
        System.out.println("Graduation Year: " + student.graduationYear);
        student.study(); // call abstract method
    }
}