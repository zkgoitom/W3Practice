import java.util.HashMap;

// Arrays store items as an ordered collection and you can access them with an index number(int type)
// a hashmap stores items in key/value pairs and you can access them by an index of another type (i.e. String)
    // one object is used as a key (index)  to another object (value)
    // it can store different types: String keys and Integer values, or the same type : like String keys and String values
public class JavaHashMaps {
    public static void main(String [] args) {
        HashMap<String, String> cities = new HashMap<String, String>(); // create  a hashmap object

        cities.put("Seattle", "Washington");
        cities.put("Washington", "D.C.");
        cities.put("London", "England");
        cities.put("Berlin", "Germany");
        // HashMaps do not retain an order
        System.out.println(cities);

        // to access a value, use the get() method and refer to its key
        System.out.println(cities.get("Seattle")); //Seattle is the key for Washington

        // to remove an item use remove() and refer to its key
        // use clear() to remove all items. all elements will be erased but the Hashmap object still exists, so you can put() items in
        System.out.println(cities.remove("Berlin")); // during the operation Sy.out will display the value of the key but afterwards it will no longer be removed

        // to find out how many items are present, use size()
        System.out.println(cities.size()); // use Sy.out. to print it to stdout

        // loop through items of a Hashmap
        // use keySet() if you only want keys and values() if you only want values

        for (String i : cities.keySet()) {
            System.out.println(i); // 'i' is to a key of cities hashmap object
        }
        // since is defined in the statement it will retain its value within the scope
        // hence why we can define it differently in this block and the block above
        for (String i: cities.values()) {
            System.out.println(i); // 'i' is assigned to a value of cities. with each loop it will print the next value in the sequence of the cities hashmap object
        }
        /* -> keys and value in a HashMap are actually objects
                > above we used object of type String
                    - remember a String in java is an object (not a primitive)
                > to use other types (like int), you must specify an equivalent wrapper class: Integer
                    - for other primitive types: Boolean for boolean, Character, for char, Double for double etc.
         */

        System.out.println("\n");

        HashMap<Integer, String> goats = new HashMap<Integer, String>(); // do we not need to write the type in the constructor?
        goats.put(1, "Mike");
        goats.put(2, "Lebron");
        goats.put(3, "Kareem");
        goats.put(4, "Magic");
        goats.put(5, "Kobe");

        // strange bc this HashMap does retain an order. It seems to retain the order of the Integer
        System.out.println(goats);

        for(Integer i : goats.keySet()) {
            System.out.println("rank: " + i + " name: " + goats.get(i)); // 'i' to get the key. Then use the key 'i' with get() to retrieve the value
        }

        HashMap<Integer, String> goats1 = new HashMap<Integer, String>();

        goats1.put(3, "Larry");
        goats1.put(2, "Hakeem");
        goats1.put(1, "Shq");
        goats1.put(4, "Steph");
        // theory tested and proves true, at least in this usage case. HashMaps follow the ascending order of Integer keys, but not for String keys (alphabetically)
        System.out.println(goats1);

    }
}
