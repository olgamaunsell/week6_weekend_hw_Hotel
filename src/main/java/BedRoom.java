import java.util.ArrayList;

public class BedRoom extends Room  {

    private int roomNumber;
    private RoomType roomType;
    private double rate;

    public BedRoom(int capacity, boolean chargeable, int roomNumber, RoomType roomType) {
//        will override capacity in this class to use the RoomType capacity ??
        super(capacity, chargeable);
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }


    public RoomType getRoomType() {
        return this.roomType;
    }

//    public void checkInPrimaryGuest(Guest guest) {
////        Check room is vacant before adding Primary guest
//        if (getGuestCount() != 0) {
//            this.guests.add(guest);
//        }
//    }

    public double getRoomRate() {
        return getRoomType().getRate();

    }
}



