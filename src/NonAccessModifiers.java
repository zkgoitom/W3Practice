public class NonAccessModifiers {
    public static void main (String [] args) {
        System.out.println("Non-access modifiers do not control access level, but provide other functionality");
        System.out.println("Non-access modifiers include: ");
        String [] nonAccesModifiers = {"Final", "Static", "Abstract", "Transient", "Synchronized", "Volatile"};
        for (int i = 0; i < nonAccesModifiers.length; i++ ){
            System.out.println(nonAccesModifiers[i]);
        }
        System.out.println("\n");
        System.out.println("Final and Abstract can be used on both Class level and data member level \n");
        System.out.println("For Final the class cannot be inherited by other classes. Attributes and methods cannot be overriden/modified \n");
        System.out.println("For Abstract the class cannot be used to create objects");
        System.out.println("Abstract can only bue used in an abstract class and can only be used in methods. The method does not have a body.");
        System.out.println("The body is provided by the subclass (inherited from). \n");
        System.out.println("With the Static keyword, attributes and methods belong to the class, rather than an object");
    }
}
