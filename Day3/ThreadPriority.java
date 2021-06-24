package Day3;


class ThreadPriorityDemo extends Thread{

    @Override
    public void run() {
        System.out.println("Name: " + getName() + " Priority: " + getPriority());
    }
}


public class ThreadPriority {
    public static void main(String[] args) {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();

        t1.setName("Thread1");
        t2.setName("Thread2");

        t1.setPriority(7);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}
