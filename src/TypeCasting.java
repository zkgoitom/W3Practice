// type casting is assigning the value of one primitive data type to another type
    // 2 type: widening and narrowing
public class TypeCasting {
    public static void main (String [] args) {
        int myInt = 9;
        double myDouble = myInt; // widening occurs here.it is automatic and converts a smaller type to a larger type
        System.out.println(myInt);
        System.out.println(myDouble);

        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // narrowing occurs here. it is manually done by placing the type that is being converted into
                                        // in parentheses in front of the value
        System.out.println(myDouble2);
        System.out.println(myInt2);



    }
}
