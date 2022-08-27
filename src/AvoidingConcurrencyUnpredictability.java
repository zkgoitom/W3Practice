// Concurrency Problems can occur bc there is no way to know which order the code will run, when threads run at the same
// as other parts of the program
// when the threads and the main program are reading and writing the same variables, the values are un predictable
        // to avoid concurrency problems it is best to share as few attributes between them as possible
        // but if attributes need to be shared one possible solution is using the isAlive() method
                // it checks  whether the thread has finished running before any attributes that the thread can change
public class AvoidingConcurrencyUnpredictability extends Thread {
    public static int amount = 0; // instance variable named amt

    public static void main (String [] args) {
        AvoidingConcurrencyUnpredictability thread = new AvoidingConcurrencyUnpredictability();
        thread.start();

        // while loop checks if thread is alive and stops looping when thread has finished
        while (thread.isAlive()) {
            System.out.println("Waiting ...");
        }
        System.out.println("the value of \'amount\' running outside the thread is: " + amount);
        amount ++;
        System.out.println("the value of \'amount\' running outside the thread after incrementing is: " + amount);

    }
    public void run () {
        System.out.println("the value of amount inside of thread before incrementing is : " + amount);
        amount ++ ;
        System.out.println("the value of \'amount\' running inside the thread after incrementing is: " + amount);

    }

}
