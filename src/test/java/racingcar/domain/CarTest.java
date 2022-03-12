package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarTest {

    @DisplayName("문자열을 Racingcar 객체로 변경")
    @Test
    public void inputStringToRacingcars(){
        assertThat(Car.inputStringToRacingcars("pobi,crong,honux"))
                .usingRecursiveComparison()
                .isEqualTo(Arrays.asList(new Car("pobi"), new Car("crong"),new Car("honux")));
    }

    @DisplayName("문자열 유효성 체크")
    @Test
    public void inputStringToRacingcars_validationCheck(){
        assertThatThrownBy(() -> Car
                .inputStringToRacingcars("pobi,recrong,honux"))
                .isInstanceOf(IllegalArgumentException.class);
    }

}
