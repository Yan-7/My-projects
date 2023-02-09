import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    //singleton bank todo

    private String bankName;
    private int logCount =0;
    private float bankBalance; // charge commissions;
    private ArrayList<Client> clients;



    //    private accountUpdater; // TODO: 14/07/2022


    public Bank(String bankName, float bankBalance) {
        this.bankName = bankName;
        this.logCount = 0;
        this.bankBalance = bankBalance;
        this.clients = new ArrayList<Client>();

    }

    public float getBankBalance() {
        return bankBalance;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }


    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public float getTotalFortune() {
        float sum = 0;
        for (int i = 0; i < clients.size(); i++) {
            if (clients.get(i) != null) {
                sum += clients.get(i).getFortune();
            }
        }
        return sum;
    }

    public void addClient(Client client) {
        clients.add(client);
        System.out.println(client.getName() + " joined");
        Log log = new Log(client.getId(),"addClient",0);
        Logger.myLogs.add(log);


    }

    public void removeClient(Client client) {
        clients.remove(client);
        System.out.println(client.getName() + " added");
        Log log = new Log(client.getId(),"client removed",0);
        Logger.myLogs.add(log);
    }


    public void viewLogs(Logger logger) { // TODO: 14/07/2022 ???
        System.out.println(logger);
    }

    public void startAccountUpdater() { // TODO: 14/07/2022
    }

    @Override
    public String toString() {
        return "Bank{" +
                "bankName='" + bankName + '\'' +
                ", logCount=" + logCount +
                ", bankBalance=" + bankBalance +
                ", clients=" + clients +
                '}';
    }
}
