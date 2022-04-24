package racingcar.controller;

import racingcar.domain.CarList;
import racingcar.util.MessageUtils;
import racingcar.view.InputView;

public class RaceingcarController {
    private final InputView inputView;

    public RaceingcarController(InputView inputView) {
        this.inputView = inputView;
    }

    /* 차의 이름들을 입력 받는 메서드 */
    public CarList inputCarNames() {
        CarList carList;
        try {
            carList = new CarList(inputView.inputCarName());
        } catch (IllegalArgumentException e) {
            System.out.println(MessageUtils.getErrorMessage(e.getMessage()));
            return inputCarNames();
        }
        return carList;
    }

    public void tryRace(CarList carList) {
        int tryNumber = inputView.inputTry();
        for (int i = 0; i < tryNumber; i++) {
            carList.race();
        }
    }
}
