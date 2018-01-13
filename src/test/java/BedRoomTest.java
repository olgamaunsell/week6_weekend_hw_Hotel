import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedRoomTest {

    private BedRoom bedRoom1;

    @Before

    public void before(){
        bedRoom1 = new BedRoom(1, 24, RoomType.SINGLE);
    }

    @Test
    public void canGetRoomNumber() {
        assertEquals(24, bedRoom1.getRoomNumber());
    }
}
