import java.util.Arrays;

public class Hotel {
    private Room[] rooms;
    private String name;
    private int stars;

    public Hotel(String name, int stars) {
        this.rooms = new Room[3];
        this.name = name;
        this.stars = stars;
    }

    public void setRooms(Room[] rooms) {
        this.rooms = rooms;
    }

    public boolean hasGuestHotel(Guest guest) {
        for (int i = 0; i <= 10; i++) {
            if (rooms[i].hasGuest(guest)) {
                System.out.println("guest fount");
                return true;
            }
        }
        System.out.println("guest is not there");
        return false;
    }

    public void roomsFactory() {
        int counter = 0;
        for (int i = 0; i < rooms.length; i++) {
            rooms[i] = new Room(5, "apt" + counter, 100);
            counter++;
        }
    }
    public void addRoom(Room room, int roomNum) {
        rooms[roomNum] = room;
    }
    public void book(Guest guest,String roomName) {
        for (int i = 0; i <rooms.length ; i++) {
            if (rooms[i].getRoomName() == roomName) {
                rooms[i].addGuest(guest);
                System.out.println("guest booked");
                return;
            }
        }
        System.out.println("guest not added");
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "rooms=" + Arrays.toString(rooms) +
                ", name='" + name + '\'' +
                ", stars=" + stars +
                '}';
    }
    //--------
}
