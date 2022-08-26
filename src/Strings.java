// Strings are a sequence of characters used for storing text
// a String variable contains a collection of characters surrounded by double quotes
// they are reference variables (meaning the variable is a reference to an object
// and they have a String class which possesses operations for manipulating the text
public class Strings {
    public static void main (String [] args) {
        String txt = "I love java";
        System.out.println(txt);
        System.out.println("\n");
        // length() is a method that supplies the length of a string includes spaces
        System.out.println("The length of the String \"I love java\" stored in \'txt\' is: " + txt.length());
        System.out.println("\n");
        System.out.println("\'toUpeerCase()\' method capitalized the characters (letters) in a String i.e.: " + txt.toUpperCase());
        System.out.println("\n");
        System.out.println("\'toLowerCase()\' method makes it lower case, i.e.: " + txt.toLowerCase());
        System.out.println("\n");
        System.out.println("indexOf() will return the index position of the 1st occurrence of a specified text in a string \n");
        // remember the index starts with 0 in java
        System.out.println("what is the location of \'java\': " + txt.indexOf("java"));
        System.out.println("\n");
        // you can use the + to concatenate Strings or concat()
        System.out.println(txt.concat(" because it makes me whole"));

        // java uses the + for both concatenation and addition
        // numbers are added
        // Strings are concatenated

        // the '\' is used for escaping. it turns special characters into String characters
            // i.e. /" is used to display double quotes, \' for single quotes and \\ for a backslash
            // other common escapes are \n (newline), \r (return), \t (tab), \b (back space), \f (form feed)


    }
}
