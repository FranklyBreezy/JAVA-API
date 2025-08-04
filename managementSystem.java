interface Entity {
    String getName();
    void setName(String name);

    int getCheckIn();
    void setCheckIn(int checkIn);

    int getCheckOut();
    void setCheckOut(int checkOut);
}

class Guest implements Entity {
    private String name;
    private int checkIn;
    private int checkOut;

    public Guest(String name, int checkIn, int checkOut) {
        this.name = name;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String getName() { return name; }

    @Override
    public void setName(String name) { this.name = name; }

    @Override
    public int getCheckIn() { return checkIn; }

    @Override
    public void setCheckIn(int checkIn) { this.checkIn = checkIn; }

    @Override
    public int getCheckOut() { return checkOut; }

    @Override
    public void setCheckOut(int checkOut) { this.checkOut = checkOut; }

    @Override
    public String toString() {
        return "Guest{name='" + name + "', checkIn=" + checkIn + ", checkOut=" + checkOut + "}";
    }
}

public class ManagementSystem {
    public static void main(String[] args) {
        Guest g1 = new Guest("Alice", 10, 18);
        System.out.println(g1);
    }
}
