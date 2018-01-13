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

    @Test

    public void canChangeName(){
        guest.setName("James Brown");
        assertEquals("James Brown", guest.getName());

    }

    @Test
    public void cantChangeNameToEmpty(){
        guest.setName("");
        assertEquals("Jimmy Choo", guest.getName());
    }

    @Test
    public void cantChangeNameToNull(){
        guest.setName(null);
        assertEquals("Jimmy Choo", guest.getName());
    }
}

