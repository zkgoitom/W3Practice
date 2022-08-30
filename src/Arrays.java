// arrays are used to store multiple values in a variable instead of declaring separate variables for each value
public class Arrays {
    public static void main (String [] args) {
        // declaring an array and inserting values into it (using an array literal)
        String [] players = {"Mike", "Bron", "Kobe", "Bird"};
        // to access the elements of an array refer to the index position of  the element in the list
        System.out.println(players[0]);
        System.out.println("\n");
        System.out.println(players[3]);
        // to change the value of a specific item
        players[3] = "Magic";
        System.out.println(players[3]);
        System.out.println("\n");
        // use the length property to find out the length of an array list
        System.out.println(players.length);
        System.out.println("\n");

        // loop through an array using a for-each loop
        // in comparison to the for loop, the for each loop is easier to write, does not require a counter (using the length property)
        // and is more readable
        for (String i : players) { // for each String element called i (as in index) in players, print the value of i
            System.out.println(i);
        }

        // a multidimensional array is an array of arrays
        // to create a 2 dimensional array, add each array with its own set of curly braces
        int [][] myNum = { {1, 2, 3}, {4, 5, 6, 7} };
        // to access the elements of myNum array, specify 2 indexes, 1st for the array and 2nd for the index of the element
        int x = myNum[0] [1]; // accesses the 2nd element in the 1st array
        System.out.println(x);

        System.out.println("\n");
        // you can use a for loop nested in another for loop to get the elements of 2-dimensinal array
        // still have to point to the 2 indexes
        for (int i = 0; i < myNum.length; i++) {
            for (int j = 0; j < myNum[i].length; j++) {
                System.out.println(myNum[i][j]); // point to the 2 indexes
            }
        }

    }

}
