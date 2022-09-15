// Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API
// the package includes many date and time classes

import java.time.LocalDate; // imports LocalDate class from java.time package
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/* Classes of Java.time package:
LocalDate- reps a date (year, month, day (yyyy-MM-dd))
LocalTime- reps time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
LocalDateTime- reps both date and time (YYYY-MM-dd-HH-mm-ss-ns)
DateTimeFormatter- formatter for displaying and parsing date-time objects
 */
public class DateAndTime {
    public static void main(String [] args) {
        // notice new is not used and instead of a constructor it's dot notation preceded by the name of the class
        // and followed by the now() method. Is this bc now() is a static method (belongs to the class, so it's invoked from the class & not thru an object)
        LocalDate localDate = LocalDate.now(); // create a date object
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        // create a DateTimeFormatterObject. don't use new. invoke the ofPattern() method and pass the desired date/time format
        // as a String argument to ofPattern()'s parameter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(("dd-MM-YYYY HH:mm:ss"));
        // invokes the format() method using localDateTime object. passes the dateTimeFormatter object (reference variable) to
        // format() and assigns it to a variable of type String
        String formattedDate = localDateTime.format(dateTimeFormatter);
        System.out.println("\n formatted date & time: " + formattedDate);


        /* The ofPatter() method accepts all sorts of values. For example:
        -> yyyy-MM-dd
        -> dd/MM/yyyy
        -> dd-MMM- yyyy
        -> E, MMM, dd yyyy
         */
    }
}

