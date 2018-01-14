import java.util.ArrayList;

public class Hotel {

    private Hotel hotel;
    private String name;
    private double till;
    private ArrayList<BedRoom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;


    public Hotel(String name, double till){
        this.name = name;
        this.till = till;
        this.bedRooms = new ArrayList<>();
// should I have separate array lists for vacant and occupied bedrooms ?
        this.conferenceRooms = new ArrayList<>();
        this.diningRooms = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public int getBedRoomCount() {
        return this.bedRooms.size();
    }

    public int getConferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public int getDiningRoomCount() {
        return this.diningRooms.size();
    }

    public void addBedRoom(BedRoom bedRoom) {
        this.bedRooms.add(bedRoom);
    }

    public void removeBedRoom(BedRoom bedRoom) {
        this.bedRooms.remove(bedRoom);
    }
}
