// loops execute a block of code as long as a specified condition is reached
    // a while loops through a block of code as long as  a specified condition is true
public class WhileLoops {
    public static void main (String [] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i ++ ;   // do not forget to increment the variable used in the condition, otherwise the loop will never end
        }
        System.out.println("\n");
        // a do while loop executes the code in the do block at least once before it tests the condition in the
        // while loop to determine whether to loop through the block again or not
        int j = 0;
        do {
            System.out.println(j);
            j ++;
        }
        while (j < 5) ;
    }
}
