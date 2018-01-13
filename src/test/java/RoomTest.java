import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RoomTest {
    private Room room1;
    private Room room2;

    private Guest guest1;
    private Guest guest2;

    @Before

    public void before() {
        room1 = new Room(1);
        guest1 = new Guest("Jimmy Choo");
        guest2 = new Guest("Lis Smith");
    }

    @Test
    public void canGetCapacity(){
        assertEquals(1, room1.getCapacity());
    }

    @Test

    public void roomStartsEmpty() {
        assertEquals(0, room1.getGuestCount());
    }

    @Test

    public void canCheckInGuestToRoom() {
        room1.checkInGuest(guest1);
        assertEquals(1, room1.getGuestCount());
    }

    @Test

    public void canCheckOutGuestFromRoom() {
        room1.checkInGuest(guest1);
        int guestCountBefore = room1.getGuestCount();
        room1.checkOutGuest(guest1);
        assertEquals(guestCountBefore - 1, room1.getGuestCount());
    }


    @Test

    public void canCheckInTwoGuests() {
        int guestCountBefore = room1.getGuestCount();
        room1.checkInGuest(guest1);
        room1.checkInGuest(guest2);

        assertEquals(guestCountBefore + 2, room1.getGuestCount());

    }
}
