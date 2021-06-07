package Day3;


class Bank {
    int balance = 10000;
    int curAmount= 0;

    synchronized void withdraw(int amount) {
        System.out.println("Withdraw processing....");
        if (balance < amount) {
            System.out.println("Balance insufficient, waiting for deposit...");
            curAmount = amount;
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println("withdraw completed!! " + balance);
        }
    }

    synchronized void deposit(int amount) {
        System.out.println("deposit processing...");
        balance += amount;
        System.out.println("deposit completed!! " + balance + " " + curAmount);
        if(balance >= curAmount){
            notify();
        }
    }
}

class DepositThread extends Thread {
    Bank bank;

    public DepositThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.deposit(2000);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        bank.deposit(30000);
    }
}

class WithdrawThread extends Thread {
    Bank bank;

    public WithdrawThread(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void run() {
        bank.withdraw(15000);
    }
}


public class ThreadBank {
    public static void main(String[] args) {
        Bank bank = new Bank();
        DepositThread depositThread = new DepositThread(bank);
        WithdrawThread withdrawThread = new WithdrawThread(bank);

        withdrawThread.start();
        depositThread.start();
    }
}
