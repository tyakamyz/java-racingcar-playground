package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {
    private final List<Car> cars;

    public Cars(String inputString) {
        this.cars = inputStringToCars(inputString);
    }

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    private static List<Car> inputStringToCars(String inputString) {

        List<String> inputStringList = Arrays.stream(inputString.split(",")).collect(Collectors.toList());

        List<Car> carList = new ArrayList<>();
        for (String name : inputStringList) {
            carList.add(new Car(name));
        }

        return carList;
    }
}
