package Day3;

class Num{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public synchronized void add(int num){
        number += num;
    }

}

//class Table{
//    public void printTable(int number){
//        for(int i=0;i<10;i++){
//            System.out.println(number * i);
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}

class Table{
    public synchronized void printTable(int number){
        for(int i=0;i<10;i++){
            System.out.println(number * i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyThread1 extends Thread{
    Table table;
    Num number;
    MyThread1(Table table, Num number){
        this.table = table;
        this.number = number;
    }

    @Override
    public void run() {
        table.printTable(10);
//        number.add(10);
//        System.out.println(number.getNumber());
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(number.getNumber());
    }
}

class MyThread2 extends Thread{
    Table table;
    Num number;
    MyThread2(Table table, Num number){
        this.table = table;
        this.number = number;
    }

    @Override
    public void run() {
        table.printTable(5);
//        number.add(150);
//        System.out.println(number.getNumber());
    }
}

public class ThreadSynchronize {
    public static void main(String[] args) {
        Table table = new Table();
        Table table2 = new Table();
        Num num = new Num();
        num.setNumber(0);

        MyThread1 t1 = new MyThread1(table, num);
        MyThread2 t2 = new MyThread2(table, num);

        t1.start();
        t2.start();
    }
}
