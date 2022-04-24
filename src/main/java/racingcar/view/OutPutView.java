package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.CarList;

public class OutPutView {

    /**
     * 자동차들의 상태를 출력
     */
    public static void carsStatusPrint(CarList carList) {
        for (Car car : carList.getCars()) {
            System.out.println(car);
        }
        System.out.println();
    }
}
