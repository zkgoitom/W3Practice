// creating and running a thread by implementing the Runnable interface
public class ThreadingWRunnable implements Runnable{
    public static void main (String [] args) {
        ThreadingWRunnable thread1 = new ThreadingWRunnable(); // similar to how an object was necessary to access Thread's data members
                                                                // since it was a non-static data member, an object is needed to access Runnable
                                                                // Runnable itself canNOT have an object made out of it since it is abstract and an interface
                                                                // But the class that implemented it can have an object be made of it's type
        thread1.run();  //Notice unlike the Thread class we invoke run() here NOT start()
                        // but is this running a thread? It executed with no errors

       // according to W3, the thread can be run by passing an instance of the class implementing Runnable to a Thread object's constructor
        // AND THEN calling the thread's start() method
        Thread thread = new Thread(thread1);
        thread.start();

        System.out.println("this code is outside of the thread. I believe Since it is not inside run()");

    }

    // when an object implementing interface Runnable is used to create a thread, starting the thread causes the objects run()
    // method to be called in that separately executing thread
    // the general contract of the method run is that it may take any action whatsoever
    @Override
    public void run() {
        System.out.println("this code is running in a thread");
    }
}
