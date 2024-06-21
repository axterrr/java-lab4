package hibskyi;

@FactoryElement("bus")
public class Bus implements Transport {

    @Color
    private String color;

    @PositiveNumber
    private int numberOfSeats;

    @LicensePlate
    private String licensePlate;

    public Bus(){}

    public Bus(String color, int numberOfSeats, String licensePlate) {
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.licensePlate = licensePlate;
    }

    public void stop() {
        System.out.println("Bus stopped");
    }

    public void startMoving() {
        System.out.println("Bus started moving");
    }

    public void moveStraight() {
        System.out.println("Bus moved straight");
    }

    public void turnRight(){
        System.out.println("Bus turned right");
    }

    public void turnLeft(){
        System.out.println("Bus turned left");
    }

    public void driveOnCrossing() {
        System.out.println("Bus drove up to crossroads");
    }
}
