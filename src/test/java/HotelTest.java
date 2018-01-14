import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private String name;
    private double till;
    ArrayList<BedRoom> bedRooms;
    private BedRoom bedRoom1;
    private BedRoom bedRoom2;
    private BedRoom bedRoom3;
    private BedRoom bedRoom4;
    ArrayList<ConferenceRoom> conferenceRooms;
    private ConferenceRoom conferenceRoom1;
    private ConferenceRoom conferenceRoom2;
    private ConferenceRoom conferenceRoom3;
    private ConferenceRoom conferenceRoom4;
    ArrayList<DiningRoom> diningRooms;
    private DiningRoom diningRoom1;
    ArrayList<Guest> guests;
    private Guest guest1;
    private Guest guest2;


    @Before

    public void before(){
        bedRooms = new ArrayList<>();
        bedRoom1 = new BedRoom(2, true, 8, RoomType.DoubleDeluxe);
        bedRoom2 = new BedRoom(3, true, 2, RoomType.Triple);
        bedRoom3 = new BedRoom(4, true, 15, RoomType.DoublePentHouse);
        bedRoom4 = new BedRoom(1, true, 3, RoomType.DoublePentHouse);
        bedRooms.add(bedRoom1);
        bedRooms.add(bedRoom2);
        conferenceRooms = new ArrayList<>();
        conferenceRoom1 = new ConferenceRoom(10, true, "Sunny Room", 65);
        conferenceRoom2 = new ConferenceRoom(25, true, "Lakeview Room", 150);
        conferenceRoom3 = new ConferenceRoom(30, true, "Mountainview Room", 225);
        conferenceRoom4 = new ConferenceRoom(12, true, "Castle Room", 80);
        conferenceRooms.add(conferenceRoom1);
        conferenceRooms.add(conferenceRoom2);
        diningRooms = new ArrayList<>();
        diningRooms.add(diningRoom1);
        // Hotel setup with 2 bedrooms, 2 conference rooms and 1 dining room
        hotel = new Hotel("The Carlton", 0.00, bedRooms, conferenceRooms, diningRooms);

        guest1 = new Guest("Donald Trump");
        guest2 = new Guest("Nicola Sturgeon");
        guests = new ArrayList<>();
        guests.add(guest1);
        guests.add(guest2);

    }

    @Test

    public void canGetName(){
        assertEquals("The Carlton", hotel.getName());
    }

//    @Test
//
//    public void bedRoomListStartsEmpty(){
//        assertEquals(0, hotel.getBedRoomCount());
//
//    }

//    @Test
//
//    public void conferenceRoomListStartsEmpty(){
//        assertEquals(0, hotel.getConferenceRoomCount());
//
//    }

//    @Test
//
//    public void diningRoomListStartsEmpty(){
//        assertEquals(0, hotel.getDiningRoomCount());
//
//    }

    @Test

    public void canAddTwoBedRoomsToBedRoomList(){
        int bedRoomCountBefore = hotel.getBedRoomCount();

        hotel.addBedRoom(bedRoom1);
        hotel.addBedRoom(bedRoom2);
        assertEquals(bedRoomCountBefore+2,hotel.getBedRoomCount() );

    }

    @Test

    public void canRemoveOneBedRoomFromBedRoomList(){


        hotel.addBedRoom(bedRoom1);
        hotel.addBedRoom(bedRoom2);
        int bedRoomCountBefore = hotel.getBedRoomCount();
        hotel.removeBedRoom(bedRoom2);
        assertEquals(bedRoomCountBefore-1,hotel.getBedRoomCount() );

    }

    @Test

    public void canAddTwoConfRoomsToConfRoomList(){
        int confRoomCountBefore = hotel.getConferenceRoomCount();

        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);
        assertEquals(confRoomCountBefore+2,hotel.getConferenceRoomCount() );

    }

    @Test

    public void canRemoveOneConfRoomFromConfRoomList() {

        hotel.addConferenceRoom(conferenceRoom1);
        hotel.addConferenceRoom(conferenceRoom2);
        int confRoomCountBefore = hotel.getConferenceRoomCount();
        hotel.removeConferenceRoom(conferenceRoom1);
        assertEquals(confRoomCountBefore -1, hotel.getConferenceRoomCount());
    }

//    @Test
//
//    public void canAddDiningRoomToDiningRoomList(){
//        int diningRoomCountBefore =  hotel.getDiningRoomCount();
//        hotel.addDiningRoom(diningRoom1);
//        assertEquals(diningRoomCountBefore+1, hotel.getDiningRoomCount());
//    }


    @Test

    public void canCheckInGuestsToBedRoom(){
        hotel.checkInGuestsToRoom(guests, bedRoom1);
        assertEquals(2, bedRoom1.getGuestCount());

    }
}


//tests to
//1. add bedroom to bedroom array list - done
//2. add conference room to conf room list - done
//3.  remove bedroom from bedroom list - done
//4.  remove conf room from conf room list - done
// add dining room to dining room list   - done

//5. checkin guest(s) to a room (pass in array of guests)
// if room chargeable - "pay room" method uses room rate to add to hotel till
// cant checkin guest group to room if exceeds capacity of room
// can't checkin guest group to room if not empty

//6. checkout guest(s) from room
//7. check which guest(s), if any, are checked into a particular room.
// - method receives (room) as parameter - return array of guests for that room = get name of those guests => guest.name
//8. can only check in guests array to bedroom or conference room if room empty
// can only check in group of guests if room has capacity
// - checkinguests(array) size <= room guests (array) size
//extensions
//1.	Add functionality to the hotel so it can see a list of vacant bedrooms.
// check the bedroom array list - use bedroom.getGuestCount() to determine which rooms are empty
// - store and return new array of empty bedrooms
//2.	Add functionality to check in guests to bedrooms for a number of nights.
//- add additional parameter to checkinguests method for no of nights and multiply rate by number of nights

//Olga's Extensions
// remove dining room from dining room list
// 1. removeDiningRoom()
// 2. "refund" method extension ?