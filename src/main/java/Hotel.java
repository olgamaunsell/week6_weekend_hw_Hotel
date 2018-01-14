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
        this.bedRooms = bedRooms;
// should I have separate array lists for vacant and occupied bedrooms ?
        this.conferenceRooms = conferenceRooms;
        this.diningRooms = diningRooms;
    }

    public String getName() {
        return this.name;
    }
}
