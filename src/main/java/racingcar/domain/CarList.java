package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;
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

    private int getRandomCommand() {
        return Randoms.pickNumberInRange(
                MoveStatus.COMMAND_RANGE_MIN, MoveStatus.COMMAND_RANGE_MAX);
    }

    public void race() {
        for (Car car : this.getCars()) {
            car.command(getRandomCommand());
        }
    }

    public List<Car> getCars() {
        return carList;
    }
}
