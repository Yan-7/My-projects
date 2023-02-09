import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Client {
    // – represent a bank client with current balance

    private static int counter;
    private static int Logcounter = 0;


    private int clientId;
    private String name;
    private float balance;
    private Account[] accounts;
    protected float commissionRate;
    protected float interestRate;


    public Client(String name, float balance, float commissionRate, float interestRate) {
        this.clientId = counter++;
        this.name = name;
        this.balance = balance;
        this.accounts = new Account[5];
        this.commissionRate = commissionRate;
        this.interestRate = interestRate;

    }

    public int getId() {
        return clientId;
    }

    public String getName() {
        return name;
    }

    public float getBalance() {
        return balance;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void addAccount(Account account) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] == null) {
                accounts[i] = account;
                System.out.println("account " + account.getId() + " added");
                Log log = new Log(account.getId(), "account added", 0);
                return;
            }
        }
    }

    public Account getAccount(int accountId) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getId() == accountId) {
                return accounts[i];
            }
        }
        System.out.println("account does not exist");
        return null;
    }

    public void removeAccount(int accountID) {
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i].getId() == accountID) {
                accounts[i] = null;
                System.out.println("account " + accountID + " removed");

                return;
            }
        }
    }

    public void deposit(float num) throws DepositException { // TODO: 14/07/2022 commision
        if (num > 0) {
            this.balance = getBalance() + num;
            System.out.println("money deposited");
            Log log = new Log(clientId, "deposit", num);
            Logger.myLogs.add(log);
            return;

        } else {
            throw new DepositException();
        }
    }

    public void withdraw(float num) throws WithdrawException { // TODO: 14/07/2022 commision
        if (this.balance >= num) {
            this.balance = getBalance() - num;
            System.out.println(this.getName() + " withdraw " + num);
            Log log = new Log(clientId, "withdraw", num);
            Logger.myLogs.add(log);

            return;
        } else {
            throw new WithdrawException(balance, name, num);
        }
    }

    public void autoUpdateAccounts() { // TODO: 14/07/2022 works???
        for (int i = 0; i < accounts.length; i++) {
            if (accounts[i] != null) {
                accounts[i].setBalance(accounts[i].getBalance() + commissionRate);
            }
        }
    }

    public float getFortune() {
        float sum = 0;
        for (int i = 0; i < this.accounts.length; i++) {
            sum += accounts[i].getBalance();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                ", accounts=" + Arrays.toString(accounts) +

                '}';
    }

    public static Client[] factory(int num) {

        Client[] fClients = new Client[num];
        int counter = 0;

        for (int i = 0; i < fClients.length; i++) {
            int balance = (int) (Math.random() * 1000);
            fClients[i] = new Regular("Bob" + counter, balance);
            counter++;

            Account account = new Account(counter, balance);
            fClients[i].addAccount(account);
        }
        return fClients;
    }
    //------
}