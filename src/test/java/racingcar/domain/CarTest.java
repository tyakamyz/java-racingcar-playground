package racingcar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {

    @Test
    public void move_fail(){

        Car car = new Car("pobi");
        car.move(3);

        assertThat(car.getScore()).isEqualTo(0);
    }

    @Test
    public void move_success(){

        Car car = new Car("pobi");
        car.move(4);

        assertThat(car.getScore()).isEqualTo(1);
    }

}
