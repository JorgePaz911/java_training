package Day2;

class InsufficientFundException extends Exception{
    private int amount;

    public  InsufficientFundException(){
        System.out.println("Insufficient amount requested");
    }

    public InsufficientFundException(String message){
        System.out.println(message);
    }

    public InsufficientFundException(int amount){
        System.out.println("Amount: "+ amount+ ", Invalid");
    }
}

class Account{
    private int balance = 0;
    private  int accountNumber;

    public Account(int accountNumber){
        this.accountNumber = accountNumber;
    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("Amount credit: "+ amount);
    }

    public void withdraw(int amount) throws InsufficientFundException {
        if(amount <= balance){
            balance -= amount;
            System.out.println("Amount debited: "+ amount);
        }else{
            throw new InsufficientFundException();
//            try {
//                throw new InsufficientFundException();
//            } catch (InsufficientFundException e) {
//                e.printStackTrace();
//            }
        }
    }

    public int getBalance(){
        return balance;
    }

    public int getAccountNumber(){
        return accountNumber;
    }
}



public class ExceptionAccount {
    public static void main(String[] args) {
        Account account = new Account(123456);
//        System.out.println(account.getBalance());
//        account.deposit(5000);
//        account.withdraw(2000);
//        account.deposit(1000);
//        account.withdraw(10000);
        account.deposit(5000);
        try{
            account.withdraw(2000);
        }catch (InsufficientFundException ex){
            ex.printStackTrace();
        }
        account.deposit(1000);
        try{
            account.withdraw(10000);
        }catch (InsufficientFundException ex){
            ex.printStackTrace();
        }
    }
}
