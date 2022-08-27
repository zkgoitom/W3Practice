// for loops are useful when you know how many times you want to loop through the block
// 3 statements combine to make the for loop statement
    // statement 1 executes once before the block of code
    // statement 2 defines the condition for executing the block of code
    // statement 3 is executed every time after the code block has been executed
public class ForLoops {
    public static void main (String [] args) {
        for (int i = 0; i < 5; i ++) { // statement 1 sets a variable before the loop starts (int i = 0)
            System.out.println(i);      // statement 2 defines the condition for the loop to run. if the condition is true the loop will run again. if false it will end
        }                               // statement 3 increments the value of the variable set in statement 1 each time the code block in the loop has been executed
                                                // i ++ is the same as i = i + 1

        for (int i = 0; i <= 10; i = i +2) {  // increments value by 2
            System.out.println(i); // will print even values
        }
    }
}
