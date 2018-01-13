import java.util.ArrayList;

public class Room {

    private int capacity;
    private boolean chargeable;
    private ArrayList<Guest> guests;

    public Room(int capacity, boolean chargeable) {
        this.capacity = capacity;
        this.chargeable = chargeable;
        this.guests = new ArrayList<>();
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public void checkInGuest(Guest guest) {
        this.guests.add(guest);
    }

    public void checkOutGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public int getCapacity() {
        return this.capacity;
    }

    public boolean getChargeable() {
        return this.chargeable;
    }
}
