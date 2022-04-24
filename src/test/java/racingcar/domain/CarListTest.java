package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarListTest {


    @Test
    @DisplayName("쉼표를 기준으로 자동차가 생성된다.")
    void carSeperateCommaCreate() {
        CarList carList = new CarList("CAR,NAME,PORT");
        assertThat(carList.getCars().get(0)).isEqualTo(new Car("CAR"));
        assertThat(carList.getCars().get(1)).isEqualTo(new Car("NAME"));
        assertThat(carList.getCars().get(2)).isEqualTo(new Car("PORT"));
        assertThatIllegalArgumentException().isThrownBy(() -> new CarList("CAR,,NAME,PORT"));
    }


}
