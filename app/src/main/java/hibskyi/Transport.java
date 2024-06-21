package hibskyi;

@FactoryGenerator
public interface Transport {

    void stop();

    void startMoving();

    void moveStraight();

    void turnRight();

    void turnLeft();

    void driveOnCrossing();
}
