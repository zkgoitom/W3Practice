import java.io.File; // import the File class from the java.io package
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; // import the IOException class from the java.io package
import java.util.Scanner;

// file handling is an important part of any application
// java has several methods for creating, reading, updating, and deleting files
// the File class from java.io package allows us to work with files
    // to use the File class, create an object of the class, and specify the filename or directory name
public class JavaFiles {

    public static void main(String [] args) {
        // try statement defines a block of code to be tested for errors while it is executed
        try {
            // create File class object to access methods of the File class
            File myFile = new File("practicefile.txt"); // specify the filename by passing it as an argument to File class constructor's parameter

            // createsNewFile() creates a new file if a name with that file is nor present and returns a True value
            // if a file with that name is already present createNewFile() will return a False value
            // creates the file in the same directory
                // to create a file in a specific directory (requires permission), specify the path of the file (i.e., "C:\\Users\\Zekarias\\filename.txt") and use double
                // backslashes to escape the "\" character (for Windows). on Mac and Linux, you can just write the path, like: /Users/name/filename.txt
            if (myFile.createNewFile()) { // createFileName returns a Boolean value of either True or False
                System.out.println("File Created: " + myFile.getName()); // getName() returns the name of the file
            } else {
                System.out.println("File already exists");
            }
            // catch statement defines a block of code to be executed, if an error occurs in the try block
            // finally statement allows you to execute code after try...catch, regardless of the result
        } catch (IOException e) { // ?? is IOException a class and e an object of IOException
            System.out.println("An error occurred.");
            e.printStackTrace(); // ?? method of IOException class which prints the (??throwable??) object to stderr
        }


        // use the FileWriter class with its write() method to write some text to the file we created above
        // when you are done writing to the file, you should close it with close() method
        try {
            FileWriter myWriter = new FileWriter("practicefile.txt"); // pass the name of the file you want to manipulate to the constructor
            myWriter.write("This is text written using the FileWrite class in a practice file created using the File class of java.io and their methods");
            myWriter.close();
            System.out.println("Successfully wrote to file"); // message in try block will print if try clause runs with no errors, else message in catch block will print
        } catch (IOException e) {
            System.out.println("an error occurred while attempting to write to file"); // message in catch block will print if try clause contains an error
            e.printStackTrace();
        }

        // use the Scanner class to read the contents of the text file created above
        // try clause
        try {
            // create File class object. passed practicefile.txt to its constructor
            File myFile = new File("practicefile.txt");
            // created Scanner class object. passed the File class object to Scanner class object's constructor
            Scanner myReader = new Scanner(myFile);

            // while statement in try-block
            // hasNextLine() is a Scanner class method
            // while loop statement determines uses hasNextLine() to determine if file passed to object possesses a next line
            // if result is true block of code in while statement will execute until it is false
            while (myReader.hasNextLine()) {
                // nextLine() (a Scanner class method) returns the input of each line
                // data is a variable that stores that input
                String data = myReader.nextLine();
                System.out.println(data); // prints out the input to stdout
            }
            // in try block, but outside of while block. outside of looping range
            myReader.close(); // closes Scanner class object
        } catch (FileNotFoundException e) {
            System.out.println("Error occurred while attempting to ready file");
        }

        File myFile = new File("practicefile.txt");
        if (myFile.exists()) {
            System.out.println("File Name: " + myFile.getName());
            System.out.println("Absolute Path: " + myFile.getAbsolutePath());
            System.out.println("Writeable: " + myFile.canRead());
            System.out.println("Readable: " + myFile.canRead());
            System.out.println("File size in bytes: " + myFile.length());
        } else {
            System.out.println("The file does not exist");
        }


        // Deleting a file
        // you can also delete a folder. however it must be empty
            // pass the folder name/path to the File class constructor as you would a file
        File myfile = new File("practicefile.txt");

        if (myFile.delete()) {
            System.out.println("Deleted the file: " + myfile.getName());
        } else {
            System.out.println("failed to delete the file: ");
        }
    }



/* Note: there are many available classes in the Java ApI that can be used to read and write files in Java:
-> FileReader, BufferedReader, Files, Scanner, FileInputStream, FileWriter, BufferedWriter, FileOutputStream

 */

}

/* File class methods:
Method Name         ( Type )      Description
-> canRead() - (Boolean)    tests whether the file is readable or not
-> canWrite() - (Boolean)   tests whether the file is writable or not
-> createNewFile() - (Boolean) creates an empty file
-> delete() - (Boolean)     deletes a file
-> exists() - (Boolean)     tests whether a file exists or not
-> getName() - (String)     returns the name of the file
-> getAbsolutePath() - (String) returns the absolute pathname of the file
-> length() - (Long)    returns the size of the file in bytes
-> list() - (String[])    returns an array of the files in the directory
-> mkdir() - (Boolean)     creates a directory
 */