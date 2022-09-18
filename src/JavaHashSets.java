import java.util.HashSet; // imports the class HashSet from the java.util package

// a HashSet is a collection of items where every item is unique
// Correct me if I'm wrong but it is also unordered. I think Maps are also unordered like Sets as well?
public class JavaHashSets {
    public static void main(String [] args) {
        // create a object of HashSet. Hashset<String> is the type of the object
        // the new keyword is a java operator that creates the object
        // it's followed by a constructor which initializes the new object
            // to initialize means to give it a correct initial value
            // this step is so important, that java will either initialize it for you or generate an error to suggest initialization
        HashSet<String > cars = new HashSet<>();
        // you can insert duplications. the program will still run (no error will be generated), but the duplicate will not appear when you run the program
        cars.add("Lexus");
        cars.add("BMW");
        cars.add("Audi");
        cars.add("Lincoln");
        cars.add("BMW");
    // hash sets do not retain an order.
        System.out.println(cars);
        // contains() is used to check if an item exists in a HashSet
        System.out.println(cars.contains("BMW"));
        // remove() removes an item
        System.out.println(cars.remove("BMW"));
        System.out.println(cars);
        // clear() removes all items
        cars.clear();
        System.out.println(cars);
        System.out.println(cars.size());
        cars.add("Honda");
        cars.add("Toyota");
        cars.add("Ford");
        cars.add("Hyundai");


        // use a for-each loop to loop through the items of a HashSet
        for (String i : cars) {
            System.out.println(i);
        }
        // HashSet object that stores integers is created here
        HashSet<Integer> numbs = new HashSet<>();
        numbs.add(1); // add() to add objects to the set
        numbs.add(5);
        numbs.add(9);
        numbs.add(15);

        // show which numbers between 1 and 10 are in the set
        // for loop-> will loop (execute its block of code) according to the condition established in its statement
        // int variable i is set to 0
        // i <= 10 is the condition. so loop through the block as long as 'i' is less than or equal to 10 . since i was set to 0. looping will start at 0 then end at 10
        // increment i by 1. so witch each loop 1 will be added to the value of 'i'
        for (int i = 0; i <= 10; i ++ ) {
            // if statement will execute block of code upon condition established
            // condition uses contains() to check whether 'i' which was established as int 0 in the for loop is in the numbs HashSet object
            // if 'i' is in the numbs Hashset object then it will execute its block of code
            if(numbs.contains(i)) {
                // print out i + string literal when if statement is true
                System.out.println(i + " is inside the set"); //block of code prints out value of 'i' upon condition being met (is True)

                // should the condition in the if statement be false, execute the block of code in else
            } else {
                // print out i + String literal to stdout, when if-statement is false
                System.out.println(i + " is not in the set"); // block of code print out value of 'i' upon condition in the if statement not being met (is False)
            }
        }

    }
}

/* HashSets and Types:
-> Items in a HashSet are actually objects
        > We created items (objects) of type String
            - A string in Java is an object (not a primitive type)
        > to use primitive types, such as int, you must specify an equivalent wrapper class: Integer
            - Boolean for boolean, Character for char, Double for double, etc.

 */