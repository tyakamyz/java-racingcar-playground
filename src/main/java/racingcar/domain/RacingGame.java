package racingcar.domain;

import racingcar.util.RandomNumber;

import java.util.List;

public class RacingGame {

    public String raceProgressReturnScore(Cars cars) {

        StringBuilder raceScore = new StringBuilder();

        for (Car car : cars.list()) {
            car.move(RandomNumber.create());

            raceScore.append(raceScoreWrite(car));
            raceScore.append("\n");
        }

        return raceScore.toString();
    }

    private String raceScoreWrite(Car car) {

        return car.currentScore();
    }

    public String getWinners(Cars cars) {

        StringBuilder winners = new StringBuilder();
        int maxScore = findMaxScore(cars.list());

        for(Car car : cars.list()){
            winners.append(car.isWinnerToReturnName(maxScore));
        }

        return winners.substring(0, winners.length() - 2);
    }

    private int findMaxScore(List<Car> cars) {
        int maxScore = 0;

        for(Car car : cars){
            maxScore = car.compareScore(maxScore);
        }

        return maxScore;
    }

}
