// continue statements break one iteration (of the loop) , if a specified condition occurs and continues with the next iteration of the loop
// what's meant by, "breaks one iteration ..."
// seems like continue statement make no difference. what am I missing? what's the point of using it in a loop like this?
public class ContinueStatements {
    public static void main (String [] args) {
        for (int i = 0; i < 10; i ++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }

        System.out.println('\n');

        int j = 0;
        while (j < 10) { // if, while loop statement is true execute the if statement nested in while block and as long as if statement does not end loop execute the Sout stmnt in while loop block after the  if statement then execute increment value variable. And continue looping until condition tests false
            if (j == 4) { // if, if statement is true, increment j by 1 and then continue
                j ++ ;      // increments in if block
                continue;   // continue in if block
            }
            System.out.println(j); // Sout statement lives inside the while block, on the line after the if block
            j ++;  // an increments value variable lives inside the while block

        }
    }
}
