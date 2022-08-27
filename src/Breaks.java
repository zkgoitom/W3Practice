// break statements can be used to jump out of a loop
public class Breaks {
    public static void main (String [] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {   // if statement is nested in for loop (in the for loop block)
                break;
            }
            System.out.println(i);  // statement is part of for loop block not if block
                                    // even though the if statement is in the for loop (with the Sout statement), once the break keyword is executed looping ends
                                    // and the Sout statement with the value of i  (which is a part of the for loop block) stops running
        }

        System.out.println("\n");

        int j = 0;
        while (j < 10) {
            System.out.println(j); // Sout statement lives in the while loop in the first line. it stops printing when break is triggered and looping ends
            j ++ ;
            if (j == 4) {
                break; // if statement is nested in the while loop block. when condition of if statement is met, the break keyword inside if block is executed and looping ends
            }
        }
    }
}
