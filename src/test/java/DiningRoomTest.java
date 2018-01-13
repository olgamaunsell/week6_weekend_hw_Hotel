import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DiningRoomTest  {

    private DiningRoom diningRoom;

    private Guest guest1;
    private Guest guest2;

    @Before

    public void before(){

        diningRoom = new DiningRoom(150, false );
        guest1 = new Guest("Donald Duck");
        guest2 = new Guest("Mickey Mouse");
    }


    @Test

    public void canCheckInTwoGuests() {
        int guestCountBefore = diningRoom.getGuestCount();
        diningRoom.checkInGuest(guest1);
        diningRoom.checkInGuest(guest2);

        assertEquals(guestCountBefore + 2, diningRoom.getGuestCount());

    }

}
