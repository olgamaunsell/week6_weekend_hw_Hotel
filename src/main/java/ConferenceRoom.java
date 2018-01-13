public class ConferenceRoom extends Room {

    private String name;
    private double rate;

    public ConferenceRoom(int capacity, String name, double rate){
        super(capacity);
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
