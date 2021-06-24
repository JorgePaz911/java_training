package Day2;

interface IBankAccount{
    boolean deposit(double amount);
    boolean withdraw(double amount);
    void getBalance();
}

class SavingAccount implements IBankAccount{

    private double _balance;
    private double _perDayLimit;

    public void test(){

    }

    @Override
    public boolean deposit(double amount) {
        _balance += amount;
        System.out.println("Deposited: "+ amount);
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(_balance < amount){
            System.out.println("Insufficient balance!");
            return false;
        }
        // limit 5000
        else if(_perDayLimit + amount > 5000){
            System.out.println("Withdraw attempt failed");
            return false;
        }
        else{
            _balance -= amount;
            _perDayLimit += amount;
            System.out.println("Successfully withdraw: "+ amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Saving account balance: "+ _balance);
    }
}

class CurrentAccount implements IBankAccount{
    private double _balance;

    @Override
    public boolean deposit(double amount) {
        _balance += amount;
        System.out.println("Deposited: "+ amount);
        return true;
    }

    @Override
    public boolean withdraw(double amount) {
        if(_balance < amount){
            System.out.println("Insufficent fund");
            return false;
        }
        else{
            _balance -= amount;
            System.out.println("Successfully widthdraw: "+ amount);
            return true;
        }
    }

    @Override
    public void getBalance() {
        System.out.println("Current Account Balance: "+ _balance );
    }
}


public class InterfaceBank {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount();
        CurrentAccount currentAccount = new CurrentAccount();

        savingAccount.deposit(300);
        savingAccount.withdraw(300);
        savingAccount.getBalance();

        currentAccount.deposit(5000);
        currentAccount.withdraw(6000);
        currentAccount.withdraw(2000);
        currentAccount.getBalance();
    }
}
