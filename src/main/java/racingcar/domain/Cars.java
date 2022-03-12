package racingcar.domain;

import java.util.List;

public class Cars {

    private final List<Car> list;

    public Cars(String carNames) {
        this.list = Car.inputStringToRacingcars(carNames);
    }

    public List<Car> list(){
        return this.list;
    }
}
