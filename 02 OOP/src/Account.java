import java.util.Random;

public class Account {

    private double balance;
    private int agency;
    private int number;
    private Client holder = new Client();
    static private int accounts; //this variable is shared for all Accounts classes

    //Initializing primary constructor and secondary constructor calling primary one
    public Account(double balance, int agency) throws Exception {
        Random rand = new Random();

        this.balance = balance;
        this.number = rand.nextInt();

        if (agency <= 0) {
            throw new Exception("Wrong agency number");
        } else {
            this.agency = agency;
            Account.accounts++;
        }
    }

    public Account(int agency) throws Exception {
        this(0.0, agency);
    }

    //Default methods
    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        this.balance = this.balance + balance;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        if (agency > 0 ) {
            this.agency = agency;
        }
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Client getHolder() {
        return holder;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public static int getAccounts() {
        return accounts;
    }

    //Personalized methods
    public boolean deposit(double balance) {
        if (balance > 0) {
            setBalance(balance);
            return true;
        } else {
            return false;
        }
    }

    public boolean withdraw(double balance) {
        if (this.balance >= balance) {
            this.balance = this.balance - balance;
            return true;
        }
        return false;
    }

    public boolean transfer(double balance, Account account) {
        if (balance <= this.balance) {
            this.balance -= balance;
            account.balance += balance;
            return true;
        }
        return false;
    }
}
