public enum RoomType {
    SINGLE(1, 60),
    DOUBLE(2, 100),
    Triple(3, 120),
    DoubleDeluxe(2, 180),
    DoublePentHouse(4, 400);

    private final int capacity;
    private final double rate;

    RoomType(int capacity, double rate){
        this.capacity = capacity;
        this.rate = rate;
    }

    public int getCapacity(){
        return this.capacity;
    }

    public double getRate(){
        return this.rate;
    }
}
