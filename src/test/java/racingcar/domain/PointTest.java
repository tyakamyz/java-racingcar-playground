package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PointTest {

    @Test
    public void CreatePoint(){
        Point point = new Point();

        assertThat(point).isEqualTo(new Point());
    }

    @Test
    void moveStatusByPoints() {
        Point point = new Point();
        point.addPoint();
        point.addPoint();

        assertThat(point.moveStatusByPoints()).isEqualTo("--");
    }
}