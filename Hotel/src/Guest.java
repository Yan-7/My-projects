public class Guest {

    private int id;
    private String name;

    public Guest(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Guest() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Guest)) return false;

        Guest guest = (Guest) o;

        if (id != guest.id) return false;
        return name != null ? name.equals(guest.name) : guest.name == null;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
