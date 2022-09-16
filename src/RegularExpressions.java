import java.util.regex.Matcher;
import java.util.regex.Pattern; // imports Pattern class of java.util.regex package

/* -> a regular expression is a sequence of characters that forms a search pattern
-> when you search for data in a text, you can use this search pattern to describe what you are searching for
-> a regular expression can be a single character or a more complicated pattern
-> regular expressions can be used to perform all types of text search and text replace operations
-> java does not have a built-in regular expression class, but we can import the Java.util.regex package to work with regular expressions
-> java.util.regex classes:
    > Pattern - defines a pattern (to be used in a search)
    > Matcher - used to search for the pattern
    > PatternSyntaxException - indicates syntax error in a regular expression pattern
 */
public class RegularExpressions {
    public static void main(String [] args) {
        // initializes an object of type Pattern class (of the regex package)
        // the first argument passed to compile()'s param is the pattern to search for
        // the 2nd argument passed is a flag to indicate that the search shd be case-sensitive
        Pattern pattern = Pattern.compile("M@dness", Pattern.CASE_INSENSITIVE); // the 2nd parameter is optional
        // initializes an object of type Matcher
        // the 1st param of matcher(), contains the String that will be searched for
        Matcher matcher = pattern.matcher("m@dness is the only explanation ?");// matcher() returns a Matcher Object which contains info about the search that was performed
        // returns tru if the pattern given in compile() matches a pattern in the String given in matcher()
        boolean match = matcher.find();
        if (match) {
            System.out.println("match found");
        } else {
            System.out.println("No matches found");
        }
    }
}
/* compile() method flags:
-> change how the search is performed
-> 2nd parameter of Pattern.compile()
    > Pattern.CASE_INSENSITIVE - the case of letters will be ignored when performing a search
    > Pattern.LITERAL - special characters in the pattern will not have any special meaning and will be treated as ordinary
        characters when performing a search
    > Pattern.UNICODE_CASE - use it together with the CASE_INSENSITIVE flag to also ignore the case of letters outside of English alphabet

Regular Expression patterns:
-> the 1st parameter of Pattern.compile() method is the pattern. describes what is being searched for
-> brackets are used to find a range of characters:
    > [abc] - find one character from the options between the brackets
    > [^abc] - find once character NOT between the brackets
    > [0-9] - find one character from the range 0 to 9

Metacharacters:
-> characters w a special meaning
    > | - find a match for any one of the patterns separated  by | as in: cat|dog|fish
    > . - find just one instance of any character
    > ^ - finds a match at the beginning of a string as in: ^Hello
    > $ - finds a match at the end of the string as in: World$
    > \d - find a digit
    > \s - find a whitespace character
    > \b - find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
    > \uxxxx - find the Unicode character specified by the hexadecimal number xxxx

Quantifiers:
-> define quantities
    > n+ - matches any string that contains at least one n
    > n* - matches any string that contains zero or more occurrences of n
    > n? - matches any string that contains zero or one occurrences of n
    > n{x} - matches any string that contains a sequence of X n's
    > n{x,y} - matches any string that contains a sequence of X to Y n's
    > n{x,} matches any string that contains a sequence of at least X n's

 */