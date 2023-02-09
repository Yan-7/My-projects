public class Test {
    public static void main(String[] args) {

        Guest guest1 = new Guest(1, "Bob");
        Guest guest2 = new Guest(2, "Simon");
        Guest guest3 = new Guest(1, "Bob");
        Guest guest4 = new Guest(1, "Bob");

        Hotel hotel1 = new Hotel("Hilton",3);
        Room room1 = new Room(5,"new room",400);
        room1.addGuest(guest1);
        hotel1.roomsFactory();
        hotel1.addRoom(room1,0);

        hotel1.book(guest2,"new room");
        System.out.println(hotel1);



        //--------
    }
}
