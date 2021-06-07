package Day3;

class CurThreadDemo extends Thread{
    @Override
    public void run() {
        System.out.println(getName());
    }
}

public class ThreadCurrent {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());

        CurThreadDemo t2 = new CurThreadDemo();
        t2.start();

    }
}
