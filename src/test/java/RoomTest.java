import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {
    private Room room;

    @Before

    public void before(){
        room = new Room(1, RoomType.Single);

    }

    @Test
    public void canGetRoomNumber(){
        assertEquals(1, room.getRoomNumber());
    }

    @Test

    public void roomStartsEmpty(){
        assertEquals(0, room.getGuestCount());
    }
}

