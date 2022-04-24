package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class CarList {
    private final List<Car> carList = new ArrayList<>();

    public CarList(String carNames) {
        createCars(carNames);
    }

    private void createCars(String carNames) {
        for (String name : carNames.split(",")) {
            carList.add(new Car(name));
        }
    }

    List<Car> getCars() {
        return carList;
    }
}
