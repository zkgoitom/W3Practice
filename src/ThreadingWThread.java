// threads allow a program to operate more efficiently by doing multiple things at the same time
            // 2 mechanisms of creating a thread: 1) extending Thread class and overriding its run method
                                                // 2) implementing the Runnable interface and overriding run ()
                                                        // ?? not sure if run is being overridden or a new method named run is being created??
public class ThreadingWThread extends Thread {
    public static void main(String[] args) {
        ThreadingWThread thread1 = new ThreadingWThread(); // since run() is non-static it can only be accessed through an object of the Thread class
                                                            // we can just create an instance of ThreadingWThread bc it automatically inherits
                                                            // Thread's data members since it extends Thread
        thread1.start(); // JVM calls the run method of this thread
                        // results in 2 threads running: 1) this thread
                                // 2) the other thread which executes its run method


    }
    // overriding the run method inherited from Thread and customized with our own body
    public void run() {
        System.out.println("this code is running in a thread");
    }
}
