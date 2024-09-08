import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    // No-arg constructor  with the default values
    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Constructor with specified id and balance
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    // Accessor method for Id
    public int getId() {
        return id;
    }

    // Mutator method for id
    public void setId(int id) {
        this.id = id;
    }

    // Accessor method for balance
    public double getBalance() {
        return balance;
    }

    // Mutator method for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Accessor method for annual interest rate
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    // Mutator method for annual interest rate
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    // Accessor method for dateCreated
    public Date getDateCreated() {
        return dateCreated;
    }

    // Method to get the monthly interest rate
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12 / 100;
    }

    // Method to calculate monthly interest
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Method to withdraw a specified amount
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to deposit a specified amount
    public void deposit(double amount) {
        balance += amount;
    }
}
