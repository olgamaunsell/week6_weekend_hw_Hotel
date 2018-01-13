import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    private BedRoom bedRoom1;
    private Guest guest1;
    private Guest guest2;

    @Before

    public void before(){
        bedRoom1 = new BedRoom(1, 24, RoomType.Single);
        guest1 = new Guest("Jimmy Choo");
        guest2 = new Guest("Lis Smith");
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(24, bedRoom1.getRoomNumber());
    }

    @Test
    public void canGetRoomType(){
        assertEquals(RoomType.Single, bedRoom1.getRoomType());
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, bedRoom1.getCapacity());
    }


    @Test

    public void canCheckInGuestToRoom() {
        bedRoom1.checkInGuest(guest1);
        assertEquals(1, bedRoom1.getGuestCount());
    }
}
