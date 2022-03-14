package racingcar.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @DisplayName("Cars 선언 및 split 테스트")
    @Test
    public void inputStringToCars(){

        assertThat(new Cars("pobi,crong,honux"))
                .usingRecursiveComparison()
                .isEqualTo(new Cars(Arrays.asList(new Car("pobi"), new Car("crong"), new Car("honux"))));

    }

}