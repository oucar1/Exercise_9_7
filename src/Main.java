public class Main {
    public static void main(String[] args) {
        // Create an account with id 1122, balance $20,000, and interest rate 4.5%
        Account account = new Account(1122, 20000);
        account.setAnnualInterestRate(4.5);

        // Withdraw $2,500
        account.withdraw(2500);

        // Deposit $3,000
        account.deposit(3000);

        // Print account details
        System.out.println("Account ID: " + account.getId()); // 1122
        System.out.println("Balance: $" + account.getBalance()); // 20500
        System.out.println("Annual Interest Rate: " + account.getAnnualInterestRate()); // 4.5
        System.out.println("Monthly Interest Rate: " + account.getMonthlyInterestRate()); // $0.00375
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest()); // $76.875
        System.out.println("Account created on: " + account.getDateCreated()); // Date

        account.setId(123);

        System.out.println("\nAccount ID: " + account.getId()); // 123
        System.out.println("Balance: $" + account.getBalance()); // 20500

        account.setBalance(1000);
        System.out.println("Updated Balance: $" + account.getBalance()); // 1000
        account.withdraw(1500);
        account.deposit(3000);
        System.out.println("Balance $: " + account.getBalance());
        System.out.println("Monthly Interest: $" + account.getMonthlyInterest());
    }
}
