import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before

    public void before(){
        guest = new Guest("Jimmy Choo");
    }

    @Test

    public void canGetName(){
        assertEquals("Jimmy Choo", guest.getName());

    }
}
