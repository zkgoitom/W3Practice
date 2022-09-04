// access modifiers include: public, protected, default, and private
// they are keywords that dictate the level of access of a data member or class
// the order of access from least restrictive to the most restrictive is public, protected, default, private
public class AccessModifiers {
    public static void main(String [] args) {
        String [] accessModifiers = {"Public", "Protected", "Default", "Private"};
        System.out.println("Access Modifiers: ");
        for (String i : accessModifiers) {
            System.out.println(i);
        }

        System.out.println("\nPublic is used at the class level and at the data member level");
        System.out.println("For both classes and data members, it means the code can be accessed at any level \n");
        System.out.println("Protected is used at the data member level");
        System.out.println("It means the code is only accessed within the same package unless it's accessed through a subclass.");
        System.out.println("If the code is extended in subclasses, then it can be accessed outside of the package \n");
        System.out.println("Default is used at the class level and and data member level, like Public");
        System.out.println("For both classes and data members, it means the code can be accessed only within the same package \n");
        System.out.println("Private is used at the data member level");
        System.out.println("It means the code is only accessible within the declared class");



    }
}
