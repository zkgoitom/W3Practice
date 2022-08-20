// This script is to practice another java recursion sample. This time the method possesses 2 parameters

// infinite recursion
        // when the function never stops calling itself

// Halting Condition
        // refers to the statement that holds a condition that stops the function from calling itself
        // without a halting condition, a recursive function runs into problem of infinite recursion (similar to infinite looping)
public class RecursionTwo {
    public static void main (String [] args) {
        int result = sum(5, 10);
        System.out.println(result);
    }

    public static int sum (int start, int end) {
        if (end > start) { // end is 10 . start is 5.          when 10 > 5 execute otherwise stop. i.e. 5 > 5. end which is initially 10
            return end + sum(start, end - 1);              // is subtracted by 1 every time the function is invoked. eventually end will equal 5
        }       // 10 + 9 + 8 + 7 + 6 + 5 = 45. then the program stops bc 5 is not greater then 5
        else {
            return end;
        }
    }
}
