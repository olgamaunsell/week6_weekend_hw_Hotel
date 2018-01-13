import java.util.ArrayList;

public class BedRoom extends Room  {

    private int roomNumber;
    private RoomType roomType;
    private ArrayList<Guest> guests;
    private double rate;

    public BedRoom(int capacity, int roomNumber, RoomType roomType) {
//        will override capacity in this class to use the RoomType capacity ??
        super(capacity);
        this.guests = new ArrayList<>();
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }


    public RoomType getRoomType() {
        return this.roomType;
    }
}



