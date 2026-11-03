public class account {
    int yearOpened, accountNumber;
    double balance;

    public account(int yearOpened, int accountNumber, double balance){
        this.yearOpened = yearOpened;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    double deposit(double amount){
        balance += amount;
        return balance;
    }

    double withdraw(double amount){
        if (amount <= balance) {
            balance -= amount;
        }else {
            System.out.println("Insufficient funds!");
        }
        return balance;
    }
}
