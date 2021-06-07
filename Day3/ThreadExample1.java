package Day3;

class MultiThreadExample extends Thread{
    @Override
    public void run() {
        System.out.println("extended thread running...");
    }
}

class RunnableExample implements Runnable{

    @Override
    public void run() {
        System.out.println("runnable thread running");
    }
}

class ThreadSleepDemo implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i <= 5; i++){
            try {
                Thread.sleep(500);
                System.out.println(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}



public class ThreadExample1 {
    public static void main(String[] args) {
        MultiThreadExample thread = new MultiThreadExample();
        thread.start();

        RunnableExample runnable = new RunnableExample();
        Thread thread2 = new Thread(runnable);
        thread2.start();

        ThreadSleepDemo t1 = new ThreadSleepDemo();
        ThreadSleepDemo t2 = new ThreadSleepDemo();

        Thread t1_1 = new Thread(t1);
        Thread t2_1 = new Thread(t2);

        t1_1.start();
        t2_1.start();

        /**
         * These will not be treated as threads, just as normal objects.
         * Calling run directly instead of start.
         */
        t1_1.run();
        t2_1.run();
    }
}
