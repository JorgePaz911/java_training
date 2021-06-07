package Day3;

class Table3 {
    public void printTable(int number) {
        // synchronized block
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.println(number * i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


public class ThreadSynBlock {
    public static void main(String[] args) {
        Table3 table = new Table3();

        Thread t1 = new Thread(){
            @Override
            public void run() {
                table.printTable(5);
            }
        };

        Thread t2 = new Thread(){
            @Override
            public void run() {
                table.printTable(100);
            }
        };
        t1.start();
        t2.start();
    }
}
