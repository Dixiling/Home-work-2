import java.util.Random;
/**
 * Класс робот, наследуется от базового класса созданий.
 * "Тут должна была быть шутка про блестящий зад."
 */
public class Robot extends Creature {
    final private static int MAX_SPEED = 10;
    final private static int MIN_SPEED = 1;
    final private static int MAX_DISTANCE = 10_000;
    final private static int MIN_DISTANCE = 100;
    final private static int MAX_HEIGHT = 500;
    final private static int MIN_HEIGHT = 100;
    private static int robotCount;
    static {
        robotCount=0;
    }

    public Robot(String name, int speed) {
        super(name, speed);
        Creature.rand = new Random();
        this.maxRunDistance = setMaxValue(MAX_DISTANCE,MIN_DISTANCE);
        this.maxJumpHeight = setMaxValue(MAX_HEIGHT,MIN_HEIGHT);

    }

    public Robot(){
        this(setDefaultName("Роберт", ++robotCount), setMaxValue(MAX_SPEED,MIN_SPEED));
    }
}