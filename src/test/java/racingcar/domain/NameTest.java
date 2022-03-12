package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameTest {

    @Test
    public void create_blankCheck(){
        assertThatThrownBy(() -> new Car(""))
                .isInstanceOf(IllegalArgumentException.class);

        assertThatThrownBy(() -> new Car(null))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void create_sizeCheck(){
        assertThatThrownBy(() -> new Car("testcar"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}