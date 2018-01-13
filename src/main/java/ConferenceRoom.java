import java.util.ArrayList;

public class ConferenceRoom extends Room {

    private ArrayList<Guest> guests;
    private String name;
    private double rate;

    public ConferenceRoom(int capacity, boolean chargeable, String name, double rate){
        super(capacity, chargeable);
        this.guests = new ArrayList<>();
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return this.rate;
    }
}
