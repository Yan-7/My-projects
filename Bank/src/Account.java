public class Account {
    // – long term savings opened by client

    private int accountId;
    private float balance;

    public Account(int id, float balance) {
        this.accountId = id;
        this.balance = balance;
    }

    public int getId() {
        return accountId;
    }

    public float getBalance() {
        return balance;
    }

    public void setId(int id) {
        this.accountId = id;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + accountId +
                ", balance=" + balance +
                '}';
    }
}
