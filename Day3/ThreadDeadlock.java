package Day3;

public class ThreadDeadlock {
    public static void main(String[] args) {
        final String resource1 = "first string";
        final String resource2 = "second string";

        // t1 tries to lock resource1 then resource 2
        Thread t1 = new Thread(){
            @Override
            public void run() {
                synchronized (resource1){
                    System.out.println("Thread 1: locked resource 1");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2){
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // t2 tries to lock resource2 then resource 1
        Thread t2 = new Thread(){
            @Override
            public void run() {
                synchronized (resource2){
                    System.out.println("Thread 2: locked resource 2");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1){
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };
        t1.start();
        t2.start();

    }
}
