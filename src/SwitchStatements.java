// Switch statements are used to compare an expression with one of multiple cases.
// the block of code of the case that matches the expression will execute
public class SwitchStatements {
    public static void main (String [] args) {
        int day = Math.min(Math.abs(-4), (int) (Math.random() * 7));
        switch (day) {
            case 1:
                System.out.println("Mon");
                break; // when a break keyword is reached, it will stop the execution of more code and case testing inside the block
            case 2:                          // can save a lot of execution time be ignoring the execution of the rest of the block of code of the switch
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thurs");
                break;
            case 5:
                System.out.println("Fri");
            default: // specifies some code to run if there is no case match. somewhat similar to else statement
                System.out.println("Sat or Sun");           // if default is used as the last statement in switch block, there's no need for a break
        }
    }
}
