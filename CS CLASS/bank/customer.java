public class customer {
    String name, uniqueID;
    account bankAccount;
    Object customer;

    customer(String name, String uniqueID, account bankAccount){
        this.name = name;
        this.uniqueID = uniqueID;
        this.bankAccount = bankAccount;
    }

    void displayCustomerInfo(){
        System.out.println("Customer Name: " + name);
        System.out.println("Unique ID: " + uniqueID);
        System.out.println("Account Number: " + bankAccount.accountNumber);
        System.out.println("Account Balance: " + bankAccount.balance);
    }
}
