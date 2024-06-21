package hibskyi;

@FactoryElement("car")
public class Car implements Transport {

    @Color
    private String color;

    @PositiveNumber
    private int numberOfSeats;

    @LicensePlate
    private String licensePlate;

    public Car(){}

    public Car(String color, int numberOfSeats, String licensePlate) {
        this.color = color;
        this.numberOfSeats = numberOfSeats;
        this.licensePlate = licensePlate;
    }

    public void stop() {
        System.out.println("Car stopped");
    }

    public void startMoving() {
        System.out.println("Car started moving");
    }

    public void moveStraight() {
        System.out.println("Car moved straight");
    }

    public void turnRight(){
        System.out.println("Car turned right");
    }

    public void turnLeft(){
        System.out.println("Car turned left");
    }

    public void driveOnCrossing() {
        System.out.println("Car drove up to crossroads");
    }
}
