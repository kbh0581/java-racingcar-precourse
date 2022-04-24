package racingcar.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(carName, car.carName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carName);
    }
}
