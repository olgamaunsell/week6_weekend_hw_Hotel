import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {
    private Room room;
    private Guest guest1;

    @Before

    public void before(){
        room = new Room(1, RoomType.Single);
        guest1 = new Guest("Jimmy Choo");
    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(1, room.getRoomNumber());
    }

    @Test

    public void roomStartsEmpty(){
        assertEquals(0, room.getGuestCount());
    }

    @Test

    public void canAddGuestToRoom(){
        room.checkInGuest(guest1);
        assertEquals(1,room.getGuestCount());
    }
}

