// method overloading is a proponent of Polymorphism. It says multiple methods can have the same name with different parameters
public class MethodOverloading {
    public static void main (String [] args) {
        int myNum = plusMethod(8, 5);
        double myNum1 = plusMethod(Math.random() * 4, Math.sqrt(Math.abs(-64)));
        System.out.println("int: " + myNum);
        System.out.println("double: " + myNum1);
    }
    // instead of defining multiple methods that should do the same thing, it is better to overload one
    // multiple methods can have the same name as long as the number and/or type of parameters are different
    // numbers?? what's that mean? primitive number type? further specifying it as primitive number type? Or
    // the number value (argument) passed to the parameter


    // Is this true or not? saw a pattern and wondered if it is accurate or not?
    // the return type often matches the parameter type bc in the body the return keyword is commonly followed by the parameter???
    int myMethod (int x){
        return x ;
    }
    float myMethod (float x) {
        return x;
    }
    double myMethod (double x) {
        return x;
    }

    static int plusMethod(int x, int y) {
        return x + y;
    }
    static double plusMethod(double x, double y) {
        return x + y;
    }
}
