package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car("움직이는차");
    }

    @Test
    @DisplayName("자동차의 이름은 5자 이하 이며 공백이 될 수 없다")
    void validCarNameTest() {
        new Car("3글자");
        assertThatIllegalArgumentException().isThrownBy(()-> new Car("5글자넘는차"));
        assertThatIllegalArgumentException().isThrownBy(()-> new Car(""));
        assertThatIllegalArgumentException().isThrownBy(()-> new Car(null));
    }

    @Test
    @DisplayName("숫자의 값이 4이상일경우 전진 3이하일 경우 멈춘다")
    void moveStatus4OverRunElseStop() {
        int moveCommand = 4;
        int stopCommand = 3;
        assertThat(MoveStatus.MOVE).isEqualTo(car.command(moveCommand));
        assertThat(MoveStatus.STOP).isEqualTo(car.command(stopCommand));
        assertThat(MoveStatus.MOVE).isEqualTo(car.command(moveCommand));
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("숫자의 값은 0 ~ 9 만 가능하다.")
    void moveStatusCommandIs0_9() {
        car.command(9);
        assertThatIllegalArgumentException().isThrownBy(() -> car.command(-1));
        assertThatIllegalArgumentException().isThrownBy(() -> car.command(10));
    }

    @Test
    @DisplayName("차이름이 같으면 같은 차이다")
    void equalCar() {
        assertThat(new Car("자동차")).isEqualTo(new Car("자동차"));
        assertThat(new Car("자동차")).isNotEqualTo(new Car("자동차2"));
    }

}
