package hibskyi;

@FactoryElement("bike")
public class Bike implements Transport {

    @Color
    private String color;

    @PositiveNumber
    private int numberOfSeats;

    @LicensePlate
    private String licensePlate;

    public Bike(){}

    public Bike(String color, int numberOfSeats, String licensePlate) {
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.licensePlate = licensePlate;
    }

    public void stop() {
        System.out.println("Bike stopped");
    }

    public void startMoving() {
        System.out.println("Bike started moving");
    }

    public void moveStraight() {
        System.out.println("Bike moved straight");
    }

    public void turnRight(){
        System.out.println("Bike turned right");
    }

    public void turnLeft(){
        System.out.println("Bike turned left");
    }

    public void driveOnCrossing() {
        System.out.println("Bike drove up to crossroads");
    }
}
