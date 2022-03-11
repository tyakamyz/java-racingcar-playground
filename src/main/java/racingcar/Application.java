package racingcar;

import racingcar.model.Racingcar;

import java.io.IOException;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {

        List<Racingcar> racingcars = Racingcar.inputStringToRacingcars(InputView.inputString());
        int round = InputView.inputRound();
        RacingGame racingGame = new RacingGame();

        ResultView.startMessage();
        for (int i = 0; i < round; i++) {
            System.out.println(racingGame.raceProgressReturnScore(racingcars));
        }

        ResultView.endMessage(racingGame.getWinner(racingcars));

    }
}
