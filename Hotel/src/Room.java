import java.util.Arrays;

public class Room {

    private int maxGuests;
    private int numOfGuests;
    private Guest[] guests;
    private String roomName;
    private int price;

    public Room(int maxGuests , String roomName, int price) {
        this.maxGuests = maxGuests;
        this.numOfGuests = 0;
        this.guests = new Guest[maxGuests];
        this.roomName = roomName;
        this.price = price;
    }

    public Room() {
    }

    public String getRoomName() {
        return roomName;
    }

    public void setNumOfGuests(int numOfGuests) {
        this.numOfGuests = numOfGuests;
    }

    private  boolean isFull() {
        if (numOfGuests== maxGuests ) {
            return true;
        }
        return false;
    }

    public boolean addGuest(Guest guest) {
        if (isFull()) {
            System.out.println("room is full");
            return false;
        }
        for (int i = 0; i <maxGuests ; i++) {
            if (guests[i] == null) {
                guests[i] = guest;
                setNumOfGuests(numOfGuests+1);
                System.out.println("guest added");
                return true;
            }
        }
        System.out.println("room full");
        return false;
    }
    public boolean hasGuest(Guest guest) {
        for (int i = 0; i <maxGuests ; i++) {
            if (guests[i].equals(guest)) {
                System.out.println("has guest");
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Room{" +
                "guests=" + Arrays.toString(guests) +
                ", numOfGuests=" + numOfGuests +
                ", roomName='" + roomName + '\'' +
                ", price=" + price +
                '}';
    }
}
