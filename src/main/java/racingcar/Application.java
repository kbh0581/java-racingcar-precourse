package racingcar;

import racingcar.controller.RaceingcarController;
import racingcar.view.InputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        RaceingcarController racingcarController =
                new RaceingcarController(inputView);

        racingcarController.tryRace(racingcarController.inputCarNames());
        // TODO: 프로그램 구현
    }
}
