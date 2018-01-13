import java.util.ArrayList;

public class DiningRoom extends Room {

    private ArrayList<Guest> guests;

    public DiningRoom(int capacity, boolean chargeable){
        super(capacity, chargeable);
        this.guests = new ArrayList<>();
    }
}
