public class encapsulation{
    public static void main(String[]args){
        BankAccount ba=new BankAccount();
        ba.deposit(1000);
        ba.withdraw(500);
        System.out.println(ba.getBalance());
        

    }
}
class BankAccount{
    private double balance;

    public void deposit(double amount){
        balance+=amount;

    }
    public void withdraw(double amount){
        balance-=amount;

    }
    //getter setter
    public double getBalance(){
        return balance;

    }
}

