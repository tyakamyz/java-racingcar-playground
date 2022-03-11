package racingcar.model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class RacingcarTest {

    @Test
    public void inputStringToRacingcars(){
        assertThat(Racingcar.inputStringToRacingcars("pobi,crong,honux"))
                .usingRecursiveComparison()
                .isEqualTo(Arrays.asList(new Racingcar("pobi"), new Racingcar("crong"),new Racingcar("honux")));
    }
}
