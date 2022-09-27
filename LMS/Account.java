package LMS;

public class Account {
    protected int account_number;
    protected float balance;

    public void setAccount(int account_number, float initial_balance) {
        this.account_number = account_number;
        this.balance = initial_balance;
    }
}