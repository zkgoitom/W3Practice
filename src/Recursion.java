// recursive - relating to or involving  the repeated application of a rule, definition, or procedure to successive results
// rm -rf - used to recursively & forcibly remove a directory or file. this cmd is used when there are files/folders in the directory.
//      in terms of recursively, thus it (repeatedly) removes each folder/file starting from the folder at the root to the innermost folder/file
// so think of any recursive action as repeating in towards a direction. Below is a sample of java recursion which is also referring to a
// repetitive behavior from the root (first, outermost, bottom) til the top (innermost, last, apex) as specified by a condition

// applies to routines/subroutines
// recursion is also used by routines/subroutines which is any sequence of code that is intended to be called and used repeatedly during the executable program
// routines are mentioned in sql when referring to procedures v functions


// recursion is the technique of making a function call itself
        // provides a way to break complicated problems down into simple problems which are easier to solve
public class Recursion {
    public static void main (String [] args) {
        int result = sum(10);       //invoking the sum function then passing it an argument of 10 and assigning the operation to an int variable named result
        System.out.println(result); // printing the results variable defined above. prints to a value of 55
    }

    // how recursion occurs in the if statement when the function calls itself after the return keyword
    // 10 + sum(9)
    // 10 + (9 + sum(8))
    // 10 + (9 + 8 + sum(7))
    // ....
    // 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + sum(0)
    // 10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
    public static int sum(int k) {
        if (k > 0) { // as long as k is greater than 0 call the function
            // recursion occurs here, inside the if-block
            return k + sum(k -1); // when sum() is called it adds parameter k to the sum of all numbers smaller then k
        }
        else {
            return 0; // the condition states that when k becomes 0, return 0
        }           // sinch the function does not call itself when k is 0, the program stops there and returns the result
        // what's strange or confusing is that there seems to be iteration taking place, but no iterative statement is used
        // so recursion seems to create some kind of iteration without the need of an iterative statement
    }
}

