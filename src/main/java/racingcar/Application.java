package racingcar;

import racingcar.domain.Cars;
import racingcar.domain.RacingGame;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        Cars cars = new Cars(InputView.inputString());

        int round = InputView.inputRound();
        RacingGame racingGame = new RacingGame();

        ResultView.startMessage();
        for (int i = 0; i < round; i++) {
            System.out.println(racingGame.raceProgressReturnScore(cars));
        }

        ResultView.endMessage(racingGame.getWinners(cars));

    }
}
