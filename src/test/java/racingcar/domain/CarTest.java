package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("자동차의 이름은 5자이하 이다")
    void validCarNameTest() {
        new Car("3글자");
        assertThatIllegalArgumentException().isThrownBy(()-> new Car("5글자넘는차"));
    }


}
