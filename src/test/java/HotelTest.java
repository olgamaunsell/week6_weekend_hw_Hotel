import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private String name;
    private double till;
    private BedRoom bedRoom1;
    private BedRoom bedRoom2;

    @Before

    public void before(){
        hotel = new Hotel("The Carlton", 0.00);
        bedRoom1 = new BedRoom(2, true, 8, RoomType.DoubleDeluxe);
        bedRoom2 = new BedRoom(3, true, 8, RoomType.Triple);
    }

    @Test

    public void canGetName(){
        assertEquals("The Carlton", hotel.getName());
    }

    @Test

    public void bedRoomListStartsEmpty(){
        assertEquals(0, hotel.getBedRoomCount());

    }

    @Test

    public void conferenceRoomListStartsEmpty(){
        assertEquals(0, hotel.getConferenceRoomCount());

    }

    @Test

    public void diningRoomListStartsEmpty(){
        assertEquals(0, hotel.getDiningRoomCount());

    }

    @Test

    public void canAddTwoBedRoomsToBedRoomList(){
        int bedRoomCountBefore = hotel.getBedRoomCount();

        hotel.addBedRoom(bedRoom1);
        hotel.addBedRoom(bedRoom2);
        assertEquals(bedRoomCountBefore+2,hotel.getBedRoomCount() );

    }

    @Test

    public void canRemoveOneBedRoomFromBedRoomList(){
        int bedRoomCountBefore = hotel.getBedRoomCount();

        hotel.addBedRoom(bedRoom1);
        hotel.addBedRoom(bedRoom2);
        hotel.removeBedRoom(bedRoom2);
        assertEquals(bedRoomCountBefore+1,hotel.getBedRoomCount() );

    }
}


//tests to
//1. add bedroom to bedroom array list - done
//2. add conference room to conf room list
//3.  remove bedroom from bedroom list - done
//4.  remove conf room from conf room list
//5. checkin guest(s) to a room (pass in array of guests)
// if room chargeable - "pay room" method uses room rate to add to hotel till

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


// 3. // "refund" method extension ?