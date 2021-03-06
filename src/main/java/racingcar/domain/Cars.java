package racingcar.domain;

import racingcar.util.RandomNumber;

import java.util.*;
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

    public String findWinners() {

        StringBuilder winners = new StringBuilder();

        for(Car car : cars){
            winners.append(compareMaxScoreToReturnName(car));
        }

        return winners.substring(0, winners.length() - 2);
    }

    private String compareMaxScoreToReturnName(Car car) {

        if(Score.getMaxScore() == car.getScore()){
            return car.getName() + ", ";
        }

        return "";
    }

    public void move() {
        for(Car car : cars){
            car.move(RandomNumber.create());
        }
    }

    public void nowScore() {
        for(Car car : cars){
            nowScorePrint(car);
        }
    }

    private void nowScorePrint(Car car) {
        System.out.print(car.getName() + ": ");
        for (int i = 0; i < car.getScore(); i++) {
            System.out.print("-");
        }
        System.out.print("\n");
    }
}
