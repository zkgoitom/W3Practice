// the String class has a set of built-in methods
public class JavaStringMethods {
    public static void main(String [] args) {
        String myStr = "citrix";

        // returns the character at the given index position then stores it in a chat type primitive variable named result
        // stored in a char type variable bc the value is a character
        char result = myStr.charAt(0);
        System.out.println(result);

        String myStr1 = "teamviewer";
        // returns the unicode of the give character at the given index position in a String
        // stored in an int variable bc the value is an integer
        int result1 = myStr1.codePointAt(0);
        System.out.println(result1);

        // returns the unicode value of the character before the specified index in a string
        int r = myStr1.codePointBefore(1);
        System.out.println(r);

        // return the number of Unicode values found in a string
        // the startIndex and endIndex parameters specify where to begin and end the search
        int r1 = myStr1.codePointCount(0, 5);
        System.out.println(r1);

        // compares 2 string lexicographically
        // the comparison is based on the Unicode value of each character in the string
        // returns 0 if the string is equal to the other string
        // a value less than 0 is returned if the string is less than the other string (less characters) and a value greater than 0
        // if the string is greater than the other string (more cha characters)
        // Tip: use compareToIgnoreCase() to compare 2 strings lexicographically, ignoring lower case and upper case differences
        // TIP: use equals() to compare 2 strings without consideration of Unicode values
        System.out.println(myStr.compareTo(myStr1));

        String intune = "inture";
        String endPoint = "endPoint analysis";
        // appends a string to the end of another string
        System.out.println(intune.concat(endPoint));

        String standard = "standard software requests";
        // finds out if a string contains a sequence of characters
        // returns true if the character exist and false if not
        System.out.println(standard.contains("standard"));

        String nonStandard = "non-standard software requests";

        // searches a string to find out if it contains the exact same sequence of characters in the specified string or StringBuffer
        // returns true if the characters exist and false if not
        // the StringBuffer class is like a String, only it can be modified, found in the java.lang package
        System.out.println(nonStandard.contentEquals("non-standard software requests"));
        System.out.println(nonStandard.contains("non-stan"));

        // character array
        char [] serviceNow = {'s', 'e', 'r', 'v', 'i', 'c', 'e', 'n', 'o', 'w'};
        // String variable with an empty string value
        String str = "";

        // returns a String that represents certain characters of a char array
        String str1 = str.copyValueOf(serviceNow, 0, 7);

        System.out.println(str1 + "now");

// endsWith()

        //
    }

}
