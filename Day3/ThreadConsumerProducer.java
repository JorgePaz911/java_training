package Day3;

class Company {
    int item;
    boolean flag= false;
    // flag = false it is producer turn
    // flag = true it is consume true

    public synchronized void produce(int item) {
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.item = item;
        System.out.println("Produced: " + this.item);
        flag = true;
        notify();
    }

    public synchronized int consume(int i) {
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consume: " + i);
        flag = false;
        notify();
        return this.item;
    }
}

class Producer extends Thread {
    Company company;

    public Producer(Company company) {
        this.company = company;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            company.produce(1);
        }
    }
}

class Consumer extends Thread{
    Company company;
    public Consumer(Company company){
        this.company = company;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            company.consume(1);
        }
    }
}


public class ThreadConsumerProducer {
    public static void main(String[] args) {
        Company company = new Company();
        Producer producer = new Producer(company);
        Consumer consumer = new Consumer(company);

        producer.start();
        consumer.start();
    }
}
