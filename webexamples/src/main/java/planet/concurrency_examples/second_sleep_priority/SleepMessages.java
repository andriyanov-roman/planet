package planet.concurrency_examples.second_sleep_priority;

//An interrupt is an indication to a thread that it should stop what it is doing and
//do something else. It's up to the programmer to decide exactly how a thread
//responds to an interrupt, but it is very common for the thread to terminate.

public class SleepMessages {
    public static void main(String args[])
            throws InterruptedException {
        String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
        };

        for (String anImportantInfo : importantInfo) {
            //Pause for 4 seconds
            Thread.sleep(4000);
            //Print a message
            System.out.println(anImportantInfo);
        }
    }
}
