public enum RoomType {
    Single(1,60),
    Double(2, 100),
    Triple(3,120),
    DoubleDeluxe(2,180),
    DoublePentHouse(4, 400);

    private final int capacity;
    private final int rate;

    RoomType(int capacity, int rate){
        this.capacity = capacity;
        this.rate = rate;

    }

    public int getCapacity(){
        return this.capacity;

    }

    public int getRate(){
        return this.rate;
    }
}
