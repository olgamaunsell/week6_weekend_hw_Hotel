import java.util.ArrayList;

public class Hotel {

    private Hotel hotel;
    private String name;
    private double till;
    private ArrayList<BedRoom> bedRooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<DiningRoom> diningRooms;
    private ArrayList<Guest> guests;


    public Hotel(String name, double till, ArrayList<BedRoom> bedRooms, ArrayList<ConferenceRoom> conferenceRooms,
                 ArrayList<DiningRoom> diningRooms ){
        this.name = name;
        this.till = till;
        this.bedRooms = new ArrayList<>(bedRooms);
// should I have separate array lists for vacant and occupied bedrooms ?
        this.conferenceRooms = new ArrayList<>(conferenceRooms);
        this.diningRooms = new ArrayList<>(diningRooms);

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

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public void removeConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.remove(conferenceRoom);
    }

    public void addDiningRoom(DiningRoom diningRoom) {
        this.diningRooms.add(diningRoom);
    }


    public void checkInGuestsToRoom(ArrayList<Guest> guests, BedRoom bedRoom) {

        for(BedRoom hotelBedRoom : this.bedRooms){
            if(hotelBedRoom.equals(bedRoom)) {
                for (Guest guest : guests) {
                    hotelBedRoom.checkInGuest(guest);
                }
            }

        }
    }
}
