import java.util.ArrayList;

public class DiningRoom extends Room {

    private ArrayList<Guest> guests;

    public DiningRoom(int capacity){
        super(capacity);
        this.guests = new ArrayList<>();
    }
}
