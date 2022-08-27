public class IfElseConditions {
    public static void main (String [] args) {
        int num1 = Math.min(5, 10);
        int num2 = Math.max(5, 10);
        if (num2 > num1) {
            System.out.println("10 is greater than 5");
        }
        if (num1 > num2) {
            System.out.println("5 is greater than 10");

        } else {
            System.out.println("if statement is false bc 10 is greater than 5, so block of code in else statement will execute");
        }

        // use else if statement to specify a new condition, if 1st condition is false
        if (num1 == num2) {
            System.out.println("if condition, must be true if this prints ");
        } else if (num1 > 40) {
            System.out.println("this else if specified a new condition. if 1st statement is false this condition will be tested and if true execute");
        } else {
            System.out.println("I guess the 1st and 2nd statement were false, if ya'll choosing me to be executed");

        }
        System.out.println("\n");
        // use ternary operators aka shor hand for simple if...else statements
        String result = (num1 < num2) ? "num1 is less than num2" : "num1 is greater than num 2";
        System.out.println(result);
    }
}
