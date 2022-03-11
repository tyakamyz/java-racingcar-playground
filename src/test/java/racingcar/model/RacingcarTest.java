package racingcar.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class RacingcarTest {

    @DisplayName("문자열을 Racingcar 객체로 변경")
    @Test
    public void inputStringToRacingcars(){
        assertThat(Racingcar.inputStringToRacingcars("pobi,crong,honux"))
                .usingRecursiveComparison()
                .isEqualTo(Arrays.asList(new Racingcar("pobi"), new Racingcar("crong"),new Racingcar("honux")));
    }

    @DisplayName("문자열 유효성 체크")
    @Test
    public void inputStringToRacingcars_validationCheck(){
        assertThatThrownBy(() -> Racingcar
                .inputStringToRacingcars("pobi,recrong,honux"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
