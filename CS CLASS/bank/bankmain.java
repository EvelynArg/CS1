
public class bankmain {
    
    public static void main(String[] args){
        //CUSTOMER 1
        account account1 = new account(2026, 1234, 1000.00);
        customer customer1 = new customer("Evelyn Perez", "12345", account1);
        //CUSTOMER 2
        account account2 = new account(2025, 5678, 500.00);
        customer customer2 = new customer("Ivana Martinez", "67890", account2);
        //CUSTOMER 3
        account account3 = new account(2024, 9012, 2000.00);
        customer customer3 = new customer("Atenea Perez", "54321", account3);

        //DISPLAY CUSTOMER INFORMATION
        System.out.println("Customer 1:" + customer1.name + "Account Balance: " + customer1.bankAccount.balance);
        account1.deposit(500.00);
        account2.withdraw(500);
        System.out.println("Customer 2:" + customer2.name + "Account Balance: " + customer2.bankAccount.balance);
        customer3.displayCustomerInfo();
    }
}
