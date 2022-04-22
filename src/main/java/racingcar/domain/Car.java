package racingcar.domain;

public class Car {
    private final CarName carName;
    private int position = 0;

    public Car(String name) {
        carName = new CarName(name);
    }

    public MoveStatus command(int command) {
        if (MoveStatus.MOVE.equals(MoveStatus.getStatus(command))) {
            move();
        }
        return MoveStatus.getStatus(command);
    }

    private void move() {
        position++;
    }

    public int getPosition() {
        return position;
    }
}
