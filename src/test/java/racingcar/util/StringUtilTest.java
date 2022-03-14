package racingcar.util;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class StringUtilTest {

    @Test
    public void isBlank(){
        /* null */
        assertThat(StringUtil.isBlank(null)).isEqualTo(true);

        /* 빈문자 */
        assertThat(StringUtil.isBlank("")).isEqualTo(true);
    }
}