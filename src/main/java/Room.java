public class Room {

    private int roomNumber;
    private RoomType roomType;

    public Room(int roomNumber, RoomType roomType) {

        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }
}
