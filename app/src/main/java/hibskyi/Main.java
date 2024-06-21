package hibskyi;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        testTransportValidation();
        System.out.println();
        startCrossroadsSimulation();
    }

    private static void testTransportValidation() {
        validateTransport(new Car("er", 12, "ВО2341КТ"));
        validateTransport(new Bike("red", -5, "ВО2341КТ"));
        validateTransport(new Bus("red", 12, "wdesd"));
        validateTransport(new Car("red", 12, "ВО2341КТ"));
    }

    private static void validateTransport(Transport transport) {
        try {
            TransportValidator.validate(transport);
            System.out.println("Transport successfully created");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private static void startCrossroadsSimulation() {
        Crossroads cross = new Crossroads();
        Random ran = new Random();

        for(int i=0; i<5; i++)
            cross.driveOnCrossing(randomTransport(ran));

        while (!cross.isEmpty()) {
            if(ran.nextInt(3)==0)
                cross.changeLight();
            cross.leaveCrossing();
            if(ran.nextInt(5)==0)
                cross.driveOnCrossing(randomTransport(ran));
        }
    }

    private static Transport randomTransport(Random ran) {
        String transportType =
        switch (ran.nextInt(3)){
            case 0 -> "bike";
            case 1 -> "car";
            case 2 -> "bus";
            default -> null;
        };
        return TransportFactory.createTransport(transportType);
    }
}
