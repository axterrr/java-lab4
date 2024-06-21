package hibskyi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Crossroads {

    private final Queue<Transport> transportStream;
    private boolean greenLight;

    public Crossroads() {
        transportStream = new LinkedList<>();
        greenLight = true;
    }

    public void driveOnCrossing(Transport tr) {
        tr.driveOnCrossing();
        transportStream.add(tr);
    }

    public void leaveCrossing() {
        if(!isEmpty() && greenLight) {
            Transport tr = transportStream.poll();
            switch (new Random().nextInt(3)){
                case 0 -> tr.moveStraight();
                case 1 -> tr.turnRight();
                case 2 -> tr.turnLeft();
            }
        }
    }

    public void changeLight() {
        if(greenLight) {
            System.out.println("Red light");
            for(Transport tr : transportStream)
                tr.stop();
            greenLight = false;
        }
        else {
            System.out.println("Green light");
            for(Transport tr : transportStream)
                tr.startMoving();
            greenLight = true;
        }
    }

    public boolean isEmpty() {
        return transportStream.isEmpty();
    }
}

