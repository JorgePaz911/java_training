package Day3;

class ThreadNameDemo extends Thread{

    @Override
    public void run() {
        System.out.println("Running...");
    }
}


public class ThreadsNames {
    public static void main(String[] args) {
        ThreadNameDemo t1 = new ThreadNameDemo();

        t1.start();

        System.out.println("t1: " + t1.getName());

        t1.setName("Thread t1");

        System.out.println("t1: " + t1.getName());
    }
}
