package racingcar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Car {

    private static final int STANDARD_NUMBER = 4;

    private final Name name;
    private final Point point;

    public Car(String name) {
        this.name = new Name(name);
        this.point = new Point();
    }

    public static List<Car> inputStringToRacingcars(String inputString) {

        List<String> inputStringList = Arrays.stream(inputString.split(",")).collect(Collectors.toList());

        return inputStringListToRacingcars(inputStringList);

    }

    private static List<Car> inputStringListToRacingcars(List<String> inputStringList) {
        List<Car> racingcarList = new ArrayList<>();

        for (String carName : inputStringList) {
            racingcarList.add(new Car(carName));
        }

        return racingcarList;
    }

    public void move(int randomNumber) {
        if(randomNumber >= STANDARD_NUMBER){
            point.addPoint();
        }
    }

    public String currentScore() {
        return name.getName() + " : " + point.moveStatusByPoints();
    }

    public int compareScore(int maxScore) {
        return Math.max(maxScore, point.getPoint());
    }

    public String isWinnerToReturnName(int maxScore) {
        if(maxScore == point.getPoint()){
            return name.getName() + ", ";
        }

        return "";
    }
}
