import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;

    @Before

    public void before(){
        conferenceRoom = new ConferenceRoom(15, "Sun Room", 90.0);
    }

    @Test

    public void canGetName(){
        assertEquals("Sun Room", conferenceRoom.getName());

    }

    @Test

    public void canChangeName(){
        conferenceRoom.setName("Sunny Room");
        assertEquals("Sunny Room", conferenceRoom.getName());
    }

    @Test

    public void canGetRate(){
        assertEquals(90.0, conferenceRoom.getRate(), 0.01);
    }


}
