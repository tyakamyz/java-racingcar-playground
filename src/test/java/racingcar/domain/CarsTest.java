package racingcar.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarsTest {

    @DisplayName("Cars 선언 및 split 테스트")
    @Test
    public void inputStringToCars(){

        assertThat(new Cars("pobi,crong,honux"))
                .usingRecursiveComparison()
                .isEqualTo(new Cars(Arrays.asList(new Car("pobi"), new Car("crong"), new Car("honux"))));

    }

    @Test
    public void findWinners(){

        Car car_pobi = new Car("pobi");
        car_pobi.move(4);
        car_pobi.move(4);

        Car car_crong = new Car("crong");
        car_crong.move(4);
        car_crong.move(4);
        car_crong.move(4);

        Car car_honux = new Car("honux");
        car_honux.move(4);
        car_honux.move(4);
        car_honux.move(4);

        Cars cars = new Cars(Arrays.asList(car_pobi, car_crong, car_honux));

        Assertions.assertThat(cars.findWinners()).isEqualTo("crong, honux");
    }

}