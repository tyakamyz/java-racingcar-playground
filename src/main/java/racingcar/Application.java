package racingcar;

import racingcar.domain.Cars;
import racingcar.ui.InputView;
import racingcar.ui.ResultView;

import java.io.IOException;

public class Application {

    public static void main(String[] args) throws IOException {

        Cars cars = new Cars(InputView.inputString());

        int round = InputView.inputRound();

        ResultView.startMessage();
        for (int i = 0; i < round; i++) {
            cars.move();
            cars.nowScore();
            System.out.println();
        }

        ResultView.endMessage(cars.findWinners());

    }
}
