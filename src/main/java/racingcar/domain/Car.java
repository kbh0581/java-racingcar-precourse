package racingcar.domain;

public class Car {
    private final CarName carName;

    public Car(String name) {
        carName = new CarName(name);
    }
}
