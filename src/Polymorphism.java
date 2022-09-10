// "many forms" it occurs when many classes are r/t to each other by inheritance
// On one hand Inheritance lets us inherit attributes and methods from another class and on the other hand
// Polymorphism allows us to use those methods to perform different tasks

public class Polymorphism {
    public void animalSound() {
        System.out.println("the animal makes a sound");
    }
}
class Pig extends Polymorphism {
    @Override
    public void animalSound() {
        System.out.println("the Pig says oink");
    }
}

class dog extends Polymorphism {
   // overriding is a proponent of Polymorphism, (one of the ways, as explained earlier, that performs actions using methods)
    // with overriding, the subclass inherits methods from the superclass and maintains the same type, name, and parameters
    // the statement in the block of the method however is varies
    // notice this that overriding is specific to methods. attributes are not overridden
    @Override
    public void animalSound() {
        System.out.println("Clifford the big red dog barks");
    }
}
class Driver {

    public static void main(String [] args) {
        // notice that for each object created the Type is always the type of the Super class , Polymorphism
        // the constructors used to initialize the objects, on the other hand, are the constructors of the 3 classes above
        Polymorphism poly = new Polymorphism();
        Polymorphism pig = new Pig();
        Polymorphism dog = new dog();

        // calling the animalSound() method using 3 different objects. each object invokes the method of a different animalSound() from each class
        poly.animalSound();
        pig.animalSound();
        dog.animalSound();


    }
}
/*
Utility of Polymorphism
- useful for code reusability. reuse attributes and methods of an existing class, when you create a new class
 */