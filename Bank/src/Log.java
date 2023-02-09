import java.sql.Timestamp;

public class Log {
    // – details on a single client operation
    //private long timeStamp = 0;
    private int clientId;
    private String description;
    private float amount;

    // TODO: 17/07/2022 need time stamp

    public Log( int clientId, String description, float amount) {

        this.clientId = clientId;
        this.description = description;
        this.amount = amount;
    }


    public int getClientId() {
        return clientId;
    }

    public String getDescription() {
        return description;
    }

    public float getAmount() {
        return amount;
    }



    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Log{" +
                ", clientId=" + clientId +
                ", description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }

    public String getData() {
        return clientId +description +amount; // TODO: 14/07/2022
    }
}
