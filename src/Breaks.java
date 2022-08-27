// break statements can be used to jump out of a loop
public class Breaks {
    public static void main (String [] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\n");

        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j ++ ;
            if (j == 4) {
                break;
            }
        }
    }
}
