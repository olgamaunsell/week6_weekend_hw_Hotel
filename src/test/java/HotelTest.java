import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private String name;
    private double till;

    @Before

    public void before(){
        hotel = new Hotel("The Carlton", 0.00);
    }

    @Test

    public void canGetName(){
        assertEquals("The Carlton", hotel.getName());
    }
}


//tests to
//1. add bedroom to bedroom array list
//2. add conference room to conf room list
//3.  remove bedroom from bedroom list
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