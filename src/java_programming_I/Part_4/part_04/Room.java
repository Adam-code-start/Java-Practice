package java_programming_I.Part_4.part_04;

public class Room {
    private String code;
    private int seats;

    public Room(String classCode, int numberOfSeats)
    {
        code = classCode; // or this.code = classCode;
        seats = numberOfSeats; // or this.seats = numberOfSeats;
    }
}
