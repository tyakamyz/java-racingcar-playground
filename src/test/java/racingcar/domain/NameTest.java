package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class NameTest {

    @Test
    public void create(){
        assertThat(new Name("pobi")).isEqualTo(new Name("pobi"));
    }

    @Test
    public void create_nullCheck(){
        assertThatThrownBy(() -> new Name("")).isInstanceOf(IllegalArgumentException.class);
    }
}