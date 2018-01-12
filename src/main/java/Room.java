import java.util.ArrayList;

public class Room {

    private int roomNumber;
    private RoomType roomType;
    private ArrayList<Guest> guests;

    public Room(int roomNumber, RoomType roomType) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.guests = new ArrayList<>();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public void checkInGuest(Guest guest) {
        this.guests.add(guest);
    }
}
